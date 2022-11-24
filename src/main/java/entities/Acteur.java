/**
 * 
 */
package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Acteur 
 * 
 * Represente un Acteur de film
 * 
 * @author nidhal
 *
 */

@Entity
@Table(name="ACTEUR")
public class Acteur {

	/**
	 * Attribut id de la table ACTEUR 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * Attribut identite
	 */
	@Column(name="IDENTITE")
	private String identite;
	
	/**
	 * Attribut URL
	 */
	@Column(name="URL")
	private String url;
	
	/**
	 * Attribut height
	 */
	@Column(name="HEIGHT")
	private float height;
	
	/**
	 * Attribut date de naissance
	 */
	@Column(name="DATE_NAISSANCE")
	private LocalDate dateNaissance;

	/**Constructeur avec paramettre
	
	 * @param id
	 * @param identite
	 * @param url
	 * @param height
	 * @param dateNaissance
	 */
	public Acteur(int id, String identite, String url, float height, LocalDate dateNaissance) {
		super();
		this.id = id;
		this.identite = identite;
		this.url = url;
		this.height = height;
		this.dateNaissance = dateNaissance;
	}

	/**Constructeur vide et sans paramettre
	
	 */
	public Acteur() {
		super();
	}

	@Override
	public String toString() {
		return "Acteur [id=" + id + ", identite=" + identite + ", url=" + url + ", height=" + height
				+ ", dateNaissance=" + dateNaissance + "]";
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

	/**
	 * Getter pour height
	 * @return height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Setter pour height 
	 * @param height
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * Getter pour dateNaissance
	 * @return dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter pour dateNaissance 
	 * @param dateNaissance
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	
}
