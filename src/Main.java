
    public class Main {
     /*   public static void main(String[] args) {
            // 1. Declaración e inicialización de un arreglo
            int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6};

            // 2. Imprimir el arreglo original
            System.out.println("Arreglo original:");//Imprimimos el mensaje
            for (int num : numeros) { //Recorre cada elemento del arreglo numeros
                System.out.print(num + " ");//Imprimimos el valor seguido de un espacio (" ").
            }
            System.out.println();//imprimimos una nueva línea para asegurar que la salida siguiente empiece en una nueva línea.

            // 3. Encontrar el número mayor
            int mayor = numeros[0]; //Inicializamos la variable mayor con el primer elemento del arreglo numeros (en la posición 0).
            for (int i = 1; i < numeros.length; i++) { //Utilizamos un bucle for que empieza desde el segundo elemento (i = 1) hasta el último elemento (i < numeros.length).
                if (numeros[i] > mayor) { //comparamos cada elemento numeros[i] con la variable mayor.
                    mayor = numeros[i]; //Si numeros[i] es mayor que mayor, actualizamos mayor con el valor de numeros[i].
                }
            }
            System.out.println("El número mayor es: " + mayor);//Despues de recorrer el arreglo imprimimos el numero mayor encontrado

            // 4. Calcular el promedio
            int suma = 0;//Inicializamos la variable suma en 0
            for (int num : numeros) {//Utilizamos el bucle para recorrer cada elemento del arreglo numeros
                suma += num; //En este caso para cada elemento num sumamos su valor a suma
            }
            double promedio = (double) suma / numeros.length; //calculamos el promedio dividiendo suma por el numero de elementos del arreglo colocamos double para asegurarnos que la division se realice en coma flotante y no en enteros
            System.out.println("El promedio es: " + promedio); //Imprimimos el promedio calculado

            // 5. Invertir el arreglo
            int inicio = 0; //Inicializamos la varible en 0 para el comienzo del arreglo
            int fin = numeros.length - 1;// Inicializamos la variable fin como final del arreglo
            while (inicio < fin) {//En el bucle while se ejecuta mientras inicio sea menor que fin,
                                                 // lo que vamos a hacer dentro del bucle es intercambiar los elementos de posiciones
                int temp = numeros[inicio];//Usamos una variable temporal temp para almacenar el valor de numeros[inicio].
                numeros[inicio] = numeros[fin];//Asignamos numeros[fin] a numeros[inicio].
                numeros[fin] = temp;//Asignamos temp (que contiene el valor original de numeros[inicio]) a numeros[fin].
                inicio++;//Incrementamos inicio y decrementamos fin para movernos hacia el centro del arreglo.
                fin--;
            }
            System.out.println("Arreglo invertido:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();// mprimimos el arreglo invertido de la misma manera que imprimimos el arreglo original.

            // 6. Ordenar el arreglo (algoritmo de burbuja)
            int n = numeros.length;//Utilizamos dos bucles for anidados para implementar el algoritmo de burbuja.
            for (int i = 0; i < n - 1; i++) {//(i) recorre el arreglo desde el primer hasta el penúltimo elemento (n - 1).
                for (int j = 0; j < n - i - 1; j++) {//(j) recorre el arreglo desde el primer hasta el n - i - 1 elemento.
                                                     //En cada iteración del bucle interior, comparamos los elementos adyacentes (numeros[j] y numeros[j + 1]).
                    if (numeros[j] > numeros[j + 1]) {// Si numeros[j] es mayor que numeros[j + 1], los intercambiamos usando una variable temporal temp.
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
            System.out.println("Arreglo ordenado:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println(); //Después de ordenar el arreglo, lo imprimimos de la misma manera que los arreglos anteriores.
        }
*/



        // public static class GestionEstudiantes {
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
       // }

    }

