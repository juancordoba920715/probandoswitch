package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //******Declarando entradas*********************

        Scanner teclado=new Scanner(System.in);
        Double temperaturaAmbiente;

        //************Inicializando**************

        System.out.print("Digite la temperatura: ");
        temperaturaAmbiente=teclado.nextDouble();

        if (temperaturaAmbiente==20.0){
            temperaturaAmbiente=25.0;

        } else if (temperaturaAmbiente==30.0) {
            temperaturaAmbiente=20.0;

        } else if (temperaturaAmbiente==40.0) {
            temperaturaAmbiente=20.0;

        }else {
            System.out.println("Señor usuario, ingrese la temperatura que desea: ");
            temperaturaAmbiente=teclado.nextDouble();
        }
        System.out.println("SU temperatura sera nivelada a: "+temperaturaAmbiente);

    }
}