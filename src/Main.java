public class Main {

    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 1,333, "yellow", 600);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 1, 335, 100, true);
        GrassPokemon chikorita = new GrassPokemon("Chikorita", 1, 334, 100, true);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu",1, 350, 22, " big thunder sound ");

        charmander.speaks("char char");
        squirtle.speaks("gurgle gurgle");
        chikorita.speaks("chiko chiko");
        pikachu.speaks("pika pika");

        charmander.levelUp();
        squirtle.levelUp();
        chikorita.levelUp();
        pikachu.levelUp();

        charmander.inferno();
        charmander.pyroBall();

        squirtle.rainDance();
        squirtle.hydroCanon();

        chikorita.leafStorm();
        chikorita.leaveBlade();

        pikachu.thunderPunch();
        pikachu.voltTackle();
    }
}

//        De applicatie moet voldoen aan het volgende:
//
//- Een Super klasse waarvan minimaal 2 `private` variabelen, 1 constructor, 2 methodes, 2 getters en 2 setters;
//- 4 subklassen die, naast alles dat ze erven, zelf ook minimaal 2`private` variabelen, 1 constructor, 2 methodes, 1 `override` methode, 2 getters en 2
//  setters bevatten. _Tip_: wil je wat inspiratie bij het bedenken van variabelen en methodes op het gebied van Pokèmon? Bekijk de
//  inspiratie-sectie hieronder eens.
//- Een `main`-klasse met een `main`-methode;
//- In de `main`-methode worden vier verschillende Pokèmon-objecten van verschillende klassen geïnstantieerd- en gedeclareerd. Met behulp van deze objectnamen kunnen de methodes van de verschillende klassen worden uitgevoerd;
//
//Deze methodes mogen `void` teruggeven en een `system.out.println` uitvoeren.
//
//