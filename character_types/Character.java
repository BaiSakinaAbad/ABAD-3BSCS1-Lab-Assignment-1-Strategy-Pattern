package character_types;

import defenses.Dodge;

public interface Character {
    void doAttack();
    void doDefense();
    void setDefense(Dodge defenseStrategy);

}
