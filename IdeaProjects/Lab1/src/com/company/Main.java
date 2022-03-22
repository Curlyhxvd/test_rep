package com.company;

public class Main {
    public static void main(String[] args) {


        for(int i = 2; i <= 100; i++){ //Цикл поиска простых чисел на интервале от 2 до 100
            if(Primes.isPrime(i) == true)// Условие вывода в консоль простых чисел
                System.out.println(i);
        }
    }
}

