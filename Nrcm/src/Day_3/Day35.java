package Day_3;
import java.io.*;
public class Day35 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f1=new File("C:\\Users\\sujana\\Desktop\\Archana.txt");
        if(f1.createNewFile()) {
        	System.out.println("File created successfully");
        }else {
        	System.out.println("file not created");
        }
    }
}
