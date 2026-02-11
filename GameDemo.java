public class GameDemo {
    public static void main(String[] args) {
        Character knight = new Knight();
        Character archer = new Archer();
        Character wizard = new Wizard();

        //  Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
        System.out.println("KNIGHT");
        knight.doAttack();
        knight.doDefense();
        knight.setDefense(new Dodge());
        knight.doDefense();
        knight.setDefense(new CreateMagic());
        knight.doDefense();

        //Wizard: Casts spells; uses magic barrier to defend
        System.out.println("\nWIZARD");
        wizard.doDefense();
        wizard.doAttack();
        wizard.setDefense(new Dodge());
        wizard.doDefense();

        //. Archer: Shoots arrows; uses dodge to to defend
        System.out.println("\nARCHER");
        archer.doAttack();
        archer.doDefense();
        archer.setDefense(new CreateMagic());
        archer.doDefense();
    }
}
