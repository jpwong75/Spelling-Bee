
import java.io.*;

public class BeeTester {
	public static void main (String [] args) throws FileNotFoundException {
		char [] array = {'c','a','y','i','f','e','n'};

		Bee bee = new Bee (array, "english3.txt");
		System.out.println (bee.getOutputs());
	}
}
