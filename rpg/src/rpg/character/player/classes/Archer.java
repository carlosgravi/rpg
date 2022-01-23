package rpg.character.player.classes;

import rpg.character.player.Player;
import rpg.items.equipament.weapons.Arc;

public class Archer extends Player {
	
	public Archer() {
		super(EnumClasses.ARCHER);
	}
	
	private Arc arc;
}
