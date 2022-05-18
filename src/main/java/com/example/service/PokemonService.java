package com.example.service;

import com.example.pojo.Pokemon;
import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class PokemonService {
    private List<Pokemon> pokemonData = Arrays.asList(
            new Pokemon("Bulbasaur", List.of("Grass", "Poison")),
            new Pokemon("Ivysaur", List.of("Grass", "Poison")),
            new Pokemon("Venusaur", List.of("Grass", "Poison")),
            new Pokemon("Charmander", List.of("Fire")),
            new Pokemon("Charmeleon", List.of("Fire")),
            new Pokemon("Charizard", List.of("Fire", "Flying")),
            new Pokemon("Squirtle", List.of("Water")),
            new Pokemon("Wartortle", List.of("Water")),
            new Pokemon("Blastoise", List.of("Water"))
    );

    public Pokemon randomPokemon() {
        return pokemonData.get(new Random().nextInt(pokemonData.size()));
    }
}
