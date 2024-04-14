package Controllers;

import Dto.MovieDto;
import Model.Movie;
import Services.IService;
import Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.Collection;

@RestController
@RequestMapping("/api/movies")
@ComponentScan(basePackageClasses = IService.class)
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    public ResponseEntity<Collection<Movie>> getAllMovies() {
        Collection<Movie> movies = this.movieService.findAll();
        return new ResponseEntity<Collection<Movie>>(movies, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movie> createMovie(@RequestBody MovieDto movieDto) {
        Movie movie = convertToModel(movieDto);
        this.movieService.create(movie);
        return new ResponseEntity<Movie>(movie, HttpStatus.CREATED);
    }

    private Movie convertToModel(MovieDto dto) {
        return new Movie(dto.getTitle(), dto.getGenre(), dto.getYear());
    }

    private MovieDto convertToDto(Movie movie) {
        return new MovieDto(movie.getTitle(), movie.getGenre(), movie.getYear());
    }
}
