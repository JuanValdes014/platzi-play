package com.platzi_play.persistence;

import com.platzi_play.domain.dto.MovieDto;
import com.platzi_play.domain.repository.MovieRepository;
import com.platzi_play.persistence.crud.CrudMovieEntity;
import com.platzi_play.persistence.mapper.MovieMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity , MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll(){
        return this.movieMapper.toDtos(this.crudMovieEntity.findAll());
    }
}
