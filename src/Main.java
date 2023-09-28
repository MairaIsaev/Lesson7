public class Main {
    public static void main(String[] args) {

        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero [] heroes = {magic,medic,warrior};

        String [] s = {"speed","treat","cretical domage"};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].superAbility(s[i]);

        }
    }
}