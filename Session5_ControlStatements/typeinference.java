public class typeinference {
    public static void main(String[] args) {
        System.out.println("Values of x: ");
        for(var x=2.5; x<100.0;x=x*2)
        System.out.print(x+ " ");
        System.out.println();
        int array[]={1,2,3,4,5,6,7,8};
        System.out.println("Values in nums array: ");
        for(var v: array)
        System.out.print(v+" ");
        System.out.println();
    }
}
