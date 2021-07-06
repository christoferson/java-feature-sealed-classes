package demo.rpg.gem;

public sealed interface IGem permits Ruby, Emerald, Diamond {
	String color();
}


