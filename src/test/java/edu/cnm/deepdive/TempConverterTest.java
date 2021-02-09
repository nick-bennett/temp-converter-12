package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final float CELSIUS_TOLERANCE = 0.001f;
  static final float FAHRENHEIT_TOLERANCE = 0.0018f;
  static final float[][] testCases = { // Element 0 in each row is Fahrenheit; element 1 is Celsius.
      {-40, -40},
      {0, 32},
      {100, 212}
  };

  @Test
  void convertFToC() {
    for (float[] testCase : testCases) {
      float expected = testCase[0];
      float input = testCase[1];
      float actual = TempConverter.convertFToC(input);
      System.out.printf(
          "Expected celsius = %.3f; input fahrenheit = %.3f; actual celsius = %.3f%n",
          expected, input, actual);
      assertEquals(expected, actual, CELSIUS_TOLERANCE);
    }
  }

  @Test
  void convertCToF() {
    for (float[] testCase : testCases) {
      float expected = testCase[1];
      float input = testCase[0];
      float actual = TempConverter.convertCToF(input);
      System.out.printf(
          "Expected fahrenheit = %.3f; input celsius = %.3f; actual fahrenheit = %.3f%n",
          expected, input, actual);
      assertEquals(expected, actual, FAHRENHEIT_TOLERANCE);
    }
  }

}