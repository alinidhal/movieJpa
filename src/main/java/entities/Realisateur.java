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

/**
 * Realisateur
 * 
 * Respresente le realisateur d'un film
 * 
 * @author nidhal
 *
 */

@Entity
@Table(name = "REALISATEUR")
public class Realisateur {

	/**
	 * Attribut Id de la table
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Attribut Identite
	 */
	@Column(name = "IDENTITE")
	private String identite;
	
	/**
	 * Attribut URL
	 */
	@Column(name="URL")
	private String url;

	/**Constructeur avec paramettre
	
	 * @param id
	 * @param identite
	 * @param url
	 */
	public Realisateur(int id, String identite, String url) {
		super();
		this.id = id;
		this.identite = identite;
		this.url = url;
	}

	/**Constructeur vide sans paramettre
	
	 */
	public Realisateur() {
		super();
	}

	@Override
	public String toString() {
		return "Realisateur [id=" + id + ", identite=" + identite + ", url=" + url + "]";
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
	 * Getter pour identite
	 * @return identite
	 */
	public String getIdentite() {
		return identite;
	}

	/**
	 * Setter pour identite 
	 * @param identite
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
	}

	/**
	 * Getter pour url
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter pour url 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
}
