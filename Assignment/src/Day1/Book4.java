package Day1;
interface Library{
	void books();
}
interface Borrowable{
	void borrow();
}
class LibraryCard {
	void returnbook() {
		System.out.println("Every book borrowed should be Returned");
	}
}
class Book extends LibraryCard implements Library,Borrowable{
	public void books() {
		System.out.println("There are so many book in library");
	}
	public void borrow() {
	System.out.println("you can borrow any book from library");
    }
}
public class Book4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book b1=new Book();
        b1.books();
        b1.borrow();
        b1.returnbook(); 
	}

}
