package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate c = new Calculate();
    assertEquals(5, c.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate c = new Calculate();
    assertEquals(2.5, c.average(2, 3), 0.0001);
  }

  @Test
  public void testSumRange() {
    Calculate c = new Calculate();
    assertEquals(55, c.sumRange(1, 10));
  }

  @Test
  public void testAverageRange() {
    Calculate c = new Calculate();
    assertEquals(5.5, c.averageRange(1, 10), 0.0001);
  }

  @Test
  public void testSumOddRange() {
    Calculate c = new Calculate();
    assertEquals(25, c.sumOddRange(1, 10));
  }

  @Test
  public void testSumEvenRange() {
    Calculate c = new Calculate();
    assertEquals(30, c.sumEvenRange(1, 10));
  }

}
