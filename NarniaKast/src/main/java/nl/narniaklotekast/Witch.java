package nl.narniaklotekast;

public class Witch {

    private Boolean witchIsDefated;

    public Witch(Boolean witchIsDefated) {

        this.witchIsDefated = witchIsDefated;
    }

    public Boolean getWitchIsDefated() {
        return witchIsDefated;
    }

    public void fightWitch(int experience) {

        int fightWitch = (int) Math.floor((Math.random() * (101 / experience)) + 0);

        if (fightWitch == 1) {
            System.out.println("defeat Witch");
            witchIsDefated = true;
        } else {
            System.out.println("de kans of defeat" +" "+ fightWitch);
            witchIsDefated= false;
        }
    }
}
