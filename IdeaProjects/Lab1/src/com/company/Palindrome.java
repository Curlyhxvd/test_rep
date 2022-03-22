package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        for(int i = 0; i < args.length; i++)
        {String s = args[i];}
    }
    public static <Strings> String reverseStr() // метод изменения символов в строке
    {
    String s;
    String local = "";
    Scanner i = new Scanner(System.in);
    s = i.nextLine(); //получение значения строки из сканера
        String s1="";
        for (int j = s.length(); j > 0; j--){
            s1 = s1 + s.charAt(j);
        }
        return s1;
    }
    public static boolean isPalyndrome(String s1, String s2){
        if(s1.equals(s2))
            return true;
        return false;
    }
}
