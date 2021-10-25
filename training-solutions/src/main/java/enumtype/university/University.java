package enumtype.university;

public enum University {
    DE("Debreceni Egyetem"),SZTE ("Szegedi Tudományegyetem"),PTE ("Pécsi Tudományegyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
