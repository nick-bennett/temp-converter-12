package edu.cnm.deepdive;

/**
 * Simple class to demonstrate reading properties and iterating 
 * over arguments.
 */
public class TempConverter {

  public static void main(String[] args) {
      
    String mode = System.getProperty("mode");
    
    for (int i = 0; i < args.length; i = i + 1) {  
      
      if (mode != null && mode.equals("c2f")) {
        float tempC = Float.parseFloat(args[i]);
        System.out.println(convertCToF(tempC));
      } else {
        float tempF = Float.parseFloat(args[i]);
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
    float tempC = (tempF - 32) * 5 / 9;
    return tempC;
  }

  public static float convertCToF(float tempC) {
    float tempF = tempC * 9 / 5 + 32;
    return tempF;
  }
  
}