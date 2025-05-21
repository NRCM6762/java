package Day_3;

public class Day34 extends Thread{
        public void run() {
        	for( int i=0;i<=10;i++) {
        		System.out.println(i);
        		if(i==5) {
        			try {
        				Thread.sleep(2000);
        			} catch (InterruptedException e) {
        				e.printStackTrace();
        			}
        		}
        	}
        }
	public static void main(String[] args) {
		Day34 d1=new Day34();
		d1.start();
	}
}
