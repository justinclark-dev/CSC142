import java.util.Arrays;

public class PrintArray {

public void printArray(int[] a) {
    
    System.out.print("(");
    if (a.length > 0) {
        System.out.print(a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(","+a[i]);
        }
    }
    System.out.print(")");
}

    public static void main(String[] args) {
        PrintArray app = new PrintArray();
        int[] a = {};
        app.printArray(a);
    }

}