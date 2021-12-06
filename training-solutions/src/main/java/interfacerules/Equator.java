package interfacerules;

public class Equator implements Name, Length{

    private static final String NAME = "Equator";
    private static final double LENGTH = 40075;

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
