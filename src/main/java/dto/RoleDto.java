package dto;

/** RoleDto
 * 
 * Represente role
 * 
 * @author nidhal
 *
 */
public class RoleDto {

	/** characterName */
	private String characterName;
	
	/**
	 * Constructeur vide
	 */
	public RoleDto() {
	}

	@Override
	public String toString() {
		return "Role [characterName=" + characterName + "]";
	}

	/** Getter pour character name
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/** Setter pour character name
	 * @param characterName
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	
	
}
