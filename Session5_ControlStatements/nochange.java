public class nochange {
        public static void main(String[] args) {
            int array[]={1,2,3,4,5,6,7};
            for(int x:array) {
            System.out.println("The value is: "+x);
            x=x*10;
        }
            System.out.println();
            for(int x:array)
            System.out.print(x+" ");
            System.out.println();
        }
    }
