package Day1;
interface Softdrink{
	void drink();
}
interface Alcohol{
	void vodka();
}
interface hotdrink{
	void tea();
}
class Robert implements Softdrink,Alcohol,hotdrink{
	public void drink() {
		System.out.println("everyone likes thumbsup");
	}
	public void vodka() {
		System.out.println("vodka tastes good with lemon and sprite");
	}
	public void tea() {
		System.out.println("tea is good with biscuits");
	}
}
interface medicine{
	void syrup();
}
class Ross extends Robert implements medicine{
	public void syrup() {
		System.out.println("cough is cured using syrups");
	}
	public void tablet() {
		System.out.println("crosin tablet is used to cure fever");
	}
}
class Day6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ross r=new Ross();
        r.drink();
        r.vodka();
        r.tea();
        r.syrup();
        r.tablet();
	}

}
