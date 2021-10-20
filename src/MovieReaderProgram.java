import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieReaderProgram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Movies> allMovies = new ArrayList<Movies>();
        File movies = new File(".idea/moviesList/movies.csv");
        try {
            Scanner sc = new Scanner(movies);
            while(sc.hasNextLine()){
                String movie = sc.nextLine();
                String[] movieArray = movie.split(";");
                int year = Integer.parseInt(movieArray[0]);
                double length = Double.parseDouble(movieArray[1]);
                String title = movieArray[2];
                String subject = movieArray[3];
                int popularity = Integer.parseInt(movieArray[4]);
                Boolean hasAwards;
                if (movieArray[5].equalsIgnoreCase("Yes")){
                    hasAwards = true;
                } else {
                    hasAwards = false;
                }
                Movies currentMovie = new Movies(year,length,title,subject,popularity,hasAwards);
                allMovies.add(currentMovie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
            e.printStackTrace();
        }
        AnalysisEngine theMovies = new AnalysisEngine(allMovies);



        theMovies.findTheAverageLength();





    }
}
