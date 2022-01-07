package catalog;

import static catalog.Validators.isBlank;
import static catalog.Validators.isEmpty;

public class SearchCriteria {

    public String contributor;
    public String title;

    private SearchCriteria(String title, String contributor){
        this.title = title;
        this.contributor = contributor;
    }

    public static SearchCriteria createByBoth(String title, String contributor){
        if (isBlank(title) || isBlank(contributor)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title,contributor);
    }

    public static SearchCriteria createByContributor(String contributor){
        if (isBlank(contributor)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(null,contributor);

    }

    public static SearchCriteria createByTitle(String title){
        if (isBlank(title)){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(title,null);

    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasContributor(){
        return !isBlank(contributor);
    }

    public boolean hasTitle(){
        return !isBlank(title);
    }
}
