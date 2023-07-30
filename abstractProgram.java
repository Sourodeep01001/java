public class abstractProgram {
    public static void main(String[] args) {
        Dog objD = new Dog();
        Lion objL = new Lion();
        objD.sound();
        objL.sound();
    }
}

abstract class animal {
    animal() {// Abstract class(non abstract methods)
        System.out.println("All animals...");
    }

    public abstract void sound();
}

class Dog extends animal {
    Dog() {
        super();
    }

    public void sound() {
        System.out.println("Dog is barking...");
    }
}

class Lion extends animal {
    Lion() {
        super();
    }

    public void sound() {
        System.out.println("Lion is roar...");
    }
}