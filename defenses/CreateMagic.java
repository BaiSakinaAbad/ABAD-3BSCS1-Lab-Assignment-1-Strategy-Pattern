package defenses;

public class CreateMagic extends Dodge implements DefenseStrategy {
    @Override
    public void defense() {
        System.out.println("I'm defending using magic barrier!");
    }
}
