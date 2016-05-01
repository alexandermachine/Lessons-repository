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
	static int length, distance = 0;

	static ArrayList<Word> words = new ArrayList<Word>();

	public static void main(String[] args) {
		readInputFile();
		computing();
		createOutputFile();

	}

	private static void computing() {
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
		System.out.println(distance);
		System.out.println(w1);
		System.out.println(w2);

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
		for (String s : Str)
			if (!s.isEmpty() && s.length() == length) {
				words.add(new Word(s));
				System.out.print(s + "|");
			}
	}

	private static void createOutputFile() {
		System.out.println("формирование выходного файла");
		try {
			f = new Formatter("res//output.txt");
			if (distance > 0){
				System.out.println("расстояние больше нуля");
				f.format(w1 + " " + w2);
			}
			else{
				System.out.println("расстояние равно нуля");
				f.format("НЕТ");
			}				
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("файл не создан");
			e.printStackTrace();
		}
	}

}
