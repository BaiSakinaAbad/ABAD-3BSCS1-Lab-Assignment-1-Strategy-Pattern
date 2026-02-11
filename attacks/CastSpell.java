package attacks;

public class CastSpell implements AttackStrategy {
    @Override
    public void attack(){
        System.out.println("I'm attacking by casting a spell!");
    }
}
