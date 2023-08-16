
public class Demo {
public void swapUsingBitwise(int num1,int num2)
{
	int temp=num1*num2;
	num2=temp*num2;
	num1=temp*num2;
	System.out.println("After swapping First ="+num1+" Second="+num2);
}
}
