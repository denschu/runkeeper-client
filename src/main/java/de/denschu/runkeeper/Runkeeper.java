package de.denschu.runkeeper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.denschu.runkeeper.domain.NewFitnessActivity;
import de.denschu.runkeeper.services.FitnessActivityService;
import de.denschu.runkeeper.transformer.GpxTransformer;
import de.denschu.runkeeper.transformer.TcxTransformer;

public class Runkeeper {

	/**
	 * Main Application Class
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		CommandLineParser parser = new BasicParser();
		CommandLine commandLine = null;
		HelpFormatter helpFormatter = new HelpFormatter();
		try {
			Options options = new Options();
			options.addOption("h", "help", false, "shows this help text");
			options.addOption("upload", true, "upload the given gpx or tcx file to Runkeeper");
			options.addOption("convert", true, "converts the given gpx or tcx file to the Runkeeper format");
			options.addOption("a", true, "the access token");
			commandLine = parser.parse(options, args);
			if (commandLine.hasOption('h')) {
				helpFormatter.printHelp("Runkeeper Shell", options);
				return;
			}
		} catch (ParseException pvException) {
			System.out.println(pvException.getMessage());
			return;
		}
		if (commandLine.hasOption("upload")) {
			String fileArg = commandLine.getOptionValue("upload");
			File file = new File(fileArg);
			if (commandLine.hasOption("a")) {
				String accessToken = commandLine.getOptionValue("a");
				if (fileArg.endsWith("gpx")) {
					new FitnessActivityService().createFitnessActivityFromGpx(accessToken, file);
				}
				if (fileArg.endsWith("tcx")) {
					new FitnessActivityService().createFitnessActivityFromTcx(accessToken, file);
				}
				System.out.println("Upload successful!");
				return;
			}
			else{
				System.out.println("Access Token missing!");
				return;
			}
		}
		if (commandLine.hasOption("convert")) {
			String fileArg = commandLine.getOptionValue("convert");
			File file = new File(fileArg);
			if (fileArg.endsWith("gpx")) {
				NewFitnessActivity activity = new GpxTransformer().transform(file);
				new ObjectMapper().writeValue(System.out, activity);
				return;
			}
			if (fileArg.endsWith("tcx")) {
				NewFitnessActivity activity = new TcxTransformer().transform(file);
				new ObjectMapper().writeValue(System.out, activity);
				return;
			}
		}
		System.out.println("No options selected (convert, upload)!");
	}
}
