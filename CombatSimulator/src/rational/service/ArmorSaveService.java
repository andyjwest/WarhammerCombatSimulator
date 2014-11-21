package rational.service;

import rational.model.Attack;
import rational.model.UnitModel;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public interface ArmorSaveService {
    public List<Attack> rollArmorSaves(List<Attack> attacks);
}
