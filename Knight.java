public class Knight implements Character{

    private DefenseStrategy defenseStrategy;
    private AttackStrategy attackStrategy;

    public Knight() {
        defenseStrategy = new Shield();// default defense
        attackStrategy = new SwingSword();
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
        this.defenseStrategy = defenseStrategy;
    }
}
