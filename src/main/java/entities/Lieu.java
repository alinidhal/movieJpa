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

/** Lieu 
 * 
 * Represente un lieu 
 * 
 * @author nidhal
 *
 */
@Entity
@Table(name="LIEU")
public class Lieu {

	
	/**
	 * Attribut id de la Table 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	/**
	 * Attribut ville
	 */
	@Column(name="VILLE")
	private String ville;
	
	/**
	 * Attribut departement d'etat
	 */
	@Column(name="ETAT_DEPT")
	private String etatDept;
	
	/**
	 * Object Pays 
	 */
	@Column(name="PAYS")
	private Pays pays;

	/**Constructeur 
	
	 * @param id
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public Lieu(int id, String ville, String etatDept, Pays pays) {
		super();
		this.id = id;
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
	}

	/**Constructeur 
	
	 */
	public Lieu() {
		super();
	}

	@Override
	public String toString() {
		return "Lieu [id=" + id + ", ville=" + ville + ", etatDept=" + etatDept + ", pays=" + pays + "]";
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
	 * Getter pour ville
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter pour ville 
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * Getter pour etatDept
	 * @return etatDept
	 */
	public String getEtatDept() {
		return etatDept;
	}

	/**
	 * Setter pour etatDept 
	 * @param etatDept
	 */
	public void setEtatDept(String etatDept) {
		this.etatDept = etatDept;
	}

	/**
	 * Getter pour pays
	 * @return pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * Setter pour pays 
	 * @param pays
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
	
	
	
	
}
