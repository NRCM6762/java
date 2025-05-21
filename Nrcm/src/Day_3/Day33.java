package Day_3;

public class Day33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable r1=new Runnable() {
        	public void run() {
        		for(int i=0;i<3;i++) {
        		System.out.println("Task One");
        		}
        	}
        };
        Runnable r2=new Runnable() {
        	public void run() {
        		System.out.println("Task Two");
        	}	
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
	}

}
