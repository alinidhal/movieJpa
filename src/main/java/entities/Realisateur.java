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
import javax.persistence.ManyToMany;
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
	@Column(name = "URL")
	private String url;

	/**
	 * Attribut film
	 */
	@ManyToMany(mappedBy = "realisateurs")
	private List<Film> film = new ArrayList<Film>();

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param identite
	 * @param url
	 * @param film
	 */
	public Realisateur(int id, String identite, String url, List<Film> film) {
		super();
		this.id = id;
		this.identite = identite;
		this.url = url;
		this.film = film;
	}

	/**
	 * Constructeur vide sans paramettre
	 * 
	 */
	public Realisateur() {
		super();
	}

	@Override
	public String toString() {
		return "Realisateur [id=" + id + ", identite=" + identite + ", url=" + url + ", film=" + film + "]";
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

	/**
	 * Getter pour identite
	 * 
	 * @return identite
	 */
	public String getIdentite() {
		return identite;
	}

	/**
	 * Setter pour identite
	 * 
	 * @param identite
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
	}

	/**
	 * Getter pour url
	 * 
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter pour url
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Getter pour film
	 * 
	 * @return film
	 */
	public List<Film> getFilm() {
		return film;
	}

	/**
	 * Setter pour film
	 * 
	 * @param film
	 */
	public void setFilm(List<Film> film) {
		this.film = film;
	}

}
