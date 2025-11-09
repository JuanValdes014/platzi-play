package com.platzi_play.domain.dto;

import java.time.LocalDate;

public record MovieDto(
        String title,
        Integer duration,
        String gender,
        LocalDate releaseDate,
        Double rating

) {
}
