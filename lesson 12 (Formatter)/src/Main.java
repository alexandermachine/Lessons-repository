import java.util.Formatter;
import java.util.Scanner;

public class Main {
	static Scanner scn;
	static Formatter f;
	public static void main(String[] args) {
		try{
			f = new Formatter("res//file.txt");
			scn = new Scanner(System.in);
			System.out.println("���  ��� �����?");
			String name = scn.next();
			System.out.println("������� ��� ���?");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("��� �� ������?");
			String city = scn.next();
			f.format("%s %d %s", name,a,city);
			f.close();
			
		}catch(Exception e){};

	}

}
