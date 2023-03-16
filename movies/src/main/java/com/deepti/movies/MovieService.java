package com.deepti.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  @Autowired // this annotation tells spring to inject the MovieRepository into this class i.e to instantiate it
  private MovieRepository movieRepository;

  public List<Movie> allMovies() {
    return movieRepository.findAll(); // this method is provided by MongoRepository
  }

  public Optional<Movie> singleMovie(String imdbId){
    return movieRepository.findMovieByImdbId(imdbId);
  }
}
