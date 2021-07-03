package demo;

import demo.model.Button;
import demo.model.Widget;

public class TryFeatureSealedClass {

	public static void main(String[] args) {
		
		tryBasicDeclaration();

	}
	
	private static void tryBasicDeclaration() {
		Widget widget = new Button();
		System.out.println(widget);
	}

}
