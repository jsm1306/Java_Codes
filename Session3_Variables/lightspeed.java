public class lightspeed {
    public static void main(String[] args) {
        int lightspeed; 
        long days,seconds,distance;
        lightspeed=186000;
        days=1000;
        seconds=days*24*3600;
        distance=lightspeed*seconds;
        System.out.println("In "+days+" days light will travel about "+distance+" miles.");
    }
}
