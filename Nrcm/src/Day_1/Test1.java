package Day_1;

 class Test1 {
	int x=67,y=89;
	static int p=45,q=12;
	void mod() {
		System.out.println(x%y);
	}
	void mul() {
		System.out.println(p*q);
	}
	void div() {
		int a=67,b=34;
		System.out.println(a/b);
	}
public static void main(String[] args) {
	Test1 t1=new Test1();
	t1.mod();
	t1.mul();
	t1.div();
}
}
