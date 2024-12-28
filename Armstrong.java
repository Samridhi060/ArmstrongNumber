import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        // assinging value of num in temp
        int temp = num;

        // calling function 
        int ans = armstrong(num);

        if (temp == ans) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    static int armstrong(int num) {
        int sum = 0;
        int OriginalNum = num;
        int digit = 0;

        // counting number of digits
        while (OriginalNum != 0) {
            OriginalNum /= 10;
            digit++;
        }
        // formula
        while (num > 0) {
            int n = num % 10;
            sum += (int) Math.pow(n, digit);
            num /= 10;
        }
        return sum;
    }
}
