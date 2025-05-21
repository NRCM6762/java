package Day_2;

public class Demo13 {
	int ssc;
	int inter;
	int btech;
	public Demo13() {
		System.out.println("hi");
	}
	public Demo13(int ssc) {
		this.ssc=ssc;
		System.out.println(ssc);
	}
	public Demo13(int ssc,int inter) {
		this.ssc=ssc;
		this.inter=inter;
		System.out.println(ssc+inter);
	}
	public Demo13(int ssc,int inter,int btech) {
		this.ssc=ssc;
		this.inter=inter;
		this.btech=btech;
		System.out.println(ssc+inter+btech);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo13 d1=new Demo13();
		Demo13 d2=new Demo13(98);
		Demo13 d3=new Demo13(98,96);
		Demo13 d4=new Demo13(98,96,78);
	}

}