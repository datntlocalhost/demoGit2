package datnguyen.emperors.com.datatypes.players;

import java.util.UUID;

public class Player {
	
	private String     playerName;
	private UUID       uuid;
	private int        level;
	private int        experience;
	
	private Properties playerProper;
	
	public Player(String playerName, UUID uuid) {
		super();
		this.playerName = playerName;
		this.uuid = uuid;
	}
	
	public Player(String playerName, UUID uuid, int level, int experience, Properties playerProper) {
		super();
		this.playerName = playerName;
		this.uuid = uuid;
		this.level = level;
		this.experience = experience;
		this.playerProper = playerProper;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Properties getPlayerProper() {
		return playerProper;
	}

	public void setPlayerProper(Properties playerProper) {
		this.playerProper = playerProper;
	}
	
	
	

}
