public class average {
    public static void main(String[] args) {
        double hello[]={10.1,11.2,12.3,13.4,14.3,15.4};
        double result=0;
        int i;
        for(i=0;i<5;i++)
        {
            result+=hello[i];
        }System.out.println("The Result is: "+result);

        System.out.println("The Average is: "+result/5);
    }   
}
