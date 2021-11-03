package controlselection.week;

public class DayOfWeeks {

    public String statusOfWeek (String day){
        String status;

        switch (day.toLowerCase()){
            case "hétfő":
                status = "hét eleje van";
                break;
            case "kedd", "szerda", "csütörtök":
                status = "hét közepe van";
                break;
            case "péntek":
                status = "majdnem hétvége van";
                break;
            case "szombat", "vasárnap":
                status = "hét vége van";
                break;
            default:
                status = "ismeretlen nap";
        }
        return status;
    }
}
