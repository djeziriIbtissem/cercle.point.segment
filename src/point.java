/**
 * Created by HP on 18/10/2016.
 */
public class point {
    private int abscisse;
    private int ordonnee;

    public point() {
        this.abscisse = 0;
        this.ordonnee = 0;
    }


    public point(int x) {
        this.abscisse = x;
        this.ordonnee = x;
    }


    public point(int x, int y) {
        this.abscisse = x;
        this.ordonnee = y;
    }


    public int getAbscisse() {
        return abscisse;
    }


    public int getOrdonnee() {
        return ordonnee;
    }

    public point symetrie() {

        return new point(-abscisse, ordonnee);
    }

    @Override
    public String toString() {
        return "(" + getAbscisse() + ";" + getOrdonnee() + ")";
    }
}





