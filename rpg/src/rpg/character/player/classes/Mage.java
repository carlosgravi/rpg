package rpg.character.player.classes;

import rpg.character.player.Player;
import rpg.items.equipament.weapons.MagicBook;
import rpg.items.equipament.weapons.Staff;

public class Mage extends Player {
	
	int pointMagic;
	
	public Mage() {
		super(EnumClasses.MAGE);
	}
	
	private Staff staff;
	private MagicBook magicbook;
}
