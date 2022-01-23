package rpg.items.equipament.weapons;

import rpg.items.equipament.Equipament;

public abstract class Weapon extends Equipament {
	
	private EnumWeapons typeWeapon;
	
	public Weapon(EnumWeapons typeWeapon) {
		this.typeWeapon = typeWeapon;
	}

	public EnumWeapons getTypeWeapon() {
		return typeWeapon;
	}

	public void setTypeWeapon(EnumWeapons typeWeapon) {
		this.typeWeapon = typeWeapon;
	}
	
}
