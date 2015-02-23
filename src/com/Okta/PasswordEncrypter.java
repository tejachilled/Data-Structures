package com.Okta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ravi Teja Thutari
 *
 */
public class PasswordEncrypter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String inputFile = "C:/Users/tejj/Desktop/okta/say.in.txt"; // Give input file path here
		final String outputFile = "C:/Users/tejj/Desktop/okta/say.out1.txt"; // give output file path
		ArrayList<String> inputList = ReadInputFile(inputFile); // read from input file and store in array list
		ArrayList<String> outputList = PasswordValidate(inputList); // validate every password and store it in output list
		WriteoutputFile(outputList,outputFile);  //write to a output file

	}

	/**
	 * Method to write to a output file
	 * @param outputList
	 * @param outputFile
	 */
	private static void WriteoutputFile(ArrayList<String> outputList,String outputFile) {
		// TODO Auto-generated method stub
		BufferedWriter output = null;
		try {
			File file = new File(outputFile);
			 output = new BufferedWriter(new FileWriter(file));
			for(String word: outputList){
				output.write(word);
				output.write(System.lineSeparator());
			}			
		} catch ( IOException e ) {
			e.printStackTrace();
		}finally{
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/**
	 * A method to validate the user input
	 * @param inputList
	 * @return ArrayList<String>
	 */
	private static ArrayList<String> PasswordValidate(ArrayList<String> inputList) {
		// TODO Auto-generated method stub
		ArrayList<String> outputList = new ArrayList<String>();
		String pattern = "(?=.*[aeiou])(?!.*[aeiou]{3})(?!.*[a-z&&[^aeiou]]{3})(?!.*([a-z&&[^eo]])\\1).*";
		for(String word: inputList){
			if(word.matches(pattern)) outputList.add("<"+word+">"+" is acceptable");
			else outputList.add("<"+word+">"+" is not acceptable");
		}
		return outputList;
	}

	/**
	 * Method to read input file
	 * @param fileName
	 * @return ArrayList<String>
	 */
	private static ArrayList<String> ReadInputFile(String fileName) {
		// TODO Auto-generated method stub
		BufferedReader buffer = null;
		ArrayList<String> list = null;
		try {
			buffer = new BufferedReader(new FileReader(fileName));
			list = new ArrayList<String>();
			String newLine = buffer.readLine();

			while (newLine != null) {
				list.add(newLine);
				newLine = buffer.readLine();
			}
		}catch(FileNotFoundException exp){
			exp.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

}
