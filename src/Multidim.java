import java.util.*;
public class Multidim {
    public static void main(String[] args) {
        int twodim [][]=new int[2][2];
        int i=0,j=0;
        var avg=10.0f;
int a=2, b=4;
System.out.println((a<<b));
        System.out.println((a>>b));

        Scanner sc = new Scanner(System.in);
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                twodim[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(twodim[i][j]+" ");
            }System.out.println();
        }
    }
}
