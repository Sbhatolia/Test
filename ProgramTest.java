import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number : " );
		int n= sc.nextInt();
		sumOf(n);
		

	}
	
	public static void sumOf(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of multiples are : " +sum);
		
	}

}
