package Day_2;
class Sample45{
	public Sample45() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}
public class Demo29 extends Sample45{
	public Demo29() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo29 d1=new Demo29();
        d1.show();
	}

}
