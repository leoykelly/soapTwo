package example;/**
 * Created by Kelly on 2/26/2017.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    temperature.TemperatureConversionsSoapType service = new TemperatureConversions().getPort();
    //invoke business method
    service.celsiusToFahrenheit();  
  }
}
