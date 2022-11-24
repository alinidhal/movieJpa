/**
 * 
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LieuNaissance
 * 
 * Represente le lieu de naissance
 * 
 * @author nidhal
 *
 */

@Entity
@Table(name = "LIEU_NAISSANCE")
public class LieuNaissance extends Lieu {

	/**
	 * Attribut id table lieu de naissance
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param ville
	 * @param etatDept
	 * @param pays
	 * @param id2
	 */
	public LieuNaissance(int id, String ville, String etatDept, Pays pays, int id2) {
		super(id, ville, etatDept, pays);
		id = id2;
	}

	/**
	 * Constructeur vide
	 * 
	 */
	public LieuNaissance() {
		super();
	}

	@Override
	public String toString() {
		return "LieuNaissance [id=" + id + "]";
	}

	/**
	 * Getter pour id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

}
