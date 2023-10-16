package HWOPPPart1.Students;

public abstract class HogwartsStudents {
    protected final int magicPower;
    protected final int transgressionDistance;

    public HogwartsStudents(int magicPower, int transgressionDistance) {
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    protected abstract int getSpecificAbilitiesSum();
    private int getBasicAbilitiesSum(){
        return magicPower + transgressionDistance;
    }

    public void basicCompare(HogwartsStudents hogwartsStudents) {
        int basicabilitiesSum1 = getSpecificAbilitiesSum();
        int basicabilitiesSum2 = hogwartsStudents.getBasicAbilitiesSum();

        if (basicabilitiesSum1 > basicabilitiesSum2){
            System.out.println("Ученик 1 лучше ученика 2 по базовым свойствам");
        }else if (basicabilitiesSum1 < basicabilitiesSum2) {
            System.out.println("Ученик 2 лучше ученика 1 по базовым свойствам");
        }else {
            System.out.println("Ученики равны по базовым свойсвтам");
        }
    }


    @Override
    public String toString() {
        return "HogwartsStudents{" +
                "magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
