public class abstractclass {
    // A class which Contains the abstract keyword in its declaration is called
    // abstract class
    // We cannot create the object of abstract class Also we can make the reference
    // variables
    // It may or may not contain abstract methods...
    // It can have abstract and non abstract methods...
    // tool use an abstract class you have to inherit it from subclasses...
    // If a class content partial implementation then we should declare a class as
    // abstract...
    // if any class have an abstract method then we have to convert this class to
    // abstract class it is compulsory...
}

abstract class animal {// super class...

}

class dog extends animal {// sub class...

}

class domo {
    public static void main(String[] args) {
        animal obj = new dog();
    }
}