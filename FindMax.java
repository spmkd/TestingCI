import java.util.Scanner;

public class FindMax{

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int one=0, two=0, three=0;
		
		System.out.print("First number: ");
		one = scanner.nextInt();
		
		System.out.print("Second number: ");
		two = scanner.nextInt();
		
		System.out.print("Third number: ");
		three = scanner.nextInt();
		
		int max = getMax(one,two);
		max=getMax(max,three);
		
		System.out.println("The MAX number is: " + max);
	}
	
	private static int getMax(int first, int second){
		
		if(first>second){
			return first;
		}else{
			return second;
		}
		
	}

}
