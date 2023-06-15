public class GrassPokemon extends Pokemon{
    private int nrOfLeaves;
    private boolean hasSeed;

    public GrassPokemon(String name, int level, int hp, int nrOfLeaves, boolean hasSeed) {
        super(name, level, hp);
        this.nrOfLeaves = nrOfLeaves;
        this.hasSeed = hasSeed;
    }

    public void leafStorm(){
        System.out.println(this.getName() + " uses leaf storm");
    }

    public void leaveBlade(){
        System.out.println(this.getName() + " uses leave blade");
    }

    @Override
    public void speaks(String sound) {
        System.out.println(this.getName() + " makes sound " + sound);
    }

    public int getNrOfLeaves() {
        return nrOfLeaves;
    }

    public void setNrOfLeaves(int nrOfLeaves) {
        this.nrOfLeaves = nrOfLeaves;
    }

    public boolean isHasSeed() {
        return hasSeed;
    }

    public void setHasSeed(boolean hasSeed) {
        this.hasSeed = hasSeed;
    }
}
