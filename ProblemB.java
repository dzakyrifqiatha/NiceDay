// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        boolean[] value = {false, false, false, false, false, false, false, false, false, false};
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] numbers = input.split(" ");
        String output = "";
        for (int i = 0; i < numbers.length; i++) {
            value[Integer.parseInt(numbers[i])] = true;
            //System.out.print(numbers[i]);
        }
        for (int j = 1; j < value.length; j++){
            if (value[j] == true) {
                output = output + " " + j;
                //System.out.print(j);
            }
        }
        if (output.length() > 0) {
            String output2 = output.substring(1);
            System.out.print(output2);
        }

    }
}
    

