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
 * LieuTournage
 * 
 * Represente Lieu du tournage
 * 
 * @author nidhal
 *
 */

@Entity
@Table(name = "LIEU_TOURNAGE")
public class LieuTournage extends Lieu {

	/**
	 * Attribut id pour lieu du tournage 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**Constructeur 
	
	 * @param id
	 * @param ville
	 * @param etatDept
	 * @param pays
	 * @param id2
	 */
	public LieuTournage(int id, String ville, String etatDept, Pays pays, int idLieu) {
		super(id, ville, etatDept, pays);
		id = idLieu;
	}

	/**Constructeur vide et sans paramettre
	 * 
	 */
	public LieuTournage() {
		super();
	}

	@Override
	public String toString() {
		return "LieuTournage [id=" + id + "]";
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


	
	
}
