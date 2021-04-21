package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements FlyingObject {
	public String speak() {
		return "This Goose speaks";
	}
	
	public String move() {
		return "This Goose moves forward";
	}
	
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "This Goose is flying by flapping its wings.";
	}
}
