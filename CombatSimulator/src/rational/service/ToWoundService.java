package rational.service;

import rational.model.Attack;
import rational.model.UnitModel;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public interface ToWoundService {
    public static int[][] toWoundChart = {
            {},
            {0,4,5,6,6,6,6,6,6,6,6},
            {0,3,4,5,6,6,6,6,6,6,6},
            {0,2,3,4,5,6,6,6,6,6,6},
            {0,2,2,3,4,5,6,6,6,6,6},
            {0,2,2,2,3,4,5,6,6,6,6},
            {0,2,2,2,2,3,4,5,6,6,6},
            {0,2,2,2,2,2,3,4,5,6,6},
            {0,2,2,2,2,2,2,3,4,5,6},
            {0,2,2,2,2,2,2,2,3,4,5},
            {0,2,2,2,2,2,2,2,2,3,4},
    };

    public List<Attack> getNumberOfWounds(List<Attack> attacks);


}