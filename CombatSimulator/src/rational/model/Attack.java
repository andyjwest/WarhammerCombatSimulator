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
    Integer armorSave;
    Boolean armorSaveMade;
    Integer wardSave;
    Boolean wardSaveMade;

    List<SpecialRuleTypeEnum> attackerSpecialRules;
    List<SpecialRuleTypeEnum> defenderSpecialRules;

    public Attack(UnitModel attacker, UnitModel defender){
        setAttackerWeaponSkill(attacker.getWeaponSkill());
        setDefenderWeaponSkill(defender.getWeaponSkill());
        setAttackerStrength(attacker.getStrengthWithWeapon());
        setDefenderToughness(defender.getToughness());
        setArmorSave(defender.getArmorSave());
        setWardSave(defender.getWardSave());
        setAttackerSpecialRules(attacker.getSpecialRules());
        setDefenderSpecialRules(defender.getSpecialRules());
    }

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

    public List<SpecialRuleTypeEnum> getAttackerSpecialRules() {
        return attackerSpecialRules;
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

    public void setAttackerSpecialRules(List<SpecialRuleTypeEnum> attackerSpecialRules) {
        this.attackerSpecialRules = attackerSpecialRules;
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

    public Integer getArmorSave() {
        return armorSave;
    }

    public void setArmorSave(Integer armorSave) {
        this.armorSave = armorSave;
    }

    public Boolean getArmorSaveMade() {
        return armorSaveMade;
    }

    public void setArmorSaveMade(Boolean armorSaveMade) {
        this.armorSaveMade = armorSaveMade;
    }

    public Integer getWardSave() {
        return wardSave;
    }

    public void setWardSave(Integer wardSave) {
        this.wardSave = wardSave;
    }

    public Boolean getWardSaveMade() {
        return wardSaveMade;
    }

    public void setWardSaveMade(Boolean wardSaveMade) {
        this.wardSaveMade = wardSaveMade;
    }

    public List<SpecialRuleTypeEnum> getDefenderSpecialRules() {
        return defenderSpecialRules;
    }

    public void setDefenderSpecialRules(List<SpecialRuleTypeEnum> defenderSpecialRules) {
        this.defenderSpecialRules = defenderSpecialRules;
    }
}
