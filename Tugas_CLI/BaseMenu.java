package Tugas_CLI;

import java.util.Scanner;

public abstract class BaseMenu implements MenuAction {
    protected Scanner scanner = new Scanner(System.in);

    protected abstract void printTitle();

    protected String input(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }
}
