package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int i){
        if (i <= 0){
            throw new IllegalArgumentException("Page number must be positive");
        }
        double sum = 0;
        int numOfC = 0;
        for (CatalogItem c: catalogItems){
            if (c.numberOfPagesAtOneItem() > i){
                sum += c.numberOfPagesAtOneItem();
                numOfC++;
            }
        }
        if (sum == 0){
            throw new IllegalArgumentException("No page");
        }
        return sum/numOfC;
    }

    public void deleteItemByRegistrationNumber(String s){
        CatalogItem catalogItem = null;
        for (CatalogItem c: catalogItems){
            if (c.getRegistrationNumber().equals(s)){
                catalogItem = c;
            }
        }
        catalogItems.remove(catalogItem);
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria){
        List<CatalogItem> result = new ArrayList<>();

        for (CatalogItem c: catalogItems){
            if (c.getTitles().contains(searchCriteria.getTitle()) || c.getContributors().contains(searchCriteria.getContributor())){
                result.add(c);
            }
        }
        return result;
    }

    public int getAllPageNumber(){
        int sum = 0;
        for (CatalogItem c: catalogItems){
            sum+= c.numberOfPagesAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getAudioLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c: catalogItems){
            if (c.hasAudioFeature()){
                result.add(c);
            }
        }
        return result;
    }

    public int getFullLength(){
        int sum = 0;
        for (CatalogItem c: catalogItems){
            sum+= c.fullLengthAtOneItem();
        }
        return sum;
    }

    public List<CatalogItem> getPrintedLibraryItems(){
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c: catalogItems){
            if (c.hasPrintedFeature()){
                result.add(c);
            }
        }
        return result;
    }
}
