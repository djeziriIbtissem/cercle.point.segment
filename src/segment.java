/**
 * Created by HP on 18/10/2016.
 */
public class segment {
    private point A = new point();
    private point B = new point();

// constructeur d'un segment OM

    public segment(point a) {
        this.A = a;
    }


    public segment(point a, point b) {
        this.A = a;
        this.B = b;

    }
/*
Exemple de constructeurs de segments 

 public Segment(double bx, double by) {
        this.a = new Point();
        this.b = new Point(bx, by);
    }

    public Segment(double ax, double ay, double bx, double by) {
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
    }




*/
    public point getA() {
        return A;
    }


    public point getB() {
        return B;
    }


    public double distance() {
        return Math.sqrt(((B.getAbscisse()-A.getAbscisse())*(B.getAbscisse()-B.getAbscisse()))+((B.getOrdonnee()-A.getOrdonnee())*(B.getOrdonnee()-A.getOrdonnee())));
    }

    @Override
    public String toString() {
        return "[" + A + B + "]";//sans expliciter toString()
    }

    public segment symetrie() {

        return new segment(A.symetrie(), B.symetrie());


    }



}
