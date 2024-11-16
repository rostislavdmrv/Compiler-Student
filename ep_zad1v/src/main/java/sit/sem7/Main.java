package sit.sem7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsValidInteger digit = new IsValidInteger();


        System.out.print("Въведете низ за проверка: ");
        String input = scanner.nextLine();

        if (digit.isValidIntegerConstant(input)) {
            System.out.println("Низът е валидна целочислена константа!");
        } else {
            System.out.println("Низът не е валидна целочислена константа!");
        }

        scanner.close();
    }
}











/*Невалидни -125, 12 36 ,2.59 , празен низ*/