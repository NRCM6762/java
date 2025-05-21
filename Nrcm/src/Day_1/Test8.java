package Day_1;

abstract class Test8 {
    abstract void display();
    abstract void show();
}
class Demo7 extends Test8 {
    public void display() {
        System.out.print("sujana ");
    }
    public void show() {
        System.out.print("mary");
    }
    public static void main(String[] args) {
        Demo7 d1=new Demo7();
        d1.display();
        d1.show();
    }
}