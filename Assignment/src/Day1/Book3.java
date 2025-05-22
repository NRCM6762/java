package Day1;
interface Doremon {
	void robot();
}
class Cartoon{
	void name() {
		System.out.println("Doremon");
	}
	void friends() {
		System.out.println("There are 5 friends");
	}
}
class Television extends Cartoon implements Doremon {
	public void robot() {
		System.out.println("Doremon is a robot");
	}
}
class Person extends Television {
	public void watch() {
		System.out.println("person is ready to warch tv");
	}
}
public class Book3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p1=new Person();
        p1.robot();
        p1.name();
        p1.friends();
        p1.watch();
	}

}
