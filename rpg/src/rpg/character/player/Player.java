package rpg.character.player;

import rpg.attributes.character.player.AttributesPlayer;
import rpg.character.Character;
import rpg.character.player.classes.EnumClasses;
import rpg.items.equipament.armor.Breastplate;
import rpg.items.equipament.armor.Boots;
import rpg.items.equipament.armor.Gloves;
import rpg.items.equipament.armor.Helmet;

public abstract class Player extends Character {
	
	public Player() {
		
	}
	
	public Player(EnumClasses classe) {
		this.classe = classe;
	}
	
	private AttributesPlayer attributes;
	private EnumClasses classe;
	
	private Helmet helmet;
	private Breastplate armor;
	private Gloves gloves;
	private Boots boots;

	public Helmet getHelmet() {
		return helmet;
	}

	public void setHelmet(Helmet helmet) {
		this.helmet = helmet;
	}

	public Breastplate getArmor() {
		return armor;
	}

	public void setArmor(Breastplate armor) {
		this.armor = armor;
	}

	public Gloves getGloves() {
		return gloves;
	}

	public void setGloves(Gloves gloves) {
		this.gloves = gloves;
	}

	public Boots getBoots() {
		return boots;
	}

	public void setBoots(Boots boots) {
		this.boots = boots;
	}

	public EnumClasses getClasse() {
		return classe;
	}

	public void setClasse(EnumClasses classe) {
		this.classe = classe;
	}
	
	public AttributesPlayer getAttributes() {
		return attributes;
	}

	public void setAttributes(AttributesPlayer attributes) {
		this.attributes = attributes;
	}

	@Override
	public void attack() {
		
	};
	
	@Override
	public void defend() {
		
	};
	
	@Override
	public void useMagic() {
		
	};

}
