import java.math.BigDecimal;

public class RoundOffError {

    public static void main(String[] args) {

        double number = 3.0;
        
        for (int i = 1; i < 200; i++) {
            number *= 10.0;
            System.out.println(i + ".    " + number);
            System.out.println(i + ".    " + new BigDecimal(number));
            System.out.println("------------------------------------------------------------");
        }

        System.out.println("0.1f == 0.1 is " + (0.1f == 0.1));
        System.out.println("0.1f is actually " + new BigDecimal(3.1f));
        System.out.println("0.1 is actually " + new BigDecimal(3.1));
//precision 7 digits

//precision 16 digtis

    }

}

/*
1.  What is the value where the round-off error is first apparent?
    3.0000001E10 (in the 7th digit after the decimal)

2.  Which iteration is the round-off error first apparent?
    The 10th iteration.

3.  What is the significance of the letter 'f' in the assignment of the initial value of the variable number?
    It explicitly forces the compiler to make the number a single-precision floating point number.

4.  What happens if the 'f' is omitted in the initial value?
    The compiler throws an error: "incompatible types: possible lossy conversion from double to float"


5.  What is the value where the round-off error is first apparent?
    2.9999999999999997E28

6.  Which iteration is the round-off error first apparent?
    The 28th iteration.

7.  Does this behavior change if the initial value is specified as 3.0f or 3.0?
    No, this behavior does not change.

8.  Does this behavior change if the initial value is specified as 3 (int)?
    No, again this behavior does not change.

9.  Briefly the reason for the answers to questions 7 and 8.
    Because we declared the type double, the float (3.0f), and the 3 (int) are both automatically widened or converted to a double.

10. Something "odd" happens in the printed values for iterations 30-33, inclusive. What is it? Try to explain the phenomenon.
    The rounded number is again being rounded (approximated).
 */