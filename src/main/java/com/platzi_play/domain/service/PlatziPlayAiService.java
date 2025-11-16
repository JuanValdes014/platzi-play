package com.platzi_play.domain.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestión de peliculas de PlatziPlay
            usa menos de 120 caracteres y hazlo con el estilo de platziplay.
            """)
    String generateGreeting(@V("platform") String platform);

    @SystemMessage("""
            Eres un esperto en cine que recomienda peliculas personalizadas según los gustos del usuario.
            debes recomendar máximo 3 peliculas.
            No incluyas peliculas que esten por fuera de la plataforma.
            """)
    String generateMoviesSuggestion(@UserMessage String userMessage);
}
