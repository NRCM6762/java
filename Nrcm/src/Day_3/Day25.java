package Day_3;

public class Day25 implements Runnable {
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Day24 t1=new Day24();
        Thread t2=new Thread(t1);
        System.out.println("hello");
        t2.start();
	}

}
