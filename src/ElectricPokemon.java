public class ElectricPokemon extends Pokemon{
    private int nrOfCharges;
    private String soundOfThunder;

    public ElectricPokemon(String name, int level, int hp, int nrOfCharges, String soundOfThunder) {
        super(name, level, hp);
        this.nrOfCharges = nrOfCharges;
        this.soundOfThunder = soundOfThunder;
    }


    public void thunderPunch(){
        System.out.println(this.getName() + " uses thunder punch");
    }

    public void voltTackle(){
        System.out.println(this.getName() + " uses volt tackle");
    }



    @Override
    public void speaks(String sound) {
        System.out.println(this.getName() + " makes sound " + sound);
    }

    public int getNrOfCharges() {
        return nrOfCharges;
    }

    public void setNrOfCharges(int nrOfCharges) {
        this.nrOfCharges = nrOfCharges;
    }

    public String getSoundOfThunder() {
        return soundOfThunder;
    }

    public void setSoundOfThunder(String soundOfThunder) {
        this.soundOfThunder = soundOfThunder;
    }
}
