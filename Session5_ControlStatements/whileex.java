public class whileex {
    public static void main(String[] args) {
        int n;
        n=10;
        while(n>0)
        {
            System.out.println("n is: "+n);
            n--;
        }
        int a=10,b=20;
        while(a>b) System.out.println("This is not executed");
        System.out.println("No Body Example:");
        int i=100,j=200;
        while(++i<--j); System.out.println("The midpoint is: "+i);
    }
}
