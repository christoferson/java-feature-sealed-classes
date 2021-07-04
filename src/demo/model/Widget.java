package demo.model;

import demo.others.Spinner;

//public abstract sealed class Widget permits Button, Label {

// Permitted type Spinner in an unnamed module should be declared in the same package demo.model of declaring type Widget
//public sealed class Widget permits Button, Label, Spinner {
public sealed class Widget permits Button, Label {
	
}
