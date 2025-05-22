package Day1;
interface Bhuvi{
	void bowling();
}
interface Pujara extends Bhuvi{
	void bating();
	void game();
}
class Game1 implements Pujara{
	public void bowling() {
		System.out.println("Bhuvi is a good bowler");
	}
	public void bating() {
		System.out.println("Pujara is a good batter");
	}
	public void game() {
		System.out.println("Cricket");
	}
	public void play() {
		System.out.println("Both play in Test Match");
	}
}
class Game2 implements Pujara{
	public void bowling() {
		System.out.println("Bhuvi is a good bowler");
	}
	public void bating() {
		System.out.println("Pujara is a good batter");
	}
	public void game() {
		System.out.println("Cricket");
	}
    public static class Book2 {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game1 g1=new Game1();
		Game2 b1=new Game2();
		g1.bowling();
		g1.bating();
		g1.game();
		g1.play();
		b1.bowling();
		b1.bating();
		b1.game();
	    }
	}
}
