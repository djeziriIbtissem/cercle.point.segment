/**
 * Created by HP on 18/10/2016.
 */
public class cercle {
    private point centre;
    private segment rayon;

    public cercle() {
        this.centre = new point(0, 0);

    }

    public cercle(point centre, segment rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }


    public point getCentre() {
        return centre;
    }

    public segment getRayonayon() {
        return rayon;
    }


    public double perimetre() {
        return (rayon.distance() * 2) * Math.PI;
    }


    public cercle symetrie() {

        return new cercle(centre.symetrie(), rayon.symetrie());

    }

    @Override
    public String toString() {
        return "rayon" + rayon.toString() + ", centre" + centre.toString();

    }
}
