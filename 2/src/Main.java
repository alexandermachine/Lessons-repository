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
		
		
		
		System.out.println();
		w.printW();
	}

	private static String createOutStr() {
		int distance = 0;
		Word w1, w2;
		if (words.size() < 2)
			return "мер";
		for (int i = 0; i < words.size(); i++) {
			w1 = words.get(i);
			for (int k = i + 1; k < words.size(); k++) {
				w2 = words.get(k);
				int d = w1.getDistance(w2);
				if (d > distance) {
					distance = d;
				}
			}
		}

		return "";// w1.getWord() + " " + w2.getWord();
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
				words.add(new Word(s));
				System.out.print(s + " | ");
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
