package org.howard.edu.lsp.exam.question40;

public class driver {
	public static void main(String[] args) {
        FlyingObject goose = new Goose();
        FlyingObject plane = new Airplane();
        
        Animal tiger = new Tiger();
        Animal goose2; 
        
        System.out.println(goose.fly());
        System.out.println(plane.fly());
        
        System.out.println(tiger.speak());
        System.out.println(tiger.move());
        
        goose2 = (Animal)goose;
        System.out.println(goose2.speak());
        System.out.println(goose2.move());
    }
}
