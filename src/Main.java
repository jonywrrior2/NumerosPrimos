import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int inicio, fin, contador = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escribe el inicio: (0 para salir)");
            inicio = sc.nextInt();
            if (inicio == 0){
                System.exit(0);
            }
            System.out.println("Escribe el fin:");
            fin = sc.nextInt();
            for (int x = inicio; x <= fin; x++) {
                System.out.println(x);
            }

            for (int x = inicio; x <= fin; x++) {
                if (esPrimo(x)) {
                    contador++;
                    System.out.print(String.valueOf(x) + ",");
                }
            }
            System.out.println("Se han encontrado " + contador + " numeros primos en el intervalo");
        }
    while (inicio !=0);
    }

    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
    }
