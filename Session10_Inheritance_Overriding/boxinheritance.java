class Boxi {
    double width, height, depth;

    // Boxi(Boxi ob){
    //     width=ob.width;
    //     height=ob.height;
    //     depth=ob.depth;
    // }
    Boxi(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Boxi() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Boxi(double len) {
        width = depth = height = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class Boxweight extends Boxi {
    double weight;


    Boxweight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class boxinheritance {
    public static void main(String[] args) {
        Boxweight mybox1 = new Boxweight(10, 20, 15, 34.3);
        Boxweight mybox2 = new Boxweight(2, 5, 7, 0.07);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is:" + vol);
        System.out.println("Weight of mybox1 is:" + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is:" + vol);
        System.out.println("Weight of mybox2 is:" + mybox2.weight);
        System.out.println();
    }
}
