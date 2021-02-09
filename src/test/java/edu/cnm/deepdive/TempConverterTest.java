package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TempConverterTest {

  static final float CELSIUS_TOLERANCE = 0.001f;
  static final float FAHRENHEIT_TOLERANCE = 0.0018f;
  static final float[] celsius = {-40, 0, 100};
  static final float[] fahrenheit = {-40, 32, 212};

  @Test
  void convertFToC() {
    assertEquals(-40, TempConverter.convertFToC(-40), CELSIUS_TOLERANCE);
    assertEquals(100, TempConverter.convertFToC(212), CELSIUS_TOLERANCE);
    assertEquals(0, TempConverter.convertFToC(32), CELSIUS_TOLERANCE);
  }

  @Test
  void convertCToF() {
    assertEquals(-40, TempConverter.convertCToF(-40), FAHRENHEIT_TOLERANCE);
    assertEquals(212, TempConverter.convertCToF(100), FAHRENHEIT_TOLERANCE);
    assertEquals(32, TempConverter.convertCToF(0), FAHRENHEIT_TOLERANCE);
  }

}