package rational.service;

import rational.model.Attack;
import rational.model.Dice;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public class WardSaveDefaultService implements WardSaveService{
    @Override
    public List<Attack> rollWardSaves(List<Attack> attacks){
        for(Attack attack : attacks){
            int roll = Dice.getD6().roll(1);
            if(roll >= attack.getWardSave()){
                attack.setWardSaveMade(true);
            }else{
                attack.setWardSaveMade(false);
            }
        }
        return attacks;
    }
}
