package edu.cnm.deepdive;

public class TempConverter {

  public static void main(String[] args) {
    
    for (int i = 0; i < args.length; i = i + 1) {
      
      String mode = System.getProperty("mode");
      
      if (mode != null && mode.equals("c2f")) {
        float tempC = Float.parseFloat(args[i]);
        System.out.println(convertCToF(tempC));
      } else {
        float tempF = Float.parseFloat(args[i]);
        System.out.println(convertFToC(tempF));
      }
      
    }
    
  }
 
  public static float convertFToC(float tempF) {
    float tempC = (tempF - 32) * 5 / 9;
    return tempC;
  }

  public static float convertCToF(float tempC) {
    float tempF = tempC * 9 / 5 + 32;
    return tempF;
  }
  
}