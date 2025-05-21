package Day_1;

class Test3 {
    String s1 = "prince";
    String s2 = "prince";

    public static void main(String[] args) {
        Test3 obj = new Test3();
        System.out.println(obj.toString());
    }

    @Override
    public String toString() {
        return "Test3 [s1=" + s1 + ", s2=" + s2 + 
               ", getClass()=" + getClass() + 
               ", hashCode=" + hashCode() + 
               ", toString()=" + super.toString() + "]";
    }
}