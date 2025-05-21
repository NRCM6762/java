package Day_1;

public class Test2 {
	int x=67,y=89;//instance
	static int p=45,q=12;
	void div() {
		int a=9,b=10;
		System.out.println(x+y);
		System.out.println(p+q);
		System.out.println(a+b);
	} 
	static void show() {
		int a=8,b=6;
		System.out.println(p+q);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Test2 t2=new Test2();
		t2.div();
	

	}

}
