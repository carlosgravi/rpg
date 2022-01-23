package rpg.items.equipament;

import rpg.attributes.equipament.AttributesEquipament;

public abstract class Equipament {
	
	AttributesEquipament attributes;

	public AttributesEquipament getAttributes() {
		return attributes;
	}

	public void setAttributes(AttributesEquipament attributes) {
		this.attributes = attributes;
	}
	
}
