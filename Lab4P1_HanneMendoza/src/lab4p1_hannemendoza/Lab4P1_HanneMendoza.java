/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_hannemendoza;

import java.util.Scanner;

public class Lab4P1_HanneMendoza {

    public static void main(String[] args) {
        Scanner kore = new Scanner(System.in);
        System.out.println("*********MENU*********");
        System.out.println("1. Inversión especial ");
        System.out.println("2. Balanza de cadenas ");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("Elija su opción: ");
        int opcion = kore.nextInt();

        while (opcion > 0 && opcion < 4) {

            switch (opcion) {

                case 1:
                    String cadena;
                    System.out.println("Ingrese la cadena: ");
                    kore.nextLine();
                    cadena = kore.nextLine();

                    String ncadena = "";
                    char caracter;

                    while (cadena.length() <= 5) {
                        System.out.println("Ingrese la cadena: ");
                        kore.next();
                        cadena = kore.nextLine();
                    }
                    String acum = "";
                    int cont = 0;
                    String acum2 = "";
                    
                    for (int i = 0; i < cadena.length(); i++) {
                        acum += cadena.charAt(i);
                        if (cadena.charAt(i) == 32 || i==cadena.length()-1 ){
                          for (int j = acum.length() - 1; j >= 0; j--) {
                                acum2+=acum.charAt(j);
                          }
                          acum= "";
                          acum2 += " ";
                      
                        }                        
                    }
                    
                    System.out.println("Cadena invertida: " + acum2);

                    break;

                case 2:
                    System.out.println("Ingrese cadena 1: ");
                    kore.nextLine();
                    String cadena1 = kore.nextLine();
                    System.out.println("Ingrese cadena 2: ");
                    String cadena2 = kore.nextLine();
                    System.out.println("Ingrese cadena 3: ");
                    String cadena3 = kore.nextLine();
                    int acumulador1 = 0;
                    int acumulador2 = 0;
                    int acumulador3 = 0;

                    for (int a = 0; a < cadena1.length(); a++) {
                        char caracter1 = cadena1.charAt(a);
                        int numero1 = (int) caracter1;
                        acumulador1 += numero1;

                    }
                    for (int b = 0; b < cadena2.length(); b++) {
                        char caracter2 = cadena2.charAt(b);
                        int numero2 = (int) caracter2;
                        acumulador2 += numero2;
                    }
                    for (int c = 0; c < cadena3.length(); c++) {
                        char caracter3 = cadena3.charAt(c);
                        int numero3 = (int) caracter3;
                        acumulador3 += numero3;

                    }
                    System.out.println("Peso cadena 1: " + acumulador1);
                    System.out.println("Peso cadena 2: " + acumulador2);
                    System.out.println("Peso cadena 3: " + acumulador3);
                    if (acumulador1 > acumulador2 && acumulador1 > acumulador3) {
                        System.out.println("La cadena 1 es mas pesada");
                    } else if (acumulador2 > acumulador1 && acumulador2 > acumulador3) {
                        System.out.println("La cadena 2 es mas pesada");
                    } else {
                        System.out.println("La cadena 3 es mas pesada");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    kore.nextLine();
                    String mensaje = kore.nextLine();
                    String acumuladoresp = "";
                    for (int i = 0; i < mensaje.length(); i++) {
                        char caracteresp = mensaje.charAt(i);
                        int numeroesp = (int) caracteresp;

                        int nuevo_num = (numeroesp + 2);
                        char carateresp = (char) nuevo_num;
                        acumuladoresp += carateresp;
                    }
                    System.out.println("Mensaje cifrado: " + acumuladoresp);

            }//switch

            System.out.println("*********MENU*********");
            System.out.println("1. Inversión especial ");
            System.out.println("2. Balanza de cadenas ");
            System.out.println("3. Cifrado de mensajes");
            System.out.println("Elija su opción: ");
            opcion = kore.nextInt();
        }//while

    }// metodo

}// clase
