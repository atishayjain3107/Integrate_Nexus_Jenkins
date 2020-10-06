import java.util.Scanner;
public class Nexus_CICD {

	public static void main(String[] args) {
		int a,b, sum=0;
		Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        a = input.nextInt();

        System.out.println("please enter the second number");
        b = input.nextInt();
        
       sum=a+b;
       
       System.out.println("Sum of two no's is" + sum);
	}

}
