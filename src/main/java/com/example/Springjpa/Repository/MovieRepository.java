package com.example.Springjpa.Repository;

import com.example.Springjpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,String> {
    // Here Movie is my Model class so Movie become table in Database and Primary Id of Movie is name and Data type
    // of name is String so that's why
//    JpaRepository<Moive,String>  I have to write like these
}
