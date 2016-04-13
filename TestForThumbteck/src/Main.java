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

	static Pattern pattern = Pattern.compile("\\d+");
	static String word = "test123test444test"; // мой пример строки
	static Matcher matcher;

	static ArrayList<String> str = new ArrayList<String>();
	// static ArrayList<String> ranks = new ArrayList<String>();

	public static void main(String[] args) {
		createInputFile();
		fillMatrix();
		computing();
		createOutputFile();

	}

	private static void createInputFile() {
		try {
			f = new Formatter("res//input.txt");
			r = new Random();
			String[][] matr = new String[(r.nextInt(3) + 3)][(r.nextInt(3) + 3)];
			for (int i = 0; i < matr.length; i++) {
				for (int j = 0; j < matr[i].length; j++) {
					matr[i][j] = Integer.toString(r.nextInt(10) + 10);
					f.format(matr[i][j] + " ");
				}
				f.format("\n");
			}
			f.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void computing() {
		goodCol = new boolean[col];
		for (int j = 0; j < col; j++) {
			goodCol[j] = true;
			nextCol: for (int i = 0; i < row; i++) {
				for (int k = i + 1; k < row; k++) {
					if (matrix[i][j] == matrix[k][j]) {
						goodCol[j] = false;
						break nextCol;
					}
				}
			}
			System.out.print(j + "th column is good . It's " + goodCol[j] + '\n');
		}
	}

	private static void fillMatrix() {

		// ----------Определение размера матрицы----------
		openFile();
		boolean itsNumeral = false;
		while (scn.hasNextLine()) {
			String line = scn.nextLine();
			if (row == 0) {
				for (int j = 0; j < line.length(); j++) {
					char nextSimbol = line.charAt(j);
					if (Character.isDigit(nextSimbol) & !itsNumeral) {
						itsNumeral = true;
						col++;
					} else if (!Character.isDigit(nextSimbol) & itsNumeral) {
						itsNumeral = false;
					}
				}
			}
			row++;
		}
		System.out.println(row + " " + col);
		matrix = new int[row][col];
		// ----------Определение размера матрицы----------

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
		// String path = String.valueOf(Main.class.getResource(""));
		// path = path.replace("bin/","res/")+"input.txt";
		try {
			scn = new Scanner(new File("res//input.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// System.out.println(path);
		}

	}

	private static void createOutputFile() {
		try {
			f = new Formatter("res//output.txt");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if(goodCol[j])
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
