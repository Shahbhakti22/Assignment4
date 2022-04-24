import java.util.Scanner;

public class ifelse {

    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num,res;
        num=sc.nextInt();
        if (num % 7 == 0)
        {
            System.out.println("The number is divisible by 7");
            res=num*num*num;
            System.out.println("the cube is: " + res);

        }
        else
        {
            System.out.println("the no is not divisible by 7");
        }

    }


}

