package com.unal.ciclo2grupo28clase13;

/**
 *
 * @author Usuario
 */
public class Caja {

    /*
    public String decorar(int n) {
        String s = "" + n;
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }

    public String decorar(double x) {
        String s = "" + x;
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }

    public String decorar(String s) {
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }

     */
    protected Object obj;

    public Caja(Object obj) {
        this.obj = obj;
    }

    public Object obtener() {
        return obj;
    }

    public String decorar() {
        String s = obj.toString();
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
}
