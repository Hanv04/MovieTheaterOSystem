import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the IS147 Theater! Register for an account now!");
        Account account = new Account();
        account.username();
        account.password();
        System.out.println("------------------------------------------------");
        account.login();
    }


}