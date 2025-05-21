package Day_2;
class Movie{
	void title() {
		System.out.println("Hit");
	}
}
class Hit extends Movie{
	void theme() {
		System.out.println("Crime and Thriller");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("Nani");
	}
}
class Heroine extends Hero{
	void character() {
		System.out.println("Positive");
	}
}
public class Demo22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hero h1=new Hero();
        Heroine h2=new Heroine();
        h1.title();
        h1.theme();
        h2.name();
        h2.character();
	}

}
