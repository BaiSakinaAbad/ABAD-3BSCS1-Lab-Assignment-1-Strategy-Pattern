package defenses;

public class Shield extends Dodge implements DefenseStrategy {

    @Override
    public void defense() {
        System.out.println("I'm defending by using a shield!");
    }
}
