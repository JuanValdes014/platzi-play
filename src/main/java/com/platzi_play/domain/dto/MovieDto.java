package com.platzi_play.domain.dto;

import com.platzi_play.domain.Genre;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        Genre genre,
        LocalDate releaseDate,
        Double rating

) {
}
