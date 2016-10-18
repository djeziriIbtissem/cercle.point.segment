/**
 * Created by HP on 18/10/2016.
 */
public class main {

    public static void main(String[] args) {

        point A = new point();
        point B = new point(5, 5);
        point C = new point(3, 8);

        segment AB = new segment(A, B);
        segment BC = new segment(B, C);

        cercle cerclec1 = new cercle(A, AB);
        cercle cerclec2 = new cercle(B, BC);


        System.out.println("A" + A.toString() + "\n B" + B.toString() + "\n C" + C.toString());
        System.out.println("\n image de A" + A.symetrie().toString() + "\n image de B" + B.symetrie().toString() + "\n image de C" + C.symetrie().toString());

        System.out.println("\n Segment AB" + AB.toString() + "\n Segment BC" + BC.toString());
        System.out.println("\n image de AB " + AB.symetrie().toString() + "\n image de BC " + BC.symetrie().toString());

        System.out.println("\n cerclec1  " + cerclec1.toString() + "\n cerclec2  " + cerclec2.toString());
        System.out.println("\n image de c1  " + cerclec1.symetrie().toString() + "\n image de c2  " + cerclec2.symetrie().toString());

    }
}