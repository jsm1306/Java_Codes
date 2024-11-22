public class firstex {
    public static void main(String args[])
    {
        int x=10,y=20;
        
        if (x<y)
        System.out.println("x is less than y");
        x=x*2;
        if(x==y) System.out.println("x now equal to y");
        x=x*2;
        if(x>y) System.out.println("x now greater than y");
        if(x==y) System.out.println("This statement is not printed");
        
    }
}
