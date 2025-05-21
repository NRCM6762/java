package Day_1;

import java.util.*;
public class Input2 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in); 
			System.out.println("Enter a color");
			String color=sc.next();
			switch(color) {
			case "red":
			    System.out.println("Celebrate holi");
			    break;
			case "green":
			    System.out.println("Celebrate ramzan");
			    break;
			case "White":
			    System.out.println("Celebrate Christmas");
			    break;
			default:
			System.out.println("No festival");
			} 
    }
}