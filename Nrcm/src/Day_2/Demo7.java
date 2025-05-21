package Day_2;

public class Demo7 {
	int a=89;
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		this.add();
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 t1=new Demo7();
		t1.sub();

	}

}
//importance of this