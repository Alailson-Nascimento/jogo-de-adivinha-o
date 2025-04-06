public class Celsius {
    public static void main(String[] args){

        double temperaturaCelsius = 25.0;
        double fahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println(temperaturaCelsius + " graus Celsius equivalem a " + fahrenheit + " Fahrenheit.");

        int temperatuFahrenheit = (int) fahrenheit;
        System.out.println(temperaturaCelsius + " graus Celsius equivalem a " + temperatuFahrenheit);
    }
}