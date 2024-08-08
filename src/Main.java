
    public class Main {
         public static void main(String[] args) {
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
    }

