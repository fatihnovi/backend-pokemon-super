public class FirePokemon extends Pokemon{
    private String fireColor;

    private int temperature;

    public FirePokemon(String name, int level, int hp, String fireColor, int temperature) {
        super(name, level, hp);
        this.fireColor = fireColor;
        this.temperature = temperature;
    }

    public void inferno(){
        System.out.println(this.getName() + " uses inferno");
    }

    public void pyroBall(){
        System.out.println(this.getName() + " uses pyro ball");
    }

    @Override
    public void speaks(String sound) {
        System.out.println(this.getName() + " makes sound " + sound);
    }


    public String getFireColor() {
        return fireColor;
    }

    public void setFireColor(String fireColor) {
        this.fireColor = fireColor;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
