import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static String mas[][] = new String[5][3];
	static Scanner scn;
	public static void main(String[] args) {
		openFile();
		readFile();
		out();

	}

	private static void out() {
		for(int i = 0; i<mas.length;i++){
			for(int j = 0; j<mas[i].length;j++){
				System.out.print(mas[i][j]+ '\t');
			}
			System.out.println();
		}
		
	}

	private static void readFile() {
		while(scn.hasNext()){
			for(int i = 0; i<mas.length;i++){
				for(int j = 0; j<mas[i].length;j++){
					mas[i][j] = scn.next();
				}
			}
		}
		
	}

	private static void openFile() {
		try {
			scn = new Scanner(new File("res//file.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
