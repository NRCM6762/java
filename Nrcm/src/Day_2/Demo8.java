package Day_2;

public class Demo8 {
	int a=30;
	int b=40;
	public Demo8(int x, int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8 d1=new Demo8(78,34);
        d1.add();
	}

}
