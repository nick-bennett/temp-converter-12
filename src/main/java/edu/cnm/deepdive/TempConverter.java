package edu.cnm.deepdive;

/**
 * Simple class to demonstrate reading properties and iterating 
 * over arguments.
 */
public class TempConverter {

  public static void main(String[] args) {
      
    String mode = System.getProperty("mode");

    for (String arg : args) {

      if (mode != null && mode.equals("c2f")) {
        float tempC = Float.parseFloat(arg);
        System.out.println(convertCToF(tempC));
      } else {
        float tempF = Float.parseFloat(arg);
        System.out.println(convertFToC(tempF));
      }

    }
    
  }
 
  /**
   * Converts tempF (Fahrenheit temperature) to a Celsius value.
   *
   * @param tempF Temperature in Fahrenheit degrees.
   * @return Temperature in Celsius degrees.
   */
  public static float convertFToC(float tempF) {
    return (tempF - 32) * 5 / 9;
  }

  public static float convertCToF(float tempC) {
    return tempC * 9 / 5 + 32;
  }
  
}