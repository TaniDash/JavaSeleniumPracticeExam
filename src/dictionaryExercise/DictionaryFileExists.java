package dictionaryExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryFileExists {
	String path = "data\\dictionary.txt";

	public static void main(String[] args) throws IOException {

		DictionaryFileExists df = new DictionaryFileExists();

		df.doesFileExist(df.path);

				
		File f1 = new File(df.path);
		
		FileWriter fw= new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Apple-a fruit, a tech firm");
		bw.newLine();
		bw.write("Table-an object, contains rows and columns when used in context of computers");
		bw.newLine();
		bw.write("Orange-a fruit");
		bw.newLine();
		bw.close();
		
		
		List<String> allLines = new ArrayList<String>();
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);

		String line = "";
		int i=1;

		
		while ((line = br.readLine()) != null) {
			allLines.add(line);
		
		
		String[] splitLine= line.split("-");
		String[] meaning= splitLine[1].split(",");
		
		System.out.println("Word" + i + ": " + splitLine[0].trim());
		i++;

		for(int j=0; j < meaning.length; j++)
		{
    		System.out.println("Meaning" + (j + 1) + ": " + meaning[j].trim());
		}

		}
	}

	public void doesFileExist(String p) {

		File f = new File(path);

		if (f.exists()) {
			System.out.println("File exists.");
		} else {
			System.out.println("File does not exist!");
		}
	}

	

	
}
