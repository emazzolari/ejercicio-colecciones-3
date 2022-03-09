package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;
    Scanner leer;

    public Alumno() {
        this.notas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");

    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas.add(notas);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    public Double notaFinal() {
        Double sumador = 0.0;
        Iterator<Integer> it = notas.iterator();
        while (it.hasNext()) {
            Integer m = 0;
            m = it.next();
            sumador = sumador + m;
        }
        System.out.println("Este es el metodo de entidades");
        return (sumador / notas.size());
        
    }
}
