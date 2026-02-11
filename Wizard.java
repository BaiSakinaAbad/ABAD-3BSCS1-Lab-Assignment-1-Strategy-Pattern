public class Wizard implements Character{
     private AttackStrategy attackStrategy;
     private DefenseStrategy defenseStrategy;

    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategy = new CreateMagic();
    }
    @Override
    public void doAttack() {
        attackStrategy.attack();
    }

    @Override
    public void doDefense() {
        defenseStrategy.defense();
    }

    @Override
    public void setDefense(DefenseStrategy defenseStrategy) {
       System.out.println("Wizard can only use magic barrier to defend!");
    }
}
