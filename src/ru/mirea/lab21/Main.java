package ru.mirea.lab21;

import java.lang.String;

public class Main {
    public static void main(String[] args)
    {
        M_String str = new M_String();

        String string = str.string("I like Java!!!");

        System.out.println(string);

        System.out.println(string.charAt(string.length()-1));

        // System.out.println("I like Java!!!".endsWith("!!!"));
        if(string.endsWith("!!!")==true)
        {
            System.out.println("Строка оканчивается на !!!");
        }
        else System.out.println("Ошибка!");

        // System.out.println("I like Java!!!".startsWith("I like"));
        if(string.startsWith("I like")==true)
        {
            System.out.println("Строка начинается на I like");
        }
        else System.out.println("Ошибка!");

        //System.out.println("I like Java!!!".contains("Java"));
        if(string.contains("Java")==true)
        {
            System.out.println("Строка содержит Java");
        }
        else System.out.println("Ошибка!");

        System.out.println("[ " + string.indexOf("J") + " ; " + string.lastIndexOf("a") + " ]");

        System.out.println(string.replace('a', 'o'));

        System.out.println(string.toUpperCase());

        System.out.println(string.toLowerCase());

        System.out.println(string.substring(7,11));
    }
}
