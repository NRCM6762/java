package Day_2;

public class Demo10 {
	int x;
	int y;
	int z;
	public Demo10() {
		System.out.println("hi");
	}
	public Demo10(int x) {
		this.x=x;
		System.out.println(x);
	}
	public Demo10(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo10(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d1=new Demo10();
		Demo10 d2=new Demo10(2);
		Demo10 d3=new Demo10(2,3);
		Demo10 d4=new Demo10(2,3,4);
	}

}
