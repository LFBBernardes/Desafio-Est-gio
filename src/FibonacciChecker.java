import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        if (num == a || num == b) return true;
        int c = a + b;
        while (c <= num) {
            if (c == num) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}
