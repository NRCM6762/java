package Day1;
interface Rachel {
	void waitress();
}
interface Joey {
	void actor();
}
interface Series extends Rachel,Joey {
	void friends();
}
public class Book1 implements Series {
	public void waitress() {
		System.out.println("Rachel serves");
	}
	public void actor() {
		System.out.println("Joey acts as Doctor");
	}
	public void friends() {
		System.out.println("Both are Friends");
	}
	public void house() {
		System.out.println("They are roommates");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book1 b1=new Book1();
        b1.waitress();
        b1.actor();
        b1.friends();
        b1.house();
	}

}
