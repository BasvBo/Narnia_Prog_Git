package nl.narniaklotekast;

import java.util.Random;

public class AngryNany {

    private Boolean nannyIsAngry;

    public AngryNany(Boolean nannyIsAngry) {
        this.nannyIsAngry = nannyIsAngry;
    }

    public Boolean getNannyIsAngry() {
        return nannyIsAngry;
    }

    public void gettingCaucht() {

        int gettingCauchtChange = (int) Math.floor((Math.random() * 101) + 0);
    //    int gettingCauchtChange = new Random().nextInt(100);
        System.out.println("kans dat je gepakt word" +" "+ gettingCauchtChange);
        if (gettingCauchtChange == 1) {
            System.out.println("Didden't get caught");
            nannyIsAngry= false;
        } else {
            gotCaughtByNany();
            nannyIsAngry= true;
        }
    }

    public void gotCaughtByNany() {
        try {
            System.out.println("gepakt door nany");
            //Thread.sleep(10);
        } catch (Exception ex) {
            System.out.println("nany gaat fout");
        }
    }
}


