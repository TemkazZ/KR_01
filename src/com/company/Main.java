package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //1.Вывести на экран пять строк из нулей, причем количество нулей в каждой строке равно номеру строки.
//        System.out.println("0");
//        System.out.println("00");
//        System.out.println("000");
//        System.out.println("0000");
//        System.out.println("00000");

        //2.Вывести на экран результат вычисления 1+2−4.
//        int a;
//        System.out.println(a=1+2-4);


        //3.Дан прямоугольник размером 647 x 170. Сколько квадратов со стороной 30 можно вырезать из него?
//        int d = 647/30 *(170/30);
//        System.out.println(d);


        //4.Пользователь вводит три числа. Найдите среднее арифметическое этих чисел, а также разность удвоенной суммы первого и третьего чисел и утроенного второго числа.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        float Sr = (a + b + c)/3;
//        float R = 2*(a+c) - 3*b;
//        System.out.println(Sr);
//        System.out.println(R);


        //5.Даны три числа. Написать "yes", если можно взять какие-то два из них и в сумме получить третье
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if (a+b==c)
//        {
//            System.out.println("yes");
//        }
//        else
//        {
//            System.out.println("no");
//        }


        //6.Дано число. Если оно от -10 до 10 не включительно, то увеличить его на 5, иначе уменьшить на 10.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if ((a >-10)&& (a<10))
//        {
//            a+=5;
//        }
//        else
//        {
//            a-=10;
//        }
//        System.out.println(a);


//        //7.Даны a и n. Вычислите p=(a+1)2(a+2)2⋅…⋅(a+n)2
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int n = in.nextInt();
//        int p=1;
//        for (int i=1;i<=n;i++)
//        {
//            p*=(a+i)*2;
//        }
//        System.out.println(p);


        //8.Назовем автобусный билет несчастливым, если сумма цифр его шестизначного номера делится на 13.
        //Могут ли два идущих подряд билета оказаться несчастливыми?
//        int a = 444999;
//        int b = 445000;
//        System.out.println(a);
//        System.out.println(b);
//        int a1 = 4+4+4+9+9+9;
//        int b1 = 4+4+5+0+0+0;
//        if((a1%13==0) && (b1%13==0))
//        {
//            System.out.println("Два идущих подряд билета могут оказаться несчастливыми");
//        }
//        else
//        {
//            System.out.println("Два идущих подряд билета не могут оказаться несчастливыми");
//        }

        //9.Вывести квадрат 7 на 7 из случайных букв.
//        Random r = new Random();
//        String str = "abcdefghijklmnopqrstuvwxyz";
//
//        for(int i=0;i<7;i++){
//            for(int j=0;j<7;j++){
//                char ch = str.charAt(r.nextInt(str.length()) );
//                System.out.print(ch);
//            }
//            System.out.println();
//        }


        //10.Сгенерировать пароль для пользователя.
        // Требования: длина от 6 до 20 символов, должен быть ровно один символ подчеркивания,
        // хотя бы две заглавных буквы, не более 5 цифр, любые две цифры подряд недопустимы.
        int PasswordLength = (int)(Math.random()*15)+5;
        int CharacterCapCount = (int)(Math.random()*(PasswordLength+1))+2;
        int NumberCount = 5 >= 5 ? (int)(Math.random()*(6)):(int)(Math.random()*(PasswordLength-CharacterCapCount));

        int CharacterCount = PasswordLength - CharacterCapCount - NumberCount;
        ArrayList<Character> password = new ArrayList<Character>();
        Random r = new Random();
        password.add('_');
        for (int i = 0; i < CharacterCapCount; i++)
        {
            password.add((char)((int)(Math.random()*25)+65));
        }
        for (int i = 0; i < NumberCount; i++)
        {
            password.add((char)((int)(Math.random()*10)+48));
        }
        for (int i = 0; i < CharacterCount; i++)
        {
            password.add((char)((int)(Math.random()*26)+97));
        }
        Collections.shuffle(password);
        String str = password.toString().replaceAll(", |\\[|\\]", "");
        while (str.matches("(.*)\\d{2}(.*)"))
        {
            Collections.shuffle(password);
            str = password.toString().replaceAll(", |\\[|\\]", "");
        }
        System.out.println(str);

    }
}
