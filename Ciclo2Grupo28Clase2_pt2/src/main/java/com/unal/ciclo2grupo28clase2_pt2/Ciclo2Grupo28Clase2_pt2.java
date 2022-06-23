/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.unal.ciclo2grupo28clase2_pt2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase2_pt2 {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int n = sc.nextInt();
        int m = n * 2;
        System.out.println("Resultado: " + m);
         */
 /* 
        5       24564    1248977.045  564468476549687657654657654657.1265465456
        byte -> short  -> int  ->   long
                          char
                          float  -> double
         */
        int x = 0;
        x += 2;//x=x+2;
        System.out.println(x);
        x -= 2;//x=x-2;
        System.out.println(x);
        x = 10;
        x *= 2;//x=x*2;
        System.out.println(x);
        x /= 10;//x=x/10;
        System.out.println(x);
        x %= 1;//x=x%1;
        System.out.println(x);

        int m1, m2;

        m1 = 10;
        m2 = 10;
        System.out.println("m2=" + ++m2 + "\n" + "m1=" + --m1);
        System.out.println("m2=" + m2 + "\n" + "m1=" + m1);

        double r = 10;
        //double F=6,67384E-11[(m1 m2)/(r^2)];

        double F = 6.67384e-11 * m1 * m2 / Math.pow(r, 2);//bueno

        //Double F=6.67384 x 10-11 (m1 *m2/r*r);
        //F =6,67384^-11*doublem1*doublem2  double r^2
        //casteo
        double xa = 1.0;
        double ya = -2.5;
        int na = (int) xa;
        int ma = (int) ya;
        int pa = (int) 3.14159265;

    }

}
