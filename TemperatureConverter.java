//TASK-1 TEMPERATURE CONVERSION PROGRAM

import java.util.Scanner;
public class TemperatureConverter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);                                  //sc-->scanner

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.print("Enter temperature unit (C/F/K): ");               // C --> Celcius
                                                                              // F --> Fahrenheit
                                                                              // K --> Kelvin
        char unit = sc.next().charAt(0);

        double celsius, fahrenheit, kelvin;

        switch (unit) 
        {
            case 'C':
                celsius = temp;
                fahrenheit = celsius * 9 / 5 + 32;
                kelvin = celsius + 273.15;
                break;
            case 'F':
                fahrenheit = temp;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                break;
            case 'K':
                kelvin = temp;
                celsius = kelvin - 273.15;
                fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
                break;
            default:
                System.out.println("Invalid unit. Please try again.");
                return;
        }

        System.out.println("Converted temperatures:");
        System.out.println("Celsius: " + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        System.out.println("Kelvin: " + kelvin + "K");
    }
}