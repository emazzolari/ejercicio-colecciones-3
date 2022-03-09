package coleccionesejercicio3;

import Entidades.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ColeccionesEjercicio3 {

    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        ArrayList<Alumno> listaAlumno = new ArrayList();
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            String alum = (leer.next());
            
            System.out.println("Ingrese las 3 notas del alumno");
           
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese la " + i + "° nota:");
                alumno.setNotas(leer.nextInt());
            }
            alumno.setNombre(alum);
            listaAlumno.add(alumno);

            System.out.println("Quiere ingresar otro alumno?");
            respuesta = leer.next();

            
        } while (respuesta.equalsIgnoreCase("Si"));

        Double promedio = 0.0;
        System.out.println("Ingrese el nombre a buscar");
        String nombreABuscar = leer.next();
        Iterator<Alumno> it = listaAlumno.iterator();
        while (it.hasNext()) {
            Alumno m = new Alumno();
            m = it.next();
            if (m.getNombre().equalsIgnoreCase(nombreABuscar)) {
                promedio = m.notaFinal();
                break;
            }
        }
        System.out.println("La nota final es: " + promedio);
=======
        Alumno al= new Alumno();
        AlumnoServicio alu =new AlumnoServicio ();
        alu.crearAlumno();
        alu.mostrarAlumnos();
        alu.buscarAlumno();
        al.notaFinal();
        
>>>>>>> a5fa5a0 (segundo commit)
    }
//        Scanner leer = new Scanner(System.in);
//        String respuesta = "";
//        ArrayList<Alumno> listaAlumno = new ArrayList();
//        do {
//            Alumno alumno = new Alumno();
//            System.out.println("Ingrese el nombre del alumno");
//            String alum = (leer.next());
//            
//            System.out.println("Ingrese las 3 notas del alumno");
//           
//            for (int i = 0; i < 3; i++) {
//                System.out.println("ingrese la " + i + "° nota:");
//                alumno.setNotas(leer.nextInt());
//            }
//            alumno.setNombre(alum);
//            listaAlumno.add(alumno);
//
//            System.out.println("Quiere ingresar otro alumno?");
//            respuesta = leer.next();
//
//            
//        } while (respuesta.equalsIgnoreCase("Si"));
//        for (Alumno alumno : listaAlumno) {
//            System.out.println(alumno);
//            
//        }
//        Double promedio = 0.0;
//        System.out.println("Ingrese el nombre a buscar");
//        String nombreABuscar = leer.next();
//        Iterator<Alumno> it = listaAlumno.iterator();
//        while (it.hasNext()) {
//            Alumno m = new Alumno();
//            m = it.next();
//            if (m.getNombre().equalsIgnoreCase(nombreABuscar)) {
//                promedio = m.notaFinal();
//                break;
//            }
//        }
//        System.out.println("La nota final es: " + promedio);
//    }

}
