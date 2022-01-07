package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private List<Feature> features = new ArrayList<>();
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... features) {
        this.features = Arrays.asList(features);
        this.price = price;
        this.registrationNumber = registrationNumber;
    }


    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem(){
        int sum = 0;
        for (Feature f: features){
            if (f instanceof AudioFeatures){
                sum += ((AudioFeatures) f).getLength();
            }
        }
        return sum;
    }

    public int numberOfPagesAtOneItem(){
        int sum = 0;
        for (Feature f: features){
            if (f instanceof PrintedFeatures){
                sum += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return sum;
    }

    public List<String> getContributors(){
        List<String> result = new ArrayList<>();
        for (Feature f: features){
            result.addAll(f.getContributors());
            }
        return result;
    }

    public List<String> getTitles(){
        List<String> result = new ArrayList<>();
        for (Feature f: features){
            result.add(f.getTitle());
        }
        return result;
    }

    public boolean hasAudioFeature(){
        for (Feature f: features){
            if (f instanceof AudioFeatures){
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature(){
        for (Feature f: features){
            if (f instanceof PrintedFeatures){
                return true;
            }
        }
        return false;
    }
}
