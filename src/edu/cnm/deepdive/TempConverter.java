package edu.cnm.deepdive;

public class TempConverter {

  public static void main(String[] args) {
    float tempF = Float.parseFloat(args[0]);
    System.out.println(convertFToC(tempF));
  }
 
  public static float convertFToC(float tempF) {
    float tempC = (tempF - 32) * 5 / 9;
    return tempC;
  }
  
}