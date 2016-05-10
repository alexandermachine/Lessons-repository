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
		createOutputFile(getResult());
	}

	private static String getResult() {
		int bigestInterval = 0, interval = 0;		//наибольший интервал монотонности, текущий интервал монотонности
		int iStart = 0;								//индекс начала наибольшего интервала
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
		
		func.get(0).setExtremum(true);				//первую точку помечаем как экстремум
		func.get((func.size()-1)).setExtremum(true);//последнюю точку помечаем как экстремум
		Function prewX = func.get(0); 				//предыдущее значение
		boolean incFunc = false;					//переменная которая показывает направление функции (true - возрастащая, false - убывающая),
													//по умолчанию ставим ее как убывающую
		
		// ----------находим точки экстреума----------
		for (Function f : func) {
			if (incFunc) {						//возрастающая функция:
				if (f.getX() >= prewX.getX())	//если текущее значение больше либо равно предыдущего, 
					prewX.setExtremum(false);	//значит функция возрастающая,
				else {							//если это не так,
					prewX.setExtremum(true);	//то помечаем эту точку какэкстремум
					incFunc = false;			//и помечаем что функция теперь убываэщая
				}
			} else {							//убываэщая функция:
				if (f.getX() <= prewX.getX())	//то же самое только наоборот
					prewX.setExtremum(false);
				else {
					prewX.setExtremum(true);
					incFunc = true;
				}
			}
			prewX = f;
		}
		// ----------находим точки экстреума----------
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
