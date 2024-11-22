public class findprime {
    public static void main(String[] args) {
        int num=2;
        boolean isprime;
        if (num<2) isprime=false;
        else isprime=true;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime) System.out.println(num +" is a prime number");
        else System.out.println(num+" is not a prime");
    }
}
