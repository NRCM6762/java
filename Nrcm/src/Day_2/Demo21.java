package Day_2;
class Fruits{
	void benifits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits{
	void color() {
		System.out.println("Red");
	}
}
class Mango extends Apple{
	void price() {
		System.out.println("100");
	}
}
class Banana extends Mango{
	void taste() {
		System.out.println("sweet");
	}
}
public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1=new Apple();
		Banana b1=new Banana();
        Mango m1=new Mango();
        a1.benifits();
        a1.color();
        //b1.benifits();
        b1.taste();
        //m1.benifits();
        m1.price();
	}

}
