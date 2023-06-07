public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String type;

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }
    public void levelUp() {
        this.level++;
        System.out.println("Pokemon " + name + " is at level " + level );
    }
    public void eats() {
        System.out.println("Pokemon " + name + " eats.");
    }

    public void speaks(String sound){
        System.out.println("Geluid " + sound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
