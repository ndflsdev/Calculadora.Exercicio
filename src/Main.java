import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double int1= scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double int2 = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        double result = 0;

        switch (operador){
            case '+':
                result = int1 + int2;
                break;
            case '-':
                result = int1 - int2;
                break;
            case '*':
                result = int1 * int2;
                break;
            case '/':
                result = int1 / int2;
                break;
                }
                System.out.print(int1+" " + operador + " " + int1+ " "+ result);
        }


    }
