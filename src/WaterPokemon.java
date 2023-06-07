public class WaterPokemon extends Pokemon{
    private int liters;

    private boolean isAmphibious;

    public WaterPokemon(String name, int level, int hp, int liters, boolean isAmphibious) {
        super(name, level, hp);
        this.liters = liters;
        this.isAmphibious = isAmphibious;
    }

    public void rainDance(){
        System.out.println(this.getName() + " uses rain dance");
    }

    public void hydroCanon(){
        System.out.println(this.getName() + " uses hydro canon");
    }

    @Override
    public void speaks(String sound) {
        System.out.println(this.getName() + " makes sound " + sound);
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public boolean isAmphibious() {
        return isAmphibious;
    }

    public void setAmphibious(boolean amphibious) {
        isAmphibious = amphibious;
    }
}
