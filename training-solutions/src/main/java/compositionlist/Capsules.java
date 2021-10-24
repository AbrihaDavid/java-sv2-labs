package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsuleColor = new ArrayList<>();

    public void addLast(String color){
        capsuleColor.add(color);
    }

    public void addFirst (String color){
        capsuleColor.add(0,color);
    }

    public void removeFirst(){
        capsuleColor.remove(0);
    }

    public void removeLast(){
        capsuleColor.remove(capsuleColor.size()-1);
    }

    public List<String> getColors(){
        return capsuleColor;
    }

    public static void main(String[] args) {

        Capsules capsules = new Capsules();
        capsules.addFirst("red");
        capsules.addFirst("black");
        capsules.addLast("brown");
        capsules.addLast("blue");
        capsules.addFirst("pink");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
