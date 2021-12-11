package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {

        Verb verb = new PhrasalVerb("talál","meg");
        System.out.println(verb.getWord());

        Verb verb2 = new PhrasalVerbWithSuffix("talál","meg","ja");
        System.out.println(verb2.getWord());

        Preposition preposition = new PhrasalVerb("talál","meg");
        System.out.println(preposition.getWholeWord());
        System.out.println(preposition.getPreposition());

        Preposition preposition2 = new PhrasalVerbWithSuffix("talál","meg","ja");
        System.out.println(preposition2.getWholeWord());
        System.out.println(preposition2.getPreposition());

        PhrasalVerb phrasalVerb = new PhrasalVerb("talál","meg");
        System.out.println(phrasalVerb.getWholeWord());
        System.out.println(phrasalVerb.getWord());
        System.out.println(phrasalVerb.getPreposition());

        PhrasalVerb phrasalVerb2 = new PhrasalVerbWithSuffix("talál","meg","ja");
        System.out.println(phrasalVerb2.getPreposition());
        System.out.println(phrasalVerb2.getWord());
        System.out.println(phrasalVerb2.getWholeWord());

        Suffix suffix = new PhrasalVerbWithSuffix("talál","meg","ja");
        System.out.println(suffix.getSuffix());

        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("talál","meg","ja");
        System.out.println(phrasalVerbWithSuffix.getSuffix());
        System.out.println(phrasalVerbWithSuffix.getPreposition());
        System.out.println(phrasalVerbWithSuffix.getWord());
        System.out.println(phrasalVerbWithSuffix.getWholeWord());
    }
}
