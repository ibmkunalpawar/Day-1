import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	public static void main(String[] args) {
	//	demo1();
	//	readingLine;
	}
	
	private static void readingline() {
	try {
		Reader reader = new FileReader("./input.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		while(line != null) {

			
			System.out.println(line);
			line = bufferedReader.readLine();
			
		}	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
	
	}
	}}
	
