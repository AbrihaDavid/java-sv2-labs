package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserValidator uv = new UserValidator();

        System.out.println("Please add your username");
        System.out.println(uv.isValidUsername(sc.nextLine()) ? "Your username is valid" : "Your username is invalid");


        System.out.println("Please specify your password");
        String passwordOne = sc.nextLine();
        System.out.println("Please specify your password again");
        String passwordTwo = sc.nextLine();
        System.out.println(uv.isValidPassword(passwordOne,passwordTwo) ? "You password is valid" : "You password is invalid");


        System.out.println("Please specify your email");
        System.out.println(uv.isValidEmail(sc.nextLine()) ? "Your email is valid" : "Your email is invalid");



    }

}
