package HWOPPPart1;

import HWOPPPart1.Students.GryffindorStudent;
import HWOPPPart1.Students.SlytherinStudent;

public class HW {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent(100, 90,
                90, 90, 90);
        GryffindorStudent ron = new GryffindorStudent(70, 80,
                90, 100, 100);
        System.out.println(harry);
        System.out.println(ron);

        harry.compare(ron);
        harry.basicCompare(ron);

        SlytherinStudent drako = new SlytherinStudent(
                50,
                60,
                70,
                80,
                90,
                100,
                80);
        harry.basicCompare(drako);

    }
}
