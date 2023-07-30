public class overridding {
    // run time polymorphism
    // when Rewriting method in a super and subclass in such a way that method Name
    // and parameters must be same called method overriding
    // We cannot create method overriding with inheritance
    public static void main(String[] args) {
        shape obj = new b();
        obj.draw();// If method is overwritten then it will be called always sub class
    }
}

class shape {
    void draw() {
        System.out.println("Can not say shape type");
    }
}

class b extends shape {
    @Override
    void draw() {// Keep the Surplus method is not overwritten then it will be print the sub
                 // class or parent class output("Cannot say shape type")

        // And if we want to access the super class method as well as same class method
        // then we have to use super keyword...
        System.out.println("Square shape");
        super.draw();// It will print both "can't say safe type" and also "square shape"
    }
}