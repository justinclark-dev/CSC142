public class HouseCat extends Cat implements Petable {
    
    public HouseCat(String name) {
        super(name);
    }

    public void petMe() {
        System.out.println("Purr");
    }
    public static void main(String[] args) {

        HouseCat pet = new HouseCat("Fifi");

        String name = pet.getName();

        System.out.print("The cat " + name + " says: ");
        pet.speak();

        System.out.print("And if you pet him, he will: ");
        pet.petMe();

    }
}