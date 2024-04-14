package Dto;

public class MovieDto {
    private String title;
    private String Genre;
    private long year;

    public MovieDto() {}

    public MovieDto(String title, String genre, long year) {
        this.title = title;
        Genre = genre;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }
}
