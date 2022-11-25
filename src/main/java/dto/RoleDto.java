package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * RoleDto
 * 
 * Represente role
 * 
 * @author nidhal
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto {

	/** characterName */
	private String characterName;

	/**
	 * Constructeur
	 * 
	 * @param characterName
	 */
	public RoleDto(String characterName) {
		super();
		this.characterName = characterName;
	}

	/**
	 * Constructeur vide
	 */
	public RoleDto() {
	}

	@Override
	public String toString() {
		return "Role [characterName=" + characterName + "]";
	}

	/**
	 * Getter pour character name
	 * 
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * Setter pour character name
	 * 
	 * @param characterName
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}
