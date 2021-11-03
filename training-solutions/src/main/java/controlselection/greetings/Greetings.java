package controlselection.greetings;


public class Greetings {

    public String greetings (int hour, int minute){
        if (hour >= 5 && hour < 9){
            return "Jó reggelt";
        } else if (hour >=9 && (hour <= 18 && minute <=30)){
            return "Jó napot";
        } else if (hour < 20){
            return "Jó estét";
        } else {
            return "Jó éjt";
        }
    }
}
