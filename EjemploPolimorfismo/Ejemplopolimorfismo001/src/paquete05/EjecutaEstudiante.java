package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide cuanto terminar el proceso.        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución

       
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  Se recorre la lista calculando la matrícula de cada
            // uno de los objetos que se encuentran en ella, cabe recalcar
            // que se deja de lado la importancia de saber si el objeto es de
            // tipo EstudiantePresencial o EstudianteDistancia, sino más bien
            // lo importante es calcular la matrícula de cada uno de los objetos
            // de la lista, sean del tipo que sean.
            estudiantes.get(i).calcularMatricula();
            
            // 2. Se procede a ir imprimiento cada objeto de la lista
            System.out.printf("Datos Estudiante:\n"
                    + "%s\n",
                    estudiantes.get(i));
        }
    }

}
