package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer = new ArrayList<>();
    private int length;
    private List<String> performers = new ArrayList<>();
    private String title;

    public AudioFeatures(String title, int length, List<String> performers) {
        this.length = length;
        this.performers = performers;
        this.title = title;
        if (!isValid()){
            throw new IllegalArgumentException();
        }
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
        if (!isValid()){
            throw new IllegalArgumentException();
        }
    }

    public List<String> getComposer() {
        return composer;
    }

    public int getLength() {
        return length;
    }

    public List<String> getPerformers() {
        return performers;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < performers.size()){
            if (!getComposer().isEmpty()){
                result.add(getComposer().get(i));
            }
            result.add(getPerformers().get(i));
            i++;
        }
        return result;
    }

    private boolean isValid(){
        if (title == null || title.isEmpty()){
            return false;
        }
        if (length < 0){
            return false;
        }
        if (getPerformers().isEmpty()){
            return false;
        }
        return true;
    }
}
