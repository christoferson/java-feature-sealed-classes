package demo;

import demo.model.Button;
import demo.model.Image;
import demo.model.Widget;
import demo.model.label.ColoredLabel;
import demo.rpg.Adventurer;
import demo.rpg.Dragon;
import demo.rpg.IFlyingMount;
import demo.rpg.IFlyingMount.Gryphon;
import demo.rpg.IMount;
import demo.rpg.Item;
import demo.rpg.Item.Dagger;
import demo.rpg.Medal;
import demo.rpg.gem.GemFactory;
import demo.rpg.gem.IGem;

public class TryFeatureSealedClass {

	public static void main(String[] args) {
		
		tryBasicDeclaration();
		
		tryShortDeclaration();
		
		tryShortDeclarationStatic();
		
		tryShortDeclarationAuxilliary();
		
		tryNonSealed();
		
		trySealedInterface();
		
		trySealedInterface2();
		
		trySealedSubType();
		
		tryReducedSubTypeVisibility();
		
// record
	}
	
	private static void tryBasicDeclaration() {
		Widget widget = new Button();
		System.out.println(widget);
		widget.getClass().isSealed();
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
	
	private static void tryNonSealed() {
		Widget widget = new ColoredLabel();
		System.out.println(widget);
	}
	
	private static void trySealedInterface() {
		IMount mount = new Gryphon();
		System.out.println(mount);
		((IFlyingMount) mount).flutter();
	}
	
	private static void trySealedInterface2() {
		IMount mount = new Dragon();
		System.out.println(mount);
		((IFlyingMount) mount).flutter();
		IFlyingMount fmount = new Gryphon();
		fmount.flutter();
	}
	// 
	
	private static void trySealedSubType() {
		Widget widget = new Image.LineBorderedImage();
		System.out.println(widget);
	}
	
	private static void tryReducedSubTypeVisibility() {
		IGem gem = GemFactory.create("ruby");
		System.out.println(gem.color());
		gem = GemFactory.create("black-diamond");
		System.out.println(gem.color());
	}
	
}
