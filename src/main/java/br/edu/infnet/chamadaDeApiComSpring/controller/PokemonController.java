package br.edu.infnet.chamadaDeApiComSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.chamadaDeApiComSpring.model.domain.Pokemon;
import br.edu.infnet.chamadaDeApiComSpring.model.services.PokemonService;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

	@Autowired
	PokemonService pokemonService;
	
	@GetMapping(value = "/{nomeDoPokemon}")
	Pokemon obterPorNome(@PathVariable String nomeDoPokemon) {
		return pokemonService.obterPokemonEspecifico(nomeDoPokemon);
	}
}
