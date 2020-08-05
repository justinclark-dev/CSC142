import java.io.File;
import java.util.Scanner;

public class Test {
    
    private Scanner scan;

    public Test(String text) {
        scan = new Scanner(text);
    }

    public void go() {

        // scan.useDelimiter("\n");
        // while (scan.hasNext()) {
        //     System.out.println(scan.next());
        // }


        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n"); // this scans for lines
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(input); // take a look for yourself
        }


    }
    
    public static void main(String[] args) {
        Test test = new Test("Hello World, how are you?");
        test.go();
    }

}