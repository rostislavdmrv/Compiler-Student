package sit.sem7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VariableName name = new VariableName();


        System.out.print("Въведете име на променлива за проверка: ");
        String input = scanner.nextLine();

        if (name.isValidVariableName(input)) {
            System.out.println("Името е валидно!");
        } else {
            System.out.println("Името не е валидно!");
        }

        scanner.close();
    }
}
