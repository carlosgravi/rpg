package rpg.character.player.classes;

import rpg.character.player.Player;
import rpg.items.equipament.weapons.Weapon;

public class Warrior extends Player {
	
	public Warrior() {
		super(EnumClasses.WARRIOR);
	}
	
	private Weapon sword;
	private Weapon shield;
}
