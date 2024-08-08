public class CalificacionEstudiantes {

    public static void main(String[] args) {
        // Definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes
        System.out.println("Información de los estudiantes:");//Imprimimos el mensaje
        for (int i = 0; i < estudiantes.length; i++) {//Utilizamos este bucle para recorrer el arreglo de estudiantes
            System.out.println("Estudiante: " + estudiantes[i]);//Para cada estudiante imprimimos su nombre
            for (int j = 0; j < materias.length; j++) {//Utilizamos este bucle para recorrer el arreglo materias
                System.out.println("  " + materias[j] + ": " + notas[i][j]);//Para cada materia, imprimimos el nombre de la materia y la nota correspondiente del estudiante (notas[i][j]).
            }
        }

        // Calculamos y mostramos los promedios de cada estudiante
        System.out.println("\nPromedios de los estudiantes:");//Imprimimos el mensaje
        for (int i = 0; i < estudiantes.length; i++) {//Utilizamos el bucle para recorrer el arreglo de los estudiantes
            double suma = 0;//inicializamos suma en 0.
            for (int j = 0; j < notas[i].length; j++) {//Utilizamos otro bucle for para recorrer las notas del estudiante.
                suma += notas[i][j];//Sumamos cada nota a suma.
            }
            double promedio = suma / notas[i].length;//Calculamos el promedio dividiendo suma por el número de notas (notas[i].length).
            System.out.println(estudiantes[i] + ": " + promedio);//Imprimimos el nombre del estudiante y su promedio.
        }

        // Encontramos y mostramos al estudiante con el promedio más alto
        double mejorPromedio = -1;//se inicializa a -1 para asegurarse de que cualquier promedio calculado será mayor que este valor inicial.
        String mejorEstudiante = "";//se inicializa como una cadena vacía.
        for (int i = 0; i < estudiantes.length; i++) {//Este bucle recorre todos los estudiantes
            double suma = 0;//suma se inicializa a 0 para empezar a acumular las notas del estudiante actual.
            for (int j = 0; j < notas[i].length; j++) {//Un bucle for interno recorre todas las notas del estudiante actual
                suma += notas[i][j];//Se añade la nota notas[i][j] a suma.
            }
            double promedio = suma / notas[i].length;//Se calcula el promedio dividiendo suma por el numero total de notas
            if (promedio > mejorPromedio) {//Si el promedio del estudiante actual es mayor que mejorPromedio, se actualizan mejorPromedio y mejorEstudiante con los valores actuales.
                mejorPromedio = promedio;
                mejorEstudiante = estudiantes[i];
            }
        }
        System.out.println("\nEl mejor estudiante es: " + mejorEstudiante + " con un promedio de " + mejorPromedio);//Se imprime el estudiante con el mejor promedio y su promedio

        // Encontramos y mostramos la materia con el promedio más alto
        double[] promediosMaterias = new double[materias.length];//promediosMaterias se inicializa como un nuevo arreglo de dobles con el tamaño de materias.length.
        for (int j = 0; j < materias.length; j++) {//Este bucle recorre todas las materias
            double suma = 0;//Iniciaizamos la suma en 0 para empezar a acumular las notas de la materia actual
            for (double[] nota : notas) {//Recorre todas las filas del arreglo
                suma += nota[j];//Se añade la nota[j] a suma
            }
            promediosMaterias[j] = suma / notas.length;//Se calcula el promedio dividiendo suma por el total de estudiantes
        }

        double mejorPromedioMateria = promediosMaterias[0];//mejorPromedioMateria se inicializa con el primer valor del arreglo promediosMaterias.
        int indiceMejorMateria = 0;//Se inicializa en 0
        for (int j = 1; j < promediosMaterias.length; j++) {//El bucle recorre recorre los elementos de promediosMaterias desde el segundo elemento
            if (promediosMaterias[j] > mejorPromedioMateria) {//Si esto se cumple se actualizan mejorPromedioMateria y indiceMejorMateria con los valores actuales.
                mejorPromedioMateria = promediosMaterias[j];
                indiceMejorMateria = j;
            }
        }
        System.out.println("\nLa materia con mejor promedio es: " + materias[indiceMejorMateria] + " con un promedio de " + mejorPromedioMateria);//Se imprime la materia con el mejor promedio y su promedio
    }
}
