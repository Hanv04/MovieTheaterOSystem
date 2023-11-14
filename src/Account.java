import java.util.Random;
import java.util.Scanner;

public class Account {
    Scanner input= new Scanner(System.in);
    String name;
    String newUsername;
    String password;
    public void username(){

        //create username for user's account
        System.out.println("Enter your first name and press Enter. ");
        String name= input.next();
        String userName = name.substring(0, 3).toUpperCase();
        newUsername = userName.concat("4user");
        System.out.println("Your username is: "+ newUsername);
    }
    public void password(){
        //create password for user's account
        System.out.println("Enter your last name and press enter.");
        String lastName= input.next();
        String newLast = lastName.substring(lastName.length() - 1).toLowerCase();
        Random rand= new Random();
        int number = rand.nextInt(99)+10;
        String password= newUsername + number + newLast;
        System.out.println("Your password is: "+ password);
    }
    public void login() {
        //Login into account
        System.out.println("Enter your username: ");
        String reUsername = input.next();
        System.out.println("Enter your password: ");
        String rePassword = input.next();
        if (reUsername.equals(newUsername) && rePassword.equals(password)) {
            System.out.println("Welcome back " + name + "!");
        }
        else {
        System.out.println("You have entered the incorrect username/password. Please rerun the system.");
        }
    }


}
