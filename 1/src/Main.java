//Eclipse IDE for Java Developers	Version: Mars.2 Release (4.5.2)	Build id: 20160218-0600


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static Formatter f;
	static Scanner scn;
	static int[][] matrix;
	static int col = 0, row = 0;
	static Random r;
	static boolean[] goodCol;

	public static void main(String[] args) {
		fillMatrix();
		computing();
		createOutputFile();

	}

	private static void computing() {
		// ----------определение столбцов с попарно различными числами----------
		goodCol = new boolean[col];
		for (int j = 0; j < col; j++) {
			goodCol[j] = true;
			nextCol: for (int i = 0; i < row; i++) { // Параметр goodCol
														// характеризует столбцы
														// матрицы
				for (int k = i + 1; k < row; k++) { // (true - в столбце попарно
													// различные числа).
					if (matrix[i][j] == matrix[k][j]) {
						goodCol[j] = false;
						break nextCol;
					}
				}
			}
		}
		// ----------определение столбцов с попарно различными числами----------
	}

	private static void fillMatrix() {
		// ----------Определение размера будущей матрицы----------
		String line;
		boolean prevIsNumeral = false;
		openFile();
		while (scn.hasNextLine()) {
			line = scn.nextLine();
			if (row == 0) { // При первом проходе определяем кол-во столбцов,
				for (int j = 0; j < line.length(); j++) { // затем просто
															// считаем кол-во
															// строк.
					char nextSimbol = line.charAt(j); // Параметр prevIsNumeral
														// означает что
														// предидущий символ был
														// число
					if (Character.isDigit(nextSimbol) & !prevIsNumeral) {
						prevIsNumeral = true;
						col++;
					} else if (!Character.isDigit(nextSimbol) & prevIsNumeral) {
						prevIsNumeral = false;
					}
				}
			}
			row++;
		}
		matrix = new int[row][col];
		// ----------Определение размера будущей матрицы----------

		// ----------Население матрицы числами----------
		openFile();
		for (int i = 0; i < row; i++) {
			for (int j = 0; (j < col) & scn.hasNext(); j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		// ----------Население матрицы числами----------
	}

	private static void openFile() {
		try {
			scn = new Scanner(new File("res//input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void createOutputFile() {
		try {
			f = new Formatter("res//output.txt");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (goodCol[j])
						f.format(Integer.toString(matrix[i][j]) + "\t");
					else
						f.format("\t");
				}
				f.format("\n");
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
