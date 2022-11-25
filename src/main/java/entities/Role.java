/**
 * 
 */
package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Role
 * 
 * Represente Role
 * 
 * @author nidhal
 *
 */

@Entity
@Table(name = "ROLE")
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
	@Column(name = "CHARACTER_NAME")
	private String characterName;

	/**
	 * Attribut acteurs
	 */
	@ManyToMany
	@JoinTable(name = "ACTEUR_ROLE", joinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ACTEUR_ID", referencedColumnName = "ID"))
	private List<Acteur> acteurs = new ArrayList<Acteur>();

	/**
	 * Attribut film
	 */
	@ManyToMany(mappedBy = "roles")
	private List<Film> film = new ArrayList<Film>();


	/**
	 * Constructeur
	 * 
	 */
	public Role() {
		super();
	}


}
