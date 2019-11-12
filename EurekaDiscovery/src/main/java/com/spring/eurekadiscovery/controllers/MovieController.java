package com.spring.eurekadiscovery.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.eurekadiscovery.models.Movie;

@RestController
public class MovieController {
	
	//simulating data query from database
	private static List<Movie> movieList = new ArrayList<>();
    static {
        movieList.add(new Movie(1, "Rush Hour 1", "Comic action movie by Jack and Tucker", 5.0));
        movieList.add(new Movie(2, "Johny English Reborn", "Johny English a.k.a Mr. Bean and Chris Tucker", 4.5));
        movieList.add(new Movie(3, "Head of State", "Describes how American elections can be, by Chris Rock", 4));
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getMovies() {
        return ResponseEntity.ok(movieList);
    }
}
