package com.platzi_play.web.controller;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.domain.service.MovieService;
import com.platzi_play.persistence.crud.CrudMovieEntity;
import com.platzi_play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<MovieDto>> getAll() {
        return ResponseEntity.ok(this.movieService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getById(@PathVariable long id) {
        MovieDto movieDto = this.movieService.getById(id);

        if(movieDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(movieDto);
    }
}
