
// Define the interface
interface Animal {
    void sound(); // Abstract method

    void eat(); // Abstract method
}

// Implement the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Implement the interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }

}

    // Main class
    class interface{

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks
        dog.eat(); // Output: Dog eats bones

        Animal cat = new Cat();
        cat.sound(); // Output: Cat meows
        cat.eat(); // Output: Cat eats fish
    }
}
