package Services;

import Model.Movie;
import Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@ComponentScan ("Repositories")
@EnableJpaRepositories("Repositories")
public class MovieService implements IService<Movie, Long>{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Collection<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public void create(Movie object) {
        movieRepository.save(object);
    }

    @Override
    public Movie findOne(Long id) {
        return null;
    }

    @Override
    public void update(Movie object) {
        movieRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        movieRepository.deleteById(id);
    }
}
