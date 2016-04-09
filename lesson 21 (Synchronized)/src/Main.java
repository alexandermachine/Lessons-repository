
public class Main {
	public static int number;
	
	
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Worker());
		Thread t2 = new Thread(new Worker());
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(number);

	}
	
	//— помощью модификатора "synchronized" к методу может обратитьс€ одновременно только один поток.
	//¬торой и последующие потоки, если они есть, будут ждать очереди
	public static synchronized void increasNumber(){
		number++;
	}

}
