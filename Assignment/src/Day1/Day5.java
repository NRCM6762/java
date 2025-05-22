package Day1;
interface Humidity{
	void hot();
}
interface Raining{
	void acidrain();
}
class Climate{
	void climatechange() {
		System.out.println("climate changes every season");
	}
}
class Temperature extends Climate implements Humidity,Raining{
	public void hot() {
		System.out.println("wheather is hot");
	}
	public void acidrain() {
		System.out.println("acid rains are harmful");
	}
}
class Wheather extends Temperature{
	void breeze() {
		System.out.println("the breeze is cool");
	}
}
public class Day5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Wheather w1=new Wheather();
        w1.hot();
        w1.acidrain();
        w1.climatechange();
        w1.breeze();
	}

}
