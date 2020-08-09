public class EchoArgs {
    
    EchoArgs() {

    }

    public static void main(String[] args) {

        System.out.print("There are " + args.length);
        System.out.println(" command-line arguments.");

        for (int i = 0; i < args.length; i++) {
            System.out.print("  args[" + i + "] is ");
            System.out.println(args[i] + ".");
        }
    }
}
