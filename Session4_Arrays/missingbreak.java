public class missingbreak {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        switch(i)
        {   case 0:
            case 1:
            case 2:
            System.out.println("i is less than 3");
            break;
            case 3:
            case 4:
            System.out.println("i is less than 5");
            break;
            default:
            System.out.println("i is greater than 10");
        }
    }
}
