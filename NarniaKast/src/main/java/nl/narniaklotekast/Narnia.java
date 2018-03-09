package nl.narniaklotekast;

public class Narnia {

    private Boolean gotInToNarnia;

    public Narnia(Boolean gotInToNarnia) {
        this.gotInToNarnia = gotInToNarnia;
    }

    public Boolean getGotInToNarnia() {
        return gotInToNarnia;
    }


    public void tryingToGetInToNarnia(int experience) {

        int chanceGetInToNarnia = (int) Math.floor((Math.random() * (101 / experience)) + 0);

        if (chanceGetInToNarnia == 1) {
            System.out.println("jeej in narnia");
            System.out.println(chanceGetInToNarnia);
            gotInToNarnia= true;
        } else {
            gotInToNarnia= false;
            System.out.println("de kans" + " " + chanceGetInToNarnia);

        }
    }
}
