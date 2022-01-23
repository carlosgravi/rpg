package rpg.items.equipament.armor;

import rpg.items.equipament.Equipament;

public abstract class Armor extends Equipament {
	
	private EnumArmor typeArmor;
	
	public Armor(EnumArmor typeArmor) {
		this.typeArmor = typeArmor;
	}

	public EnumArmor getTypeArmor() {
		return typeArmor;
	}

	public void setTypeArmor(EnumArmor typeArmor) {
		this.typeArmor = typeArmor;
	}
	
}
