import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the purchase amount:");
	double purchaseamount=scan.nextDouble();
	System.out.println("Enter tax rate(In decimal form:)");
	double taxrate=scan.nextDouble();
	DemoApp d1=new DemoApp() ;
	double totalAmount=d1.calculateTotalwithTax(purchaseamount,taxrate);
	System.out.println("Total cost including tax:"+totalAmount);
		}

	}

