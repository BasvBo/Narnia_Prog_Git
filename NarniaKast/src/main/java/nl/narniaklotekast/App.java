package nl.narniaklotekast;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        int experience = 1;
        int timesTryd =0;

        AngryNany nany = new AngryNany(true);
        Witch whiteWitch = new Witch(false);
        Narnia worldOfNarnia = new Narnia(false);
        Lion asland = new Lion("Asland");

        System.out.println("Build Kast");
        // crieer kast
        Kast mijnKast = buildkast();

        System.out.println(mijnKast.getMaterial());

        while (true) {

            timesTryd ++;

            System.out.println("Kick Kast");
            // force kick
            mijnKast.kickKast(mijnKast);
            if (mijnKast.getKastIsStuk()) {
                mijnKast = buildkast();
                continue;
            }

            System.out.println("trying not to get caught");
            //test if you have been caught
            nany.gettingCaucht();
            if (nany.getNannyIsAngry() == true) {
                continue;
            }

            System.out.println("trying to get in to Narnia");
            //Try to get in to narnia
            worldOfNarnia.tryingToGetInToNarnia(experience);
            if (worldOfNarnia.getGotInToNarnia() == false) {
                mijnKast = buildkast();
                continue;
            }

            System.out.println("Fighting the Witch");
            //Fight with Witche
            whiteWitch.fightWitch(experience);
            if (whiteWitch.getWitchIsDefated() == false) {
                mijnKast = buildkast();
                experience = ++experience;
                System.out.println("Experience" + " " + experience);
                continue;
            }

            System.out.println("Talking Talking Talking Talking");
            System.out.println("Times Tried = " + timesTryd);
            asland.prntLion();
            break;
        }


    }


    public static Kast buildkast() {
        int materialNumber = (int) Math.floor((Math.random() * 5) + 0);
        switch (materialNumber) {
            case 0:
                return new Kast(Material.WOOD);
            case 1:
                return new Kast(Material.STONE);
            case 2:
                return new Kast(Material.GLASS);
            case 3:
                return new Kast(Material.METAL);
            case 4:
                return new Kast(Material.CARBON);
            default:
                return new Kast(Material.PLASTIC);


        }


    }





}
