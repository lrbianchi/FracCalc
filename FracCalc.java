package fracCalc;
import java.util.Scanner;


public class FracCalc {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        while(true) {
            System.out.println("Enter Equation");
            input = scanner.nextLine();
            if(input.equals("quit")) {
                break;
            }
            System.out.println(produceAnswer(input));
        }

        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        String[] words = input.split(" ");
           /*  for(String s: words) {
                System.out.println(s);
            }*/
            Number left = new Number();
            left.parse(words[0]);
          //   left.print();
            Number right = new Number();
            right.parse(words[2]);
           // right.print();
        String operator = words[1];
        if(operator.equals("+")) {
            return Double.toString (left.value() + right.value());
        }
        else if(operator.equals("-")) {
            return Double.toString(left.value() - right.value());
        }
        else if(operator.equals("*")) {
            return Double.toString(left.value() * right.value());
        }
        else {
            return Double.toString(left.value() / right.value());
        }
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
