package rpg.attributes.character;

import rpg.attributes.AttributesGeneral;

public abstract class AttributesCharacter extends AttributesGeneral {
	
	private int pointLife;

	public int getPointLife() {
		return pointLife;
	}

	public void setPointLife(int pointLife) {
		this.pointLife = pointLife;
	}
	
}
