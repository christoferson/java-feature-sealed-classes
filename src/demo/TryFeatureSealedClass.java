package demo;

import demo.model.Button;
import demo.model.Widget;
import demo.rpg.Adventurer;

public class TryFeatureSealedClass {

	public static void main(String[] args) {
		
		tryBasicDeclaration();
		
		tryShortDeclaration();

	}
	
	private static void tryBasicDeclaration() {
		Widget widget = new Button();
		System.out.println(widget);
	}
	
	private static void tryShortDeclaration() {
		Adventurer adventurer = new Adventurer().new Warrior();
		System.out.println(adventurer);
	}

}
