public class Magic extends Hero{
    @Override
    int health() {
        return 0;
    }

    @Override
    int damage() {
        return 0;
    }

    @Override
    String superpower() {
        return null;
    }

    @Override
    public void superAbility(String superAbilityType) {
        System.out.println("Magic changed " + superAbilityType);
    }
}
