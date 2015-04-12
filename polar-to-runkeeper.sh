#!/bin/bash

# Remove files
rm polar.tcx
rm tcx.zip

# Source config
source polar-to-runkeeper.config

# Login and download cookie
curl -d "returnUrl=https%3A%2F%2Fflow.polar.com%2F&email=$POLAR_EMAIL&password=$POLAR_PASSWORD" --cookie polarcookie.txt --cookie-jar polarcookie.txt https://flow.polar.com/login

# Get trainings as JSON from today
#today=`date +%d.%m.%Y`
#today="05.03.2015"
#curl --cookie polarcookie.txt "https://flow.polar.com/training/getCalendarEvents?start=$today&end=$today"

echo "Downloading training from Polar Flow"
curl -o tcx.zip --cookie polarcookie.txt "https://flow.polar.com/training/analysis/$1/export/tcx"

# Unzip archive 
unzip -l -o -p tcx.zip *.tcx > polar.tcx

echo "Uploading training to Runkeeper"
java -jar target/runkeeper-client-0.0.1-SNAPSHOT.jar -upload polar.tcx -a $RUNKEEPR_ACCESS_TOKEN
