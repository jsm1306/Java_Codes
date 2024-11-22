public class foreach2 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int x:array) {
            System.out.println("The value is: "+x);
        sum+=x;
        if(x==5) break;
    }
        System.out.println("The sum of first 5 elements in the array is: "+sum);
    }
}
