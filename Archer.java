public class Archer implements Character{
   private DefenseStrategy defenseStrategy;
   private AttackStrategy attackStrategy;

   public Archer(){
       attackStrategy = new ShootArrow();
       defenseStrategy = new Dodge();
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
       System.out.println("Archer can only use dodge to defend!");
    }
}
