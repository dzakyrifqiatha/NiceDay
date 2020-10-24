import java.util.Scanner;

public class ProblemA {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        for(int i = 0; i < testCase; i++){
            int number = input.nextInt();
            if(number == 8){
                System.out.println("Hooray!!");
            } else if(number < 8){
                int less = 8 - number;
                System.out.println("Less, " + less);
            } else if(number > 8){
                int more = number - 8;
                System.out.println("More, " + more);
            }
        }
    }
}
