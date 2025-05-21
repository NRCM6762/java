package Day_1;

abstract class Book11 {
    abstract void add();
    abstract void sub();
    static void mul() {
        System.out.println("dance");
    }
    void div() {
        System.out.println("dancing");
    }
}
class  Sample1 extends Book11{
//class Demo7 extends Test1 {
    public void add() {
        System.out.println("hi");
    }
    public void sub() {
        System.out.println("hi");
    }
}
class Test9 {
    public static void main(String[] args) {
        Sample1 d1=new Sample1();
        d1.add();
        d1.sub();
        d1.mul();
        d1.div();
    }
}