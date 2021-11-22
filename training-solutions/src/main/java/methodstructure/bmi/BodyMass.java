package methodstructure.bmi;

public class BodyMass {

    private int weight;
    private int height;

    public BodyMass(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getBodyMassIndex(){
        return ( (double) weight /(height*height));
    }

    public BmiCategory getBody(){
        if (getBodyMassIndex() < 18.5){
            return BmiCategory.UNDERWEIGHT;
        } else if (getBodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        else {
            return BmiCategory.NORMAL;
        }
    }

    public boolean isThinnerThan (BodyMass other){
        return this.getBodyMassIndex() < other.getBodyMassIndex();
    }
}
