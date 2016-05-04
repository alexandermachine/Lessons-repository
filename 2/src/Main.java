//Eclipse IDE for Java Developers	Version: Mars.2 Release (4.5.2)	Build id: 20160218-0600


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static Formatter f;
	static Scanner scn;
	static ArrayList<Word> words = new ArrayList<Word>();
	static Word w = new Word();

	public static void main(String[] args) {
		readInputFile();
		writeOutputFile(w.getResult());
	}



	private static void readInputFile() {
		try {
			scn = new Scanner(new File("res//input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String inputStr = scn.nextLine();
		int lengthWord = scn.nextInt();
		for (String s : inputStr.split(" ")) 			
			if (!s.isEmpty() && s.length() == lengthWord) {
				w.addW(s);
			}
	}

	private static void writeOutputFile(String outStr) {
		try {
			f = new Formatter("res//output.txt");
			f.format(outStr);
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
