
package Day_1;

public class Test6 {
    public static void main(String[] args) {
        String str="helloworld";
        int vowels=0,constants=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowels++;
            else if(ch>='a'&&ch<='z') constants++;
        }
        System.out.println("Vowels:"+vowels+ ",Constants:"+constants);
    }
}