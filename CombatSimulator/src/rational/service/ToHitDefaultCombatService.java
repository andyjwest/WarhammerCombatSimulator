package rational.service;

import rational.model.Attack;
import rational.model.Dice;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public class ToHitDefaultCombatService implements ToHitCombatService {


    public List<Attack> rollToHits(List<Attack> attacks){
        for (Attack attack : attacks){
            attack.setRollToHit(Dice.getD6().roll(1));
            if(attack.getRollToHit() >= toHitChart[attack.getAttackerWeaponSkill()][attack.getDefenderWeaponSkill()]){
                attack.setHit(true);
            }else{
                attack.setHit(false);
            }
        }
        return attacks;
    }
}
