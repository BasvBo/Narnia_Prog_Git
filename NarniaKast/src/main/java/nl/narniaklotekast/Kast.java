package nl.narniaklotekast;

public class Kast {


    private Material material;

    private boolean kastIsStuk;

    public Kast(Boolean kastIsStuk) {
        this.kastIsStuk = kastIsStuk;
    }

    public Boolean getKastIsStuk() {
        return kastIsStuk;
    }

    public Kast(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }


    public void kickKast( Kast kast) {

        int force = (int) Math.floor((Math.random() * 101) + 0);
        System.out.println(force);

        switch (kast.getMaterial()) {
            case WOOD:
                if (force < 25) {
                    System.out.println("Kast is heel");
                    this.kastIsStuk = false;
                } else {
                    System.out.println("kast is stuk");
                    this.kastIsStuk = true;
                }
                break;
            case STONE:
                if (force < 50) {
                    System.out.println("Kast is heel");
                    this.kastIsStuk = false;
                } else {
                    System.out.println("kast is stuk");
                    this.kastIsStuk = true;
                }
                break;
            case GLASS:
                if (force < 10) {
                    System.out.println("Kast is heel");
                    this.kastIsStuk = false;
                } else {
                    System.out.println("kast is stuk");
                    this.kastIsStuk = true;
                }
                break;
            case METAL:
                if (force < 75) {
                    System.out.println("Kast is heel");
                    this.kastIsStuk = false;
                } else {
                    System.out.println("kast is stuk");
                    this.kastIsStuk = true;
                }
                break;
            case CARBON:
                if (force < 100) {
                    System.out.println("Kast is heel");
                    this.kastIsStuk = false;
                } else {
                    System.out.println("kast is stuk");
                }
                break;
            default:
                if (force < 45) {
                    System.out.println("Kast is heel");
                    this.kastIsStuk = false;
                } else {
                    System.out.println("kast is stuk");
                    this.kastIsStuk = true;
                }
                break;
        }


    }
}