import java.util.Scanner;
import java.util.Random;
public class CHP8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Your Choice: ");        
        System.out.println("\n 0---->ROCK \n 1---->Paper \n 2---->Scissors");

        int userinput = scanner.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if(userinput == computerInput){
            System.out.println("DRAW");
            
        }else if(userinput == 0 && computerInput == 2 || userinput == 1 && computerInput == 0 || userinput == 2 && computerInput == 1){
            System.out.println("YOU,WIN!!!");
        }else{
            System.out.println("Computer Win!!!");
        }

    }
}
