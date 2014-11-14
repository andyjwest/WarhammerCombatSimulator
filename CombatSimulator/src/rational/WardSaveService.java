package rational;

import rational.model.Attack;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public interface WardSaveService {
    public List<Attack> rollWardSaves(List<Attack> attacks);
}
