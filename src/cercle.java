/**
 * Created by HP on 18/10/2016.
 */
public class cercle {
    private point centre;
    private segment rayon;

    
    }//le constructeur par defaut n'a aucun sens ici vu qu'un cercle a besoin d'un rayon dans ce cas le r=0

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
