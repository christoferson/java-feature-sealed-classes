package demo;

import demo.model.Button;
import demo.model.Widget;
import demo.rpg.Adventurer;
import demo.rpg.Item;
import demo.rpg.Item.Dagger;
import demo.rpg.Medal;

public class TryFeatureSealedClass {

	public static void main(String[] args) {
		
		tryBasicDeclaration();
		
		tryShortDeclaration();
		
		tryShortDeclarationStatic();
		
		tryShortDeclarationAuxilliary();

	}
	
	private static void tryBasicDeclaration() {
		Widget widget = new Button();
		System.out.println(widget);
	}
	
	private static void tryShortDeclaration() {
		Adventurer adventurer = new Adventurer().new Warrior();
		System.out.println(adventurer);
	}

	private static void tryShortDeclarationStatic() {
		Item item = new Dagger();
		System.out.println(item);
	}
	
	private static void tryShortDeclarationAuxilliary() {
		Medal medal = Medal.instance("arena");
		System.out.println(medal);
	}
	
}
