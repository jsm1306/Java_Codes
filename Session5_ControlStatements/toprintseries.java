public class toprintseries {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=98;i+=2){
            System.out.print(i+"/"+(i+2)+" + ");
            if(i==97){
                System.out.print(i+"/"+(i+2)+" ");
            }
        }
    }
}
