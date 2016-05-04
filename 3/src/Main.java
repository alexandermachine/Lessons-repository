//Eclipse IDE for Java Developers	Version: Mars.2 Release (4.5.2)	Build id: 20160218-0600


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
	static Scanner scn;
	static Formatter f;
	static ArrayList<Function> func = new ArrayList<Function>();

	public static void main(String[] args) {
		readInputFile();
		findExtremum();
		createOutputFile(longestInterval());
	}

	private static String longestInterval() {
		int bigestInterval = 0, interval = 0;
		int iStart = 0;
		String result = " ";
		for (int i = 0; i < func.size(); i++) {
			interval++;
			if (func.get(i).isExtremum()) {
				if (interval > bigestInterval) {
					bigestInterval = interval;
					iStart = i - interval;
				}
				interval = 0;
			}
		}
		for (int i = iStart; i <= iStart + bigestInterval; i++) {
			result += Integer.toString(func.get(i).getX()) + " ";
		}
		return result;
	}

	private static void findExtremum() {
		func.get(0).setExtremum(true);
		Function prewX = func.get(0);
		boolean incFunc = false;
		for (Function f : func) {
			if (incFunc) {
				if (f.getX() >= prewX.getX())
					prewX.setExtremum(false);
				else {
					prewX.setExtremum(true);
					incFunc = false;
				}
			} else {
				if (f.getX() <= prewX.getX())
					prewX.setExtremum(false);
				else {
					prewX.setExtremum(true);
					incFunc = true;
				}
			}
			prewX = f;
		}
	}

	private static void createOutputFile(String outStr) {
		try {
			f = new Formatter("res\\output.txt");
			f.format(outStr);
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void readInputFile() {
		try {
			scn = new Scanner(new File("res\\input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scn.hasNext()) {
			func.add(new Function(scn.nextInt()));
		}
	}
}
