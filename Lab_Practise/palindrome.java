import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int i, rev=0,r;
        for( i=n;i>0;i/=10){
             r=i%10;
             rev= (rev*10)+r;
        }
        if(rev==n){
            System.out.println("The given number "+n+" is a palindrome");
        }
        else{
            System.out.println("The given number "+n+" is not a palindrome");
        }
    }
}
