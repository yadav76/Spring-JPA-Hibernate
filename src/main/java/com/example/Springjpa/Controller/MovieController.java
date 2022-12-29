package com.example.Springjpa.Controller;

import com.example.Springjpa.Model.Movie;
import com.example.Springjpa.Repository.MovieRepository;
import com.example.Springjpa.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/get_Movies")
    public List<Movie> getAll() {
        return movieService.getAllMovies();
    }

    @PostMapping("/add_movie")
    public void addMovie(@RequestBody() Movie movie) {
        movieService.addMovie(movie);
    }
}
