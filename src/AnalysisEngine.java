import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class AnalysisEngine {
    private ArrayList<Movies> movies;

    public AnalysisEngine(ArrayList<Movies> movies) {
        this.movies = movies;
    }


    public void findLongestName() {
        String maxValue = this.movies.get(0).getTitle();
        for (int i = 0; i < this.movies.size(); i++) {
            String currentMovie = this.movies.get(i).getTitle();

            if (maxValue.length() < currentMovie.length()) {
                maxValue = this.movies.get(i).getTitle();
            }

        }
        System.out.println("The movie '" + maxValue + "' has the longest title");

    }

    public void amountOfMoviesInFranchise() {
        System.out.println("\n");
        int amountOfMovies = 0;
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getTitle().contains("Star Trek")) {
                System.out.println(this.movies.get(i).getTitle());
                amountOfMovies ++;
            }

        }
        System.out.println();
        System.out.println("There are " + amountOfMovies + " in the Star Trek franchise\n");


    }

    public void findTheAverageLength() {
        double dataset[] = new double[this.movies.size()];
        for (int i = 0; i < this.movies.size(); i++) {
            dataset[i] = this.movies.get(i).getLength();
        }
        DoubleSummaryStatistics stats = DoubleStream.of(dataset).summaryStatistics();
        double averageInMinutes = stats.getAverage();
        double averageInHours = averageInMinutes/60;
        System.out.println("The average length of the movies = " + averageInHours + "hours");
    }

    public static void highestAmountOfWordsInTitle() {

    }

}

