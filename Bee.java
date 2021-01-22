import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;


public class Bee {
	private char[] letters;
	private String fileName;
	private Scanner scan;

	
	public Bee (char [] letters, String fileName) throws FileNotFoundException {
		this.fileName = fileName;
		this.letters = letters;
				
	}	
	public ArrayList <String> getOutputs() throws FileNotFoundException{
		ArrayList outputs = new ArrayList <String> ();
		scan = new Scanner(new FileReader(fileName));
		while (scan.hasNext () ) {
			String word = scan.next();
			int tot = 0;
			for (int i = 0; i  < word.length(); i ++) {					
				char r = word.charAt(i);
				if (r == letters[0] || r == letters[1] || r == letters[2] || r == letters[3] || r == letters[4] || r == letters[5] || r == letters[6]) {
					tot ++;
				}
				if (word.contains(""+letters[6]) && tot == word.length()&& word.length() >= 5) {
					outputs.add(word);			
				}	
			}								
		}
		System.out.println( outputs.size());
		return outputs;
	}
	
	
}
