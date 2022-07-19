
package com.unal.ciclo2grupo28clase13;

/**
 *
 * @author Usuario
 */
public class Caja2<T> {

    protected T obj;

    public Caja2(T obj) {
        this.obj = obj;
    }

    public T obtener() {
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
