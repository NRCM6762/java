package Day_3;

public class Day23 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Day23 t1=new Day23();
        Thread p1=new Thread(t1);
        Thread p2=new Thread(t1);
        System.out.println("hello");
        p1.start();
        p2.start();
	}

}
