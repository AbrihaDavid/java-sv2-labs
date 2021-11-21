package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> movieList = new ArrayList<>();

    public VideoTheque(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie (Movie movie){
        movieList.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven (Category category){

        List<Movie> filteredMovies = new ArrayList<>();

        for (Movie m: movieList){
            if (m.getCategory() == category && m.getRating() > 3){
                filteredMovies.add(m);
            }
        }
        return filteredMovies;
    }
}
