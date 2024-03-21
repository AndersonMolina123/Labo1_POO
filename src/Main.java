//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcion;

        do {
            System.out.println("Menu");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    int sumando1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int sumando2 = scanner.nextInt();
                    int suma = sumar(sumando1, sumando2);
                    System.out.print("El resultado de la suma es: " + suma);
                    break;

                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    int minuendo = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int sustraendo = scanner.nextInt();
                    int resta = restar(minuendo, sustraendo);
                    System.out.print("El resultado de la resta es: " + resta);
                    break;

                case 3:
                    System.out.print("Ingrese el primer numero: ");
                    int multiplicando = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int multiplicador = scanner.nextInt();
                    int multiplicacion = multiplicar(multiplicando, multiplicador);
                    System.out.print("El resultado de la multiplicacion es: " + multiplicacion);
                    break;

                case 4:
                    System.out.print("Ingrese el primer numero: ");
                    int dividiendo = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int divisor = scanner.nextInt();
                    if (divisor != 0){
                        double division = dividir(dividiendo, divisor);
                        System.out.print("El resultado de la multiplicacion es: " + division);
                    } else{
                        System.out.print("no se puede dividir en cero");
                    }
                    break;

                case 5:
                    System.out.println("Salu!");
                    break;
                default:
                    System.out.println("la opcion no es valida!");
                    break;
            }

        }while (opcion != 5);

        scanner.close();
    }
    public static int sumar(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static double dividir(int a, int b){
        return (double) a / b;
    }
}