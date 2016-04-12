import java.util.Formatter;
import java.util.Scanner;

public class Main {
	static Scanner scn;
	static Formatter f;
	public static void main(String[] args) {
		try{
			f = new Formatter("res//file.txt");
			scn = new Scanner(System.in);
			System.out.println("Как  вас зовут?");
			String name = scn.next();
			System.out.println("Сколько вам лет?");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("Где вы живете?");
			String city = scn.next();
			f.format("%s %d %s", name,a,city);
			f.close();
			
		}catch(Exception e){};

	}

}
