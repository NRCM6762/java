package Day_2;
class Animal {
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("dog is barking");
	}
}
public class Demo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.bark();
		d1.sleep();
	}

}
