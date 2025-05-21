package Day_3;

class Test extends Thread{
	public void run() {
		System.out.println("hey");
	}
}
class Test02 extends Test{
	public void run() {
		System.out.println("hello");
	}
}
class Test03 implements Runnable{
	public void run() {
		System.out.println("good morning");
	}
}
class Test4 extends Test3{
	public void run() {
		System.out.println("Sujana");
	}
}
class Day32 {
	public static void main(String[] args) {
		Test t1=new Test();
		Test02 t2=new Test02();
		Test03 t3=new Test03();
		Test4 t4=new Test4();
		t1.start();
		t2.start();
		Thread t7=new Thread(t3);
		t7.start();
		Thread t5=new Thread(t4);
		t5.start();
	}
}
