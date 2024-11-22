class test{
    int a;
    public int b;
    private int c;
    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }
}
public class accesstest {
    public static void main(String[] args) {
        test obj = new test();
        obj.a=10;
        obj.b=20;
        //obj.c=30;Error
        obj.setc(30);
        System.out.println("a, b and c are: "+obj.a+" "+obj.b+" "+obj.getc());
    }
}
