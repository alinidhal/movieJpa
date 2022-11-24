/**
 * 
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** Role
 * 
 * Represente Role
 * 
 * @author nidhal
 *
 */

@Entity
@Table(name="ROLE")
public class Role {

	/**
	 * Attribut id de la table
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * Attribut Caracter nom
	 */
	@Column(name="CHARACTER_NAME")
	private String characterName;

	/**Constructeur 
	
	 * @param id
	 * @param characterName
	 */
	public Role(int id, String characterName) {
		super();
		this.id = id;
		this.characterName = characterName;
	}

	/**Constructeur 
	
	 */
	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", characterName=" + characterName + "]";
	}

	/**
	 * Getter pour id
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour id 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour characterName
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * Setter pour characterName 
	 * @param characterName
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	
	
	
}
