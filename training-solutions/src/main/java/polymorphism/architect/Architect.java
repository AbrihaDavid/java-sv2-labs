package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {

        Plan planSketch = new SketchPlan(10,"Best building");
        Plan planPermit = new PermitPlan(50,"Awesome building","Jack Doe","Debrecen, Egyetem tér 1");
        Plan planConstruction = new ConstructionPlan(1,"Lame building","Bob","Sopron, Fő út 10",1);
        SketchPlan sketchPlan = new SketchPlan(10,"Best building");
        SketchPlan sketchPermit = new PermitPlan(50,"Awesome building","Jack Doe","Debrecen, Egyetem tér 1");
        SketchPlan sketchConstruction = new ConstructionPlan(1,"Lame building","Bob","Sopron, Fő út 10",1);
        Header headerPermit = new PermitPlan(500,"Tower","Jack","Budapest");
        Header headerConstruction = new ConstructionPlan(1,"Lame building","Bob","Sopron, Fő út 10",1);
        PermitPlan permitPlan = new PermitPlan(50,"Awesome building","Jack Doe","Debrecen, Egyetem tér 1");
        PermitPlan permitConstruction = new ConstructionPlan(1,"Lame building","Bob","Sopron, Fő út 10",1);
        ConstructionPlan constructionPlan = new ConstructionPlan(1,"Lame building","Bob","Sopron, Fő út 10",1);

        System.out.println(planSketch.getPagesOfDocumentation());
        System.out.println(planPermit.getPagesOfDocumentation());
        System.out.println(planConstruction.getPagesOfDocumentation());

        System.out.println(sketchPlan.getTitle());
        System.out.println(sketchPlan.getPagesOfDocumentation());
        System.out.println(sketchPermit.getTitle());
        System.out.println(sketchPermit.getPagesOfDocumentation());
        System.out.println(sketchConstruction.getTitle());
        System.out.println(sketchConstruction.getPagesOfDocumentation());

        System.out.println(headerPermit.getNameOfClient());
        System.out.println(headerPermit.getAddressOfBuilding());
        System.out.println(headerConstruction.getNameOfClient());
        System.out.println(headerConstruction.getAddressOfBuilding());

        System.out.println(permitPlan.getTitle());
        System.out.println(permitPlan.getHeader());
        System.out.println(permitPlan.getAddressOfBuilding());
        System.out.println(permitPlan.getPagesOfDocumentation());
        System.out.println(permitPlan.getNameOfClient());

        System.out.println(permitConstruction.getTitle());
        System.out.println(permitConstruction.getHeader());
        System.out.println(permitConstruction.getAddressOfBuilding());
        System.out.println(permitConstruction.getPagesOfDocumentation());
        System.out.println(permitConstruction.getNameOfClient());

        System.out.println(constructionPlan.getSheetsOfConstructionDrawings());
        System.out.println(constructionPlan.getTitle());
        System.out.println(constructionPlan.getHeader());
        System.out.println(constructionPlan.getAddressOfBuilding());
        System.out.println(constructionPlan.getPagesOfDocumentation());
        System.out.println(constructionPlan.getNameOfClient());
    }
}
