package task11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileException {

	public static void main(String[] args) {
	
		// Object creation is done for the class FileException

		FileException obj = new FileException();
		
		//Calling ReadData Method 

		obj.readData();

	}

	//Creation of method ReadData
	public void readData() {
		
		//variable value is created in String data type 
		
		String value = null;
		
		
		Properties prop = new Properties();

		//try & Catch block is implemented in FileinputStream class for file
		try {

			//File not found Exception is used 
			//File path is implemented in FileInputStream class
			
			FileInputStream ip = new FileInputStream("C:\\Users\\santh\\Desktop\\JavaFile.txt");
			prop.load(ip);

		} catch (FileNotFoundException e) {

			System.out.println("File does not exits");

			e.printStackTrace();
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		//if the file path is found name will be executed

		value = prop.getProperty("name");
		
		System.out.println(value);
	}

}
// Output - File does not exits
