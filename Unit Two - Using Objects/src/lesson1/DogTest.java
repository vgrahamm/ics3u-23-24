package lesson1;

import lesson2.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog("Coco", 7, "Poodle");
        d1.bark();
        d1.feed();
        d1.feed();

        boolean cocoIsPuppy = d1.isPuppy();
        System.out.println(cocoIsPuppy);

        System.out.println("Coco is " + d1.getAge() + " years old");

    }
    
}
