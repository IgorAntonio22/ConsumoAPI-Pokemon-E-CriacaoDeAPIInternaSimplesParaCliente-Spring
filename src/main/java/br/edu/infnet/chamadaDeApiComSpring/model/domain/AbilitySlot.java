package br.edu.infnet.chamadaDeApiComSpring.model.domain;

public class AbilitySlot { //posicao 0,1,etc

	private Ability ability;
	private boolean isHidden;
	private int slot;
	
	public Ability getAbility() {
		return ability;
	}
	public void setAbility(Ability ability) {
		this.ability = ability;
	}
	public boolean isHidden() {
		return isHidden;
	}
	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	
	
}
