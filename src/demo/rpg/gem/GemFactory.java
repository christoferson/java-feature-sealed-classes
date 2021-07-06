package demo.rpg.gem;

public class GemFactory {
	public static IGem create(String type) {
		return switch(type) {
			case "ruby" -> new Ruby();
			case "emerald" -> new Emerald();
			case "red-diamond" -> Diamond.RedDiamond;
			case "black-diamond" -> Diamond.BlackDiamond;
			default -> throw new IllegalArgumentException();
		};
	}
}
