package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);

        // Tablas de multiplicar,

       /* System.out.println("Ingrese el numero de Tabla");
        int multiplicar = rd.nextInt();
        rd.nextLine();

        int y=0;
        while ( y<13) {
            int m = multiplicar * y;
            System.out.println(multiplicar + " X " + y + " = " + m);
            y++;
        }

        // Pedir 6 nombre y sus edades e imprimirlos

        int c = 0;
        String nombres[] = new String[6];
        int edades[] = new int[6];

        while (c < 6) {
            System.out.println(" Ingrese un nombre");
            nombres[c] = rd.nextLine();
            System.out.println(" Ingrese la Edad");
            edades[c] = rd.nextInt();
            rd.nextLine();
            c++;
        }

        int x=0;
        while(x<6){
            System.out.println(" El nombre es "+nombres[x]+ " y Tiene "+edades[x]+" años" );
            x++;
        }*/

    // ingresar una vocal y dependiendo de la vocal imprimir 3 palabras que inicien con esa vocal


       /* char ingreso;
        ingreso = 'a';
        while (ingreso != 'c'){
            System.out.println("Ingrese una Vocal");
            ingreso = rd.next().charAt(0);

            switch (ingreso){
                case 'a':
                case 'A':
                    System.out.println("Angely");
                    System.out.println("Angel");
                    System.out.println("Angelina");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Elefante");
                    System.out.println("Elegante");
                    System.out.println("Enano");
                    break;
                case 'i':
                case 'I':
                    System.out.println("Iguana");
                    System.out.println("Igual");
                    System.out.println("Imaginario");
                    break;
                case 'o':
                case 'O':
                    System.out.println("Otro");
                    System.out.println("Ojo");
                    System.out.println("Oso");
                    break;
                case 'u':
                case 'U':
                    System.out.println("Uva");
                    System.out.println("Unidad");
                    System.out.println("Uno");
                    break;
                default:
                    ingreso = 'c';
            }

        }*/

        //tabla de multiplicar continua


        boolean repetir = true;

        while (repetir == true) {
            System.out.println("Ingrese el numero de Tabla");
            int multiplicar = rd.nextInt();
            rd.nextLine();

            if(0 < multiplicar && multiplicar < 13) {
                int y = 0;
                while (y < 13) {
                    int m = multiplicar * y;
                    System.out.println(multiplicar + " X " + y + " = " + m);
                    y++;
                }
            }else {
               repetir = false;
            }

        }
    }
}
