package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addMeetingRoom (MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for (MeetingRoom meetingRoom: meetingRooms){
            System.out.print(meetingRoom.getName() + ", ");
        }
        System.out.println();
    }

    public void printNamesReverse(){
        for (int i = meetingRooms.size() -1; i>=0; i--){
            System.out.print(meetingRooms.get(i).getName() + ", ");
        }
        System.out.println();
    }

    public void printEvenNames(){
        for (int i = 0; i<meetingRooms.size();i++){
            if (i%2 != 0){
                System.out.print(meetingRooms.get(i).getName() + ", ");
            }
        }
        System.out.println();
    }

    public void printAreas(){
        for (MeetingRoom meetingRoom: meetingRooms){
            System.out.println(meetingRoom.toString());
        }
    }

    public void printMeetingRoomsWithName (String name){
        for (MeetingRoom meetingRoom: meetingRooms){
            if (name.equals(meetingRoom.getName())){
                System.out.println(meetingRoom.toString());
            }
        }
    }

    public void printMeetingRoomsContains (String part){
        for (MeetingRoom meetingRoom: meetingRooms){
            if (meetingRoom.getName().toLowerCase().contains(part)){
                System.out.println(meetingRoom.toString());
            }
        }
    }

    public void printAreasLargerThan (int area){
        for (MeetingRoom meetingRoom: meetingRooms){
            if (meetingRoom.getArea() > area){
                System.out.println(meetingRoom.toString());
            }
        }
    }
}
