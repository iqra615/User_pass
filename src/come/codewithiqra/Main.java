package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username, password;
        Scanner io = new Scanner(System.in);
        System.out.println("Enter Username:");
        username = io.nextLine();
        System.out.println("Enter Password:");
        password = io.nextLine();
        if(username.equals("user") && password.equals("user"))
        {

            System.out.println("Authentication Successfull");
        }
        else
        {

            System.out.println("Authenticatione Failed");
        }

    }
}
