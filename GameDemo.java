import character_types.*;
import attacks.*;
import character_types.Character;
import defenses.*;


public class GameDemo {
    public static void main(String[] args) {
        character_types.Character knight = new Knight();
        character_types.Character archer = new Archer();
        Character wizard = new Wizard();

        //  character_types.Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
        System.out.println("KNIGHT");
        knight.doAttack();
        knight.doDefense();
        knight.setDefense(new Dodge());
        knight.doDefense();
        knight.setDefense(new CreateMagic());
        knight.doDefense();

        //character_types.Wizard: Casts spells; uses magic barrier to defend
        System.out.println("\nWIZARD");
        wizard.doDefense();
        wizard.doAttack();
        wizard.setDefense(new Dodge());
        wizard.doDefense();

        //. character_types.Archer: Shoots arrows; uses dodge to defend
        System.out.println("\nARCHER");
        archer.doAttack();
        archer.doDefense();
        archer.setDefense(new Shield());
        archer.doDefense();
    }
}
