package de.denschu.runkeeper;


public class RunkeeperRunner {

	public static void main(String[] args) throws Exception {
		args = new String[] { "-convert", "src/test/resources/example.tcx"};
		Runkeeper.main(args);
	}
	
}
