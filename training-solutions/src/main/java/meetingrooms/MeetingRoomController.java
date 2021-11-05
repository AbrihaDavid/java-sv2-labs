package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    private Office office = new Office();

    Scanner sc = new Scanner(System.in);

    public void printMenu(){
        System.out.println("1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");
    }

    public void readOffice(){
        System.out.println("Kérem adja meg a tárgyaló nevét: ");
        String name = sc.nextLine();
        System.out.println("Kérem adja meg a tárgyaló hosszúságát: ");
        int length = sc.nextInt();
        sc.nextLine();
        System.out.println("Kérem adja meg a tárgyaló szélességét: ");
        int width = sc.nextInt();
        MeetingRoom meetingRoom = new MeetingRoom(name,length,width);
        office.addMeetingRoom(meetingRoom);

    }

    public void runMenu(){
        System.out.println();
        printMenu();
        System.out.println("Adjon meg a kiválasztani kívánt menüpontnak megfelelően egy számot");
        int num = sc.nextInt();
        sc.nextLine();
        switch (num){
            case 1:
                readOffice();
                runMenu();
            case 2:
                office.printNames();
                runMenu();
            case 3:
                office.printNamesReverse();
                runMenu();
            case 4:
                office.printEvenNames();
                runMenu();
            case 5:
                office.printAreas();
                runMenu();
            case 6:
                System.out.println("Adja meg az egyik tárgyaló nevét:");
                String name = sc.nextLine();
                office.printMeetingRoomsWithName(name);
                runMenu();
            case 7:
                System.out.println("Adja meg az egyik tárgyaló nevének részletét:");
                String partOfName = sc.nextLine().toLowerCase();
                office.printMeetingRoomsContains(partOfName);
                runMenu();
            case 8:
                System.out.println("Adjon meg egy olyan egész számot, amelytől a nagyobb területű tárgyalók adataira kíváncsi:");
                int searchArea = sc.nextInt();
                office.printAreasLargerThan(searchArea);
                runMenu();
            case 9:
                System.exit(0);
        }
    }

    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
