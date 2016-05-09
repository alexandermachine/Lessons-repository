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
		}													//Из файла input.txt берем и 
		String inputStr = scn.nextLine();					//сохраняем строку с предложением, а так же
		int lengthWord = scn.nextInt();						//числовую переменную, которая определяет длину интерисующих слов.
		for (String s : inputStr.split(" ")) 				//Разбив строку по словам,
			if (s.length() == lengthWord) {					//ищем среди них слова нужной длины и
				w.add(s);									//добавляем их в лист.
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
