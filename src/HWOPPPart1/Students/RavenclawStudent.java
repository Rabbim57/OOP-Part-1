package HWOPPPart1.Students;

public class RavenclawStudent extends HogwartsStudents{
    private final int smart;
    private final int wise;

    private final int witty;
    private final int fullOfCreativity;

    public RavenclawStudent(int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    protected int getSpecificAbilitiesSum() {
        return smart + wise + witty + fullOfCreativity;
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public void compare (RavenclawStudent ravenclawStudent){
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = ravenclawStudent.getSpecificAbilitiesSum();

        if (abilitiesSum1 > abilitiesSum2){
            System.out.println("Ученик 1 лучше ученика 2");
        }else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1");
        }else {
            System.out.println("Ученики равны");
        }
    }
}
