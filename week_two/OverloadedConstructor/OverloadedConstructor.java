public class OverloadedConstructor {
    
    OverloadedConstructor() {
        System.out.println("This is the explicit zero-parameter constructor.");
    }

    OverloadedConstructor(String[] args) {
        System.out.println("Overloaded constructor with '" + args[0] + "' passed in.");
    }

    public static void main(String[] args) {

        OverloadedConstructor oc;
        if (args.length == 0) {
            oc = new OverloadedConstructor();
        } else {
            oc = new OverloadedConstructor(args);
        }
    }
}
