package rational.service;

import rational.model.Attack;
import rational.model.Dice;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public class ToWoundDefaultService implements ToWoundService {

    @Override
    public List<Attack> getNumberOfWounds(List<Attack> attacks) {
        for(Attack attack : attacks){
            attack.setRollToWound(Dice.getD6().roll(1));
            if(attack.getRollToWound() >= toWoundChart[attack.getAttackerStrength()][attack.getDefenderToughness()]){
                attack.setWound(true);
            }else{
                attack.setWound(false);
            }
        }
        return attacks;
    }
}
