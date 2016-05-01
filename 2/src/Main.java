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
	static String str, w1, w2;
	static int length, distance = 0, nWords = 0;

	static ArrayList<Word> words = new ArrayList<Word>();

	public static void main(String[] args) {
		readInputFile();
		writeOutputFile(createOutStr());

	}

	private static String createOutStr() {
		if (nWords >= 2) {
			for (int i = 0; i < words.size(); i++) {
				for (int k = i + 1; k < words.size(); k++) {
					int d = words.get(i).getDistance(words.get(k));
					if (d > distance) {
						distance = d;
						w1 = words.get(i).getWord();
						w2 = words.get(k).getWord();
					}
				}
			}
			return w1 + " " + w2;
			
		} else
			return "мер";
	}

	private static void readInputFile() {
		try {
			scn = new Scanner(new File("res//input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		str = scn.nextLine();
		length = scn.nextInt();
		String[] Str = str.split(" ");
		for (String s : Str)
			if (!s.isEmpty() && s.length() == length) {
				words.add(new Word(s));
				nWords++;
			}
	}

	private static void writeOutputFile(String str) {
		try {
			f = new Formatter("res//output.txt");
			f.format(str);
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
