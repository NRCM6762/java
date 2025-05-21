package Day_2;

class Chocolate{
	void eat() {
		System.out.println("I love eating chocalate");
	}
}
class Dark extends Chocolate{
	void taste() {
		System.out.println("sour");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("laddu");
	}
}
class Bournavelli extends Dark{
	void cost1() {
		System.out.println("80");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("60");
	}
}
class Dairymilk extends Sweet{
	void weight1() {
		System.out.println("200ml");
	}
}
class Kitkat extends Sweet{
	void weight2() {
		System.out.println("20g");
	}
}
public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bournavelli b1=new Bournavelli();
        Amul a1=new Amul();
        Dairymilk d2=new Dairymilk();
        Kitkat k1=new Kitkat();
        b1.eat();
        b1.taste();
        b1.cost1();
        a1.eat();
        a1.taste();
        a1.cost2();
        d2.eat();
        d2.taste2();
        d2.weight1();
        k1.eat();
        k1.taste2();
        k1.weight2();
	}

}
