package org.example;

public class Calculator {

    public static void main(String[] args) {

    }

    public int add(int a, int b) {
        return a + b;
    }


    public double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisor cannot be zero");
        return a / b; // Уязвимость: деление на ноль!
    }

    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


