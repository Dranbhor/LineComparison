package Assignment2;

import java.util.Scanner;

public class LineComparison 
{

			public static void main(String[] args) 
			{
				try (Scanner sc = new Scanner(System.in))
				{
					System.out.println("Enter x1,x2,y1,y2");
					
					
					int x1 = sc.nextInt();
					int x2 = sc.nextInt();
					int y1 = sc.nextInt();
					int y2 = sc.nextInt();

					double Length1 = Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1,2)));
					String lenghtOne = Double.toString(Length1);
					
					System.out.println("Enter a1,a2,b1,b2");
					int a1 = sc.nextInt();
					int a2 = sc.nextInt();
					int b1 = sc.nextInt();
					int b2 = sc.nextInt();

					double Length2 = Math.sqrt((Math.pow(a2-a1, 2))+(Math.pow(b2-b1,2)));
					String lenghtTwo = Double.toString(Length2);
					
					System.out.println("Length1line equality for given end points lines are:"+ ""+lenghtOne.compareTo(lenghtTwo));

			}

		}
		

	}


