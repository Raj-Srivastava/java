import  java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,sum = 0;
        System.out.print("Ente Total number you want to add:");
        n=input.nextInt();
        for(int i=1; i<=n; i++)
        {   
            System.out.print("Input the "+i+" number: ");
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("The sum of the given number is " + sum);

    }
}
