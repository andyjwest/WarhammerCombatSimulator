package rational.service;

import rational.model.Attack;
import rational.model.Dice;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public class ArmorSaveDefaultService implements ArmorSaveService{
    @Override
    public List<Attack> rollArmorSaves(List<Attack> attacks){
        for(Attack attack : attacks){
            int saveModifier = 0;
            if (attack.getAttackerStrength() > 3){
                saveModifier = attack.getAttackerStrength() - 3;
            }
            int roll = Dice.getD6().roll(1);
            if(roll - saveModifier >= attack.getArmorSave()){
                attack.setArmorSaveMade(true);
            }else{
                attack.setArmorSaveMade(false);
            }
        }
        return attacks;
    }
}
