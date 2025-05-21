package Day_2;
interface archana{
	void add();
}
class Test56 {
	void sub() {
		System.out.println("hello");
	}
}
public class Demo28 extends Test56 implements archana {
	public void add() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo28 d1=new Demo28();
        d1.add();
        d1.sub();	
        }

}
