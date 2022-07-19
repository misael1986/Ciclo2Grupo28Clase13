/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.unal.ciclo2grupo28clase13;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase13 {

    public static void main(String[] args) {
        /*
        Caja caja = new Caja(-13589780);
        System.out.println(caja.decorar());
        System.out.println(caja.obtener());

        Caja caja2 = new Caja(-3.14157896);
        System.out.println(caja2.decorar());
        System.out.println(caja2.obtener());

        Caja caja3 = new Caja("Pedro Paramo");
        System.out.println(caja3.decorar());
        System.out.println(caja3.obtener());
         */
        //--------------------------------------------------
        /*
        Caja2<String> cajaX = new Caja2<String>("Pedro Paramo");
        System.out.println(cajaX.decorar());
        char c = cajaX.obtener().charAt(2);
        System.out.println(c);

        Caja2<Double> cajaX2 = new Caja2<Double>(20.34);
        System.out.println(cajaX2.decorar());
        double y = cajaX2.obtener() + 20.0;
        System.out.println(y);
        */
        //---------------------------------------------------------
        Pareja<Integer, String> pareja = new Pareja<Integer, String>(20, "Pedro Paramo");
        System.out.println(pareja);
        Integer c2 = pareja.clave() + 10;
        System.out.println(c2);
        System.out.println(pareja.valor().charAt(2));

    }
}
