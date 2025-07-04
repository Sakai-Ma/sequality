package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sumRange(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double averageRange(int x, int y) {
    int count = y - x + 1;
    return sumRange(x, y) / (double) count;
  }

  public int sumOddRange(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0)
        sum += i;
    }
    return sum;
  }

  public int sumEvenRange(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0)
        sum += i;
    }
    return sum;
  }
}
