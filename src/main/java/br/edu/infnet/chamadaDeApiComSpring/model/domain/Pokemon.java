package br.edu.infnet.chamadaDeApiComSpring.model.domain;

import java.util.List;


public class Pokemon {

	private String name;
	private int id;
	private List<AbilitySlot> abilities;

	
	@Override
	public String toString() {
		return "Nome: " + name + " id: " + id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public List<AbilitySlot> getAbilities() {
		return abilities;
	}


	public void setAbilities(List<AbilitySlot> abilities) {
		this.abilities = abilities;
	}

}
