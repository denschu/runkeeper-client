# Runkeeper Client for Java

## Build

mvn package

## Use Runkeeper Client through shell

java -jar target/runkeeper-client-0.0.1-SNAPSHOT.jar -convert polar.tcx > runkeeper.json
java -jar target/runkeeper-client-0.0.1-SNAPSHOT.jar -upload polar.tcx -a $4

## Use directly as Maven Dependency

See https://jitpack.io/

## Sync Polar training with Runkeeper

./polar-to-runkeeper.sh <polar-training-id> <email> <password> <access_token>

## Authentication

### Get code to obtain access token

Open browser and confirm access to your account

https://runkeeper.com/apps/authorize?client_id=<your-client-id>&response_type=code&redirect_uri=http%3A%2F%2Flocalhost%3A3001%2Fback 

Extract code from redirect URL

http://localhost:3001/back?code=<your-code>

### Get access_token

curl https://runkeeper.com/apps/token -d "grant_type=authorization_code&code=<your-code>&client_id=<your-client-id>&client_secret=<your-client-secret>&redirect_uri=http%3A%2F%2Flocalhost%3A3001%2Fback" 

## cURL commands for testing

### GET User Info

curl -i https://api.runkeeper.com/user?access_token=<your-access-token>

### GET Profile

curl -i https://api.runkeeper.com/profile?access_token=<your-access-token>

### GET FitnessActivities

curl -i https://api.runkeeper.com//fitnessActivities?access_token=<your-access-token>

### GET FitnessActivity

curl -o fitnessActivity.rk -i https://api.runkeeper.com//fitnessActivities/522434266?access_token=<your-access-token>

### POST FitnessActivity

#### Simple
curl -X POST -H "Content-Type: application/vnd.com.runkeeper.NewFitnessActivity+json" --data "{'start_time':'Thu, 4 Mar 2015 16:49:49','type':'Running','duration':3389.0,'notes':'Imported'}" -i https://api.runkeeper.com//fitnessActivities?access_token=<your-access-token>

#### From file
curl -H "Content-Type: application/vnd.com.runkeeper.NewFitnessActivity+json" --data "@output.json" -i https://api.runkeeper.com//fitnessActivities?access_token=<your-access-token>



