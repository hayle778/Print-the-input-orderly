import java.util.Scanner;

public class Triangle {

    public static void main(String[]args) {

        int num, i, j = 0;
    Scanner input = new Scanner(System.in);
     System.out.print("Enter the number: ");
       num = input.nextInt();
       // nested for loop

        for(i=1; i<= num; i++){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
          System.out.println("");
        }
    }
}
