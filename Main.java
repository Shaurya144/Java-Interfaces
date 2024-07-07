// Interfaces are used for security and because
// Java does not support multiple inheritances so Interfaces are a work around
// The attributes in an interface are final, static and public
// The methods in an interface are abstract and public
// Eg.

interface Animal {
    public void AnimalSounds(); // creates structure

    public void PrintName();

    int age = 5; // cannot be edited
}

class Wolf implements Animal {
    public void AnimalSounds() {
        System.out.println("Wolfs say Woof Woof, sometimes - I think");
    }

    public void PrintName() {
        System.out.println("This Wolf is " + age);
    }
}

/**
 * Main
 */
class Main {
    public static void main(String[] args) {
        Wolf Wolf_1 = new Wolf();
        Wolf_1.PrintName();
        Wolf_1.AnimalSounds();
    }
}
