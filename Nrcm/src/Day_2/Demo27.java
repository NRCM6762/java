package Day_2;
interface I1{
	void add();
	void sub();
}
interface I2{
	void add();
}
public class Demo27 implements I1,I2 {
	public void add() {
		System.out.println("hello");
	}
	public void sub() {
		System.out.println("hii");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo27 d1=new Demo27();
        d1.add();
        d1.sub();
	}

}
//two interface one class