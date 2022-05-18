package com.example.controller;

import com.example.pojo.BaseResponse;
import com.example.service.PokemonService;
import com.example.pojo.Pokemon;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Get("/")
    public BaseResponse<String> getStatus() {
        return new BaseResponse<>(200, "Hello World!");
    }

    @Get("/pokemon")
    public BaseResponse<Pokemon> getPokemon() {
        return new BaseResponse<>(200, pokemonService.randomPokemon());
    }

}
