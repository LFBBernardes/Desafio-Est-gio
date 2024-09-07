import java.util.Scanner;

public class CountLetterA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para verificar a existência da letra 'a': ");
        String input = scanner.nextLine();

        int count = countOccurrencesOfA(input);
        System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vezes.");
    }

    public static int countOccurrencesOfA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }
        return count;
    }
}
