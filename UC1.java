 package Assignment2;

import java.util.Scanner;

public class LineComp 
{

	public static void main(String[] args)
	{
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter x1,x2,y1,y2");
			
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();

			double Length = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1,2)));
			
			System.out.println(Length);
		}
	}

}

