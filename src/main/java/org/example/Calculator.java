package org.example;

public class Calculator {

    public static void main(String[] args) {

    }

    // Пример метода с дублированием кода (проблема для SonarCloud)
    public int add(int a, int b) {
        return a + b;
    }

    // Дубликат (нарушение DRY)
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Метод с "магическим числом" (проблема для SonarCloud)
    public double calculateCircleArea(double radius) {
        return 3.14 * radius * radius; // 3.14 должно быть константой!
    }

    // Неиспользуемый параметр (проблема для SonarCloud)
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод без обработки исключения (проблема для SonarCloud)
    public int divide(int a, int b) {
        return a / b; // Уязвимость: деление на ноль!
    }

    // Пример сложной логики (высокая цикломатическая сложность)
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

    // Неоптимизированный метод (проблема для SonarCloud)
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) { // Должен быть i <= Math.sqrt(n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


