package Day_1;

public class Test7 {

	public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        StringBuffer sb1=new StringBuffer(str1);
        StringBuffer sb2=new StringBuffer(str2);

        System.out.print(sb1.append(sb2));
    }
}
//making string mutuable