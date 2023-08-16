import java.util.Scanner;
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first integer");
int num1=scan.nextInt();
System.out.println("Enter the second integer");
int num2=scan.nextInt();
Demo d1=new Demo();
d1.swapUsingBitwise(num1,num2);
}

}
