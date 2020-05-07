package jcm.examples.socket.ex03ClientServerCient;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SocketOutput {

	/****
	 * TODO: add 2 argument
	 * String stFileName
	 * String output
	 * 
	 * -or-
	 * just output
	 * filename will be default "output.txt"
	 */
	
	public void writeToFile() {
	    try {
		      FileWriter myWriter = new FileWriter("filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }		
	}
	
	public SocketOutput() {
		// TODO Auto-generated constructor stub
	}

}
