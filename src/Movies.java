public class Movies {
    private int year;
    private double length;
    private String title;
    private String subject;
    private int popularity;
    private boolean hasAwards;

    public Movies(int year, double length, String title, String subject, int popularity, boolean hasAwards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.hasAwards = hasAwards;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "year=" + year +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", hasAwards=" + hasAwards +
                '}';
    }

    public double getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }


}
