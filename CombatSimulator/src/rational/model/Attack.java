package rational.model;

import rational.enums.SpecialRuleTypeEnum;

import java.util.List;

/**
 * Created by awest on 11/14/14.
 */
public class Attack {
    int attackerWeaponSkill;
    int defenderWeaponSkill;
    int attackerStrength;
    int defenderToughness;
    Integer rollToHit;
    Integer rollToWound;
    Boolean hit;
    Boolean wound;
    int armorSave;
    Boolean armorSaveMade;
    int wardSave;
    Boolean wardSaveMade;

    List<SpecialRuleTypeEnum> specialRules;

    public int getAttackerStrength() {
        return attackerStrength;
    }

    public void setAttackerStrength(int attackerStrength) {
        this.attackerStrength = attackerStrength;
    }

    public Boolean getHit() {
        return hit;
    }

    public void setHit(Boolean hit) {
        this.hit = hit;
    }

    public Boolean getWound() {
        return wound;
    }

    public void setWound(Boolean wound) {
        this.wound = wound;
    }

    public List<SpecialRuleTypeEnum> getSpecialRules() {
        return specialRules;
    }

    public int getAttackerWeaponSkill() {
        return attackerWeaponSkill;
    }

    public void setAttackerWeaponSkill(int attackerWeaponSkill) {
        this.attackerWeaponSkill = attackerWeaponSkill;
    }

    public int getDefenderWeaponSkill() {
        return defenderWeaponSkill;
    }

    public void setDefenderWeaponSkill(int defenderWeaponSkill) {
        this.defenderWeaponSkill = defenderWeaponSkill;
    }

    public int getDefenderToughness() {
        return defenderToughness;
    }

    public void setDefenderToughness(int defenderToughness) {
        this.defenderToughness = defenderToughness;
    }

    public void setSpecialRules(List<SpecialRuleTypeEnum> specialRules) {
        this.specialRules = specialRules;
    }

    public Integer getRollToHit() {
        return rollToHit;
    }

    public void setRollToHit(Integer rollToHit) {
        this.rollToHit = rollToHit;
    }

    public Integer getRollToWound() {
        return rollToWound;
    }

    public void setRollToWound(Integer rollToWound) {
        this.rollToWound = rollToWound;
    }

    public int getArmorSave() {
        return armorSave;
    }

    public void setArmorSave(int armorSave) {
        this.armorSave = armorSave;
    }

    public Boolean getArmorSaveMade() {
        return armorSaveMade;
    }

    public void setArmorSaveMade(Boolean armorSaveMade) {
        this.armorSaveMade = armorSaveMade;
    }

    public int getWardSave() {
        return wardSave;
    }

    public void setWardSave(int wardSave) {
        this.wardSave = wardSave;
    }

    public Boolean getWardSaveMade() {
        return wardSaveMade;
    }

    public void setWardSaveMade(Boolean wardSaveMade) {
        this.wardSaveMade = wardSaveMade;
    }
}
