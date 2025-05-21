package Day_2;

public class Demo25 {
	public static void main() {
		System.out.println("hello ");
	}
	public static void main(int a) {
		System.out.println(a);
	}
	public static void main(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(int a,int b,double d) {
		System.out.println(a+b-d);
    }
	public static void main(String[] args) {
		main();
		main(2);
		main(4,6);
		main(7,3,5);
	}
}