package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public List<String> makeBirthdayList(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please specify how many instances you wish to store");
        int instances = sc.nextInt();
        sc.nextLine();
        List<String> birthdayList = new ArrayList<>();
        for (int i = 1; i<=instances; i++){
            System.out.println("Please specify instance number: " + i);
            System.out.println("Add the name: ");
            String name = sc.nextLine();
            System.out.println("Add the date of birth: ");
            String dateOfBirth = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            birthdayList.add(sb.append(name).append(" - ").append(dateOfBirth).toString());
        }
        return birthdayList;
    }

    public static void main(String[] args) {

        Birthday birthday = new Birthday();

        try {
            Files.write(Paths.get("birthdays.txt"),birthday.makeBirthdayList());
        }
        catch (IOException ioe){
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }
}
