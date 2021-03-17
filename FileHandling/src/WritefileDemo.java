import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class WritefileDemo {
	public static void main(String[] args) {
		demo1();
	}
	private static void demo1() {
		Writer out;
		try {
			out = new FileWriter("output.txt");
			BufferedWriter bufferedwriter = new BufferedWriter(out);
			bufferedwriter.write("Writing into a file");
			bufferedwriter.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
