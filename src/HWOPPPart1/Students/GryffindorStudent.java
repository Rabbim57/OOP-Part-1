package HWOPPPart1.Students;

public class GryffindorStudent extends HogwartsStudents {
    private final int mobility;
    private final int honnor;
    private final int bravery;

    public GryffindorStudent(int magicPower, int transgressionDistance, int mobility, int honnor, int bravery) {
        super(magicPower, transgressionDistance);
        this.mobility = mobility;
        this.honnor = honnor;
        this.bravery = bravery;
    }

    public int getMobility() {
        return mobility;
    }

    public int getHonnor() {
        return honnor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    protected int getSpecificAbilitiesSum() {
        return mobility + honnor + bravery;
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
                "mobility=" + mobility +
                ", honnor=" + honnor +
                ", bravery=" + bravery +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare (GryffindorStudent gryffindorStudent){
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = gryffindorStudent.getSpecificAbilitiesSum();

        if (abilitiesSum1 > abilitiesSum2){
            System.out.println("Ученик 1 лучше ученика 2");
        }else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        }else {
            System.out.println("Ученики равны");
        }
    }
}

