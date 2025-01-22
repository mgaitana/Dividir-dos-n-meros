import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numerador: ");
            int numerador = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese el denominador: ");
            int denominador = Integer.parseInt(sc.nextLine());


            int resultado = numerador / denominador;
            System.out.println("resultado: " + resultado);

        } catch (ArithmeticException  e) {
            System.out.println("Error: No se puede dividir por cero");
        } catch (NumberFormatException e) {
            System.out.println("Error: El valor ingresado no es un número válido");
        }finally {
            System.out.println("Programa finalizado");
            sc.close();
        }
    }
}
