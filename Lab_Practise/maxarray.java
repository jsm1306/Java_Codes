public class maxarray {
    public static void main(String[] args) {
        int [] array={9,7,3,12,10};
        int max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }System.out.println("The max element in array is: "+max);
    }
}
