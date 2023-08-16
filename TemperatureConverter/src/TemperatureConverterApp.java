import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Temperature in degree-F");
double f=scan.nextDouble();
TemperatureConverter temperatureConverter=new TemperatureConverter();
double tempincdelcius= temperatureConverter.convertFahrenhitToCelsius(f);
System.out.println(tempincdelcius);

	}

}
