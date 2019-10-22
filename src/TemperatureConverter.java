import static java.lang.System.out;

public class TemperatureConverter {
    //Convert Celsius to Fahrenheit
    public static void main(String[] args) {
        float Celsius = 100.5f;
        float result = (float) ((Celsius * 9.0 / 5.0) + 32.0);
        System.out.println ("Convert Celsius to Fahrenheit:" +result);

        //Convert Fahrenheit to Celsius
        float Fahrenheit =101.55f;
        float result1 = (float) (5.0/9.0*(Fahrenheit - 32.0));
        System.out.println("Convert Fahrenheit to Celsius: " + result1);

        //Convert Celsius to Kelvin
        float CelsiusToKelvin = 100.5f;
        float result2= (float) (CelsiusToKelvin + 273.16);
        System.out.println ("Convert Celsius to Kelvin:" +result);
    }
}