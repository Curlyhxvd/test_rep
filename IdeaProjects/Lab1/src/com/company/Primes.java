package com.company;

public class Primes {
    public static boolean isPrime(int n) {
        int k = 1;
        for (int j = 1; j < n / 2 + 1; j++) { // Цикл проверки числа на условие "Простое число"
            if (n % j == 0)
                k++;
        }
        if (k == 2) // Условие выборки чисел
            return true;
        return false;
    }
}
