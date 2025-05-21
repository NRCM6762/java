package Day_2;

public class Demo9 {
	int x;
	int y;
	public Demo9(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo9(Demo9 d1) {
		this.x=d1.x;
		this.y=d1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo9 d1=new Demo9(45,23);
        Demo9 d2=new Demo9(d1);
	}

}
