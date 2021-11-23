package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        if (trooper == null){
            throw new IllegalArgumentException("Can not be null");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target){
        if (name == null || name.trim().length() == 0 || target == null){
            throw new IllegalArgumentException("Can not be null");
        }

        for (Trooper trooper: troopers){
            if (trooper.getName().equals(name)){
                trooper.changePosition(target);
            }
        }
    }

    public void moveClosestTrooper(Position target){
        if (target == null){
            throw new IllegalArgumentException("Can not be null");
        }

        moveTrooper(findClosestTrooper(target),target);
    }

    private Trooper findTrooperByName(String name){
        for (Trooper trooper: troopers){
            if (trooper.getName().equals(name)){
                return trooper;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target){

        if (target == null){
            throw new IllegalArgumentException("Can not be null");
        }

        Trooper closestTrooper = null;
        for (Trooper trooper: troopers){
            if (closestTrooper == null || trooper.distanceFrom(target) < closestTrooper.distanceFrom(target)){
                closestTrooper = trooper;
            }
        }
        return closestTrooper;
    }

    private void moveTrooper(Trooper trooper, Position target){

        trooper.changePosition(target);
    }
}
