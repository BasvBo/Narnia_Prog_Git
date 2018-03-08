package nl.narniaklotekast;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        int experience = 1;

        AngryNany nany = new AngryNany(true);
        Witch whiteWitch = new Witch(false);

        System.out.println("Build Kast");
        // crieer kast
        Kast mijnKast = buildkast();

        System.out.println(mijnKast.getMaterial());

        while (true) {

            System.out.println("Kick Kast");
            // force kick
            mijnKast.kickKast(mijnKast);
            if (mijnKast.getKastIsStuk()) {
                mijnKast = buildkast();
                continue;
            }

            System.out.println("try not to get caught");
            //test if you have been caught
            nany.gettingCaucht();
            if (nany.getNannyIsAngry() == true) {
                continue;
            }

            int chanceGetInToNarnia = (int) Math.floor((Math.random() * (100 / experience)) + 0);

            if (chanceGetInToNarnia == 1) {
                System.out.println("jeej in narnia");
                System.out.println(chanceGetInToNarnia);
            } else {
                mijnKast = buildkast();
                System.out.println("de kans" + chanceGetInToNarnia);
                continue;
            }

            System.out.println("Fight the Witch");
            //Fight with Witche
            whiteWitch.fightWitch(experience);
            if (whiteWitch.getWitchIsDefated() == false) {
                mijnKast = buildkast();
                experience = ++experience;
                System.out.println("Experience" + experience);
                continue;
            }

            System.out.println("Talking Talking Talking Talking");
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
