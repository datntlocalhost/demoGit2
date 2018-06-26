package datnguyen.emperors.com.datatypes.players;

public class Properties {

	private int heartPoint;
	private int attackPoint;
	private int decreaseDamage;
	private int increaseDamage;
	
	private int vitalityPoint;
	private int agilityPoint;
	private int strongPoint;
	private int obserPoint;
	
	private int resistance;
	private int ignResis;
	private int ignBaseResis;
	private int accurancy;
	private int dodge;
	private int ignDodge;
	private int ignBaseDodge;
	
	private int critical;
	private int criticalDamage;
	private int reCritRate;
	private int reCritDamage;
	private int ignCritical;
	
	private int speedHit;
	private int flee;
	
	public Properties(int heartPoint, int attackPoint, int decreaseDamage, int increaseDamage, int vitalityPoint,
			int agilityPoint, int strongPoint, int obserPoint, int resistance, int ignResis, int ignBaseResis,
			int accurancy, int dodge, int ignDodge, int ignBaseDodge, int critical, int criticalDamage, int reCritRate,
			int reCritDamage, int ignCritical, int speedHit, int flee) {
		super();
		this.heartPoint = heartPoint;
		this.attackPoint = attackPoint;
		this.decreaseDamage = decreaseDamage;
		this.increaseDamage = increaseDamage;
		this.vitalityPoint = vitalityPoint;
		this.agilityPoint = agilityPoint;
		this.strongPoint = strongPoint;
		this.obserPoint = obserPoint;
		this.resistance = resistance;
		this.ignResis = ignResis;
		this.ignBaseResis = ignBaseResis;
		this.accurancy = accurancy;
		this.dodge = dodge;
		this.ignDodge = ignDodge;
		this.ignBaseDodge = ignBaseDodge;
		this.critical = critical;
		this.criticalDamage = criticalDamage;
		this.reCritRate = reCritRate;
		this.reCritDamage = reCritDamage;
		this.ignCritical = ignCritical;
		this.speedHit = speedHit;
		this.flee = flee;
	}
	public int getHeartPoint() {
		return heartPoint;
	}
	public void setHeartPoint(int heartPoint) {
		this.heartPoint = heartPoint;
	}
	public int getAttackPoint() {
		return attackPoint;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	public int getDecreaseDamage() {
		return decreaseDamage;
	}
	public void setDecreaseDamage(int decreaseDamage) {
		this.decreaseDamage = decreaseDamage;
	}
	public int getIncreaseDamage() {
		return increaseDamage;
	}
	public void setIncreaseDamage(int increaseDamage) {
		this.increaseDamage = increaseDamage;
	}
	public int getVitalityPoint() {
		return vitalityPoint;
	}
	public void setVitalityPoint(int vitalityPoint) {
		this.vitalityPoint = vitalityPoint;
	}
	public int getAgilityPoint() {
		return agilityPoint;
	}
	public void setAgilityPoint(int agilityPoint) {
		this.agilityPoint = agilityPoint;
	}
	public int getStrongPoint() {
		return strongPoint;
	}
	public void setStrongPoint(int strongPoint) {
		this.strongPoint = strongPoint;
	}
	public int getObserPoint() {
		return obserPoint;
	}
	public void setObserPoint(int obserPoint) {
		this.obserPoint = obserPoint;
	}
	public int getResistance() {
		return resistance;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
	public int getIgnResis() {
		return ignResis;
	}
	public void setIgnResis(int ignResis) {
		this.ignResis = ignResis;
	}
	public int getIgnBaseResis() {
		return ignBaseResis;
	}
	public void setIgnBaseResis(int ignBaseResis) {
		this.ignBaseResis = ignBaseResis;
	}
	public int getAccurancy() {
		return accurancy;
	}
	public void setAccurancy(int accurancy) {
		this.accurancy = accurancy;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public int getIgnDodge() {
		return ignDodge;
	}
	public void setIgnDodge(int ignDodge) {
		this.ignDodge = ignDodge;
	}
	public int getIgnBaseDodge() {
		return ignBaseDodge;
	}
	public void setIgnBaseDodge(int ignBaseDodge) {
		this.ignBaseDodge = ignBaseDodge;
	}
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getCriticalDamage() {
		return criticalDamage;
	}
	public void setCriticalDamage(int criticalDamage) {
		this.criticalDamage = criticalDamage;
	}
	public int getReCritRate() {
		return reCritRate;
	}
	public void setReCritRate(int reCritRate) {
		this.reCritRate = reCritRate;
	}
	public int getReCritDamage() {
		return reCritDamage;
	}
	public void setReCritDamage(int reCritDamage) {
		this.reCritDamage = reCritDamage;
	}
	public int getIgnCritical() {
		return ignCritical;
	}
	public void setIgnCritical(int ignCritical) {
		this.ignCritical = ignCritical;
	}
	public int getSpeedHit() {
		return speedHit;
	}
	public void setSpeedHit(int speedHit) {
		this.speedHit = speedHit;
	}
	public int getFlee() {
		return flee;
	}
	public void setFlee(int flee) {
		this.flee = flee;
	}

}
