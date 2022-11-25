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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pays
 * 
 * Represente un pays
 * 
 * @author nidhal
 *
 */
@Entity
@Table(name = "PAYS")
public class Pays {

	/**
	 * Attribut id de la table PAYS
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Attribut nom
	 */
	@Column(name = "NOM")
	private String nom;

	/**
	 * Attribut url
	 */
	@Column(name = "URL")
	private String url;

	@OneToMany(mappedBy = "pays")
	private List<Film> film = new ArrayList<Film>();

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param nom
	 * @param url
	 * @param film
	 */
	public Pays(int id, String nom, String url, List<Film> film) {
		super();
		this.id = id;
		this.nom = nom;
		this.url = url;
		this.film = film;
	}

	/**
	 * Constructeur sans paramettre et vide
	 * 
	 */
	public Pays() {
		super();
	}

	@Override
	public String toString() {
		return "Pays [id=" + id + ", nom=" + nom + ", url=" + url + ", film=" + film + "]";
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
	 * Getter pour nom
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour nom
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
