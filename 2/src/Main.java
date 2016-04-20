import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	static Formatter f;
	static Scanner scn;
	static ArrayList<String> word = new ArrayList<String>();
	static String str;
	static int length;

	public static void main(String[] args) {		
		readInputFile();
//		computing();
//		createOutputFile();
		
	}

	private static void computing() {
		for(String s: word){
		}
	}

	private static void readInputFile() {
		try {
			scn = new Scanner(new File("res//input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		str = scn.nextLine();
		length = scn.nextInt();	
		System.out.println(str);
		String[] Str = str.split(" ");
		for(String s:Str)
			if(!s.isEmpty())
				System.out.print(s+"/");
	}

	private static void createOutputFile() {
		try {
			f = new Formatter("res//output.txt");
			f.format("\n");
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
