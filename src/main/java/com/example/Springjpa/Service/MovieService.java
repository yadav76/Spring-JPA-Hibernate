package com.example.Springjpa.Service;

import com.example.Springjpa.Model.Movie;
import com.example.Springjpa.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // @Service anotation already written @Controller in it. so we don't have to write it again
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    // JPA is Interface so I can't make class of JPA but JPA is implementing Hibernate at backend and Hibernate is class
    // so indirectly I am making object of Hibernate by extending JPA in MovieRespository.
    // At backend Hibernate is extending JPA and creating class of IT.

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
        // that's it I have to write to get all list of Movie from Database. It is so simple using Hibernate
        // I don't have to write any SQL Query to get Data from Database. Hibernate will do that for us.
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
        // save() method is used to insert data into database. No SQL query will be needed.
        // Here if Exception occurs then that is also handled by JPA.
    }
}
