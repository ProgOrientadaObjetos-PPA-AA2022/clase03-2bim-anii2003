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
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
                do {
            // Se debe imprimir en pantallar las siguientes opciones para solicitar
            // solicitar el tipo de estudiante que el usuario desea ingresar
            // 1. Imprimir "Tipo de Estudiante a ingresar
            //    1. Estudiante Presencial
            //    2. Estudiante Distancia"

            System.out.println("Tipo de Estudiante a ingresar:\n"
                    + "1) Estudiante Presencial\n"
                    + "2) Estudiante Distancia");
            // Se procede a capturar el valor ingresado por teclado en 
            // la variable tipoEstudiante declarada anteriormente
            // 2. Se lee tipoEstudiante 
            tipoEstudiante = entrada.nextInt();
            
            // Se define un condicional para que se procedan a pedir los datos 
            // al usuario si la variable tipoEstudiante es igual a 1 o 2
            if (tipoEstudiante == 1 || tipoEstudiante == 2) {
                entrada.nextLine(); // Limpiar el buffer
                // Se solicita ingresar los valores para asignar a las variables
                // 3. Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
                // 4. Se lee nombresEst, apellidosEst, identificacionEst, edadEst
                System.out.println("Ingrese el nombre del estudiante");
                nombresEst = entrada.nextLine();
                System.out.println("Ingrese el apellido del estudiante");
                apellidosEst = entrada.nextLine();
                System.out.println("Ingrese la identificación del estudiante");
                identificacionEst = entrada.nextLine();
                System.out.println("Ingrese la edad del estudiante");
                edadEst = entrada.nextInt();

                // Implementar un condicional si la opción ingresada por el 
                // usuario es 1
                if (tipoEstudiante == 1) {
                    // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                    EstudiantePresencial estudianteP = new EstudiantePresencial();
                    // Solicitamos el ingreso de valores para variables 
                    // numero de creditos, costo de cada credito
                    // Solicitar entonces, las variables numeroCreds, costoCred
                    // Leer numeroCreds, costoCred
                    System.out.println("Ingrese el número de créditos del "
                            + "estudiante");
                    numeroCreds = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada crédito "
                            + "del estudiante");
                    costoCred = entrada.nextDouble();

                    // En esta sección hacemos uso de los métodos establecer 
                    // para asignar valores a los datos (atributos) del objeto
                    // Establecer:  
                    estudianteP.establecerNombresEstudiante(nombresEst);
                    estudianteP.establecerApellidoEstudiante(apellidosEst);
                    estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteP.establecerEdadEstudiante(edadEst);
                    estudianteP.establecerNumeroCreditos(numeroCreds);
                    estudianteP.establecerCostoCredito(costoCred);

                    // Luego que se han ingresado los datos respectivos, 
                    // se hace uso del método calcularMatricula que se ha 
                    // implementado en la clase EstudiantePresencial por
                    // obligatoriedad, ya que existe el método abstracto del 
                    // mismo nombre (calcularMatricula) declarado en nuestra
                    // clase abstracta.
                    estudianteP.calcularMatricula();

                    // Se procede a añadir el objeto creado en el ArrayList
                    // de estudiantes que se declaró al inicio de la presente 
                    // clase.
                    estudiantes.add(estudianteP);

                } else {
                    // Si el usuario ingresa el valor 2 que hace referencia a 
                    // tipoEstudiante se procede a emplear los procesos necesarios 
                    // para crear un objeto de este tipo.

                    // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    
                    // Solicitamos al usuario ingresar los valores para variables 
                    // numero de asignaturas y costo de cada asignatura 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese en el número de asignaturas del"
                            + " estudiante");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese en el costo de cada asignaturas del"
                            + " estudiante");
                    costoAsig = entrada.nextDouble();

                    // Se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    // Establecer:  
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);

                    // Una vez ingresados los datos respectivos, se hace uso del
                    // método calcularMatricula que se ha implementado en la
                    // clase EstudianteDistancia por obligatoriedad, ya que 
                    // existe el método abstracto del mismo nombre 
                    // (calcularMatricula) declarado en nuestra clase abstracta.
                    estudianteD.calcularMatricula();

                    // Se procede a añadir el objeto creado en el ArrayList
                    // de estudiantes que se declaró al inicio de la presente 
                    // clase.                    
                    estudiantes.add(estudianteD);
                }
                // Si la opción ingresada por el usuario es diferente de 1 o 2
                // Se procede a presentar un mensaje en pantalla informándole
                // al usuario que dicho valor es un error de opción.
            } else {
                System.out.println("Error en la opción");
            }
            // Se pregunta si se desea ingresar más estudiantes
            // Imprimir "Desea ingresar más estudiante. Digite la letra S para
            // continuar o digite la letra N para salir del proceso"
            System.out.println("Desea ingresar más estudiantes. Digite la letra"
                    + " S para continuar o digite la letra N para salir");
            // Se captura el valor ingresado por el usuario para la variable
            // carácter 
            // Leer continuar
            entrada.nextLine(); // limpiar buffer
            continuar = entrada.nextLine();

            // Se pregunta si el valor continuar es igual al valor "S", se sigue en 
            // ciclo repetitivo; si el valor es distinto de "S", se sale del ciclo
            // repetitivo
        } while (continuar.equals("S"));
       
        // Ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  Se recorre la lista calculando la matrícula de cada
            // uno de los objetos que se encuentran en ella, cabe recalcar
            // que se deja de lado la importancia de saber si el objeto es de
            // tipo EstudiantePresencial o EstudianteDistancia, sino más bien
            // lo esencial es calcular la matrícula de cada uno de los objetos
            // de la lista, sean del tipo que sean (EstudiantePresencial o 
            // EstudianteDistancia).
            estudiantes.get(i).calcularMatricula();
            
            // 2. Se procede a ir imprimiendo cada objeto de la lista
            System.out.printf("Datos Estudiante:\n"
                    + "%s\n",
                    estudiantes.get(i));
        }
    }

}
