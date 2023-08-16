
public class TemperatureConversionApp {
public static double celciusTofahrenheit(double celsius)
{
	double k=(celsius*9/5)+32;
	return k;
}
public static double fahrenheitToCelsius(double fahrenheit)
{
	double c=(fahrenheit-32)*5/9;
	return c;
}
}
