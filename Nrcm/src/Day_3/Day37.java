package Day_3;
import java.io.*;
import java.util.Scanner;
public class Day37 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	File obj =new File("C:\\Users\\sujana\\Desktop\\Archana.txt");
        	Scanner R=new Scanner(obj);
        	while(R.hasNextLine()){
        		String data=R.nextLine();
        		System.out.println(data);
        	}
        	R.close();
        } catch (FileNotFoundException e) {
        	System.out.println("An error has occured");
        	e.printStackTrace();
        	}
	} 

}
