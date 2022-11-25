/**
 * 
 */
package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

	@ManyToMany(mappedBy = "lieuTournages")
	private List<Film> film = new ArrayList<Film>();

	
	/**Constructeur 
	
	 * @param id
	 * @param ville
	 * @param etatDept
	 * @param pays
	 * @param id2
	 * @param film
	 */
	public LieuTournage(int id, String ville, String etatDept, Pays pays, int id2, List<Film> film) {
		super(id, ville, etatDept, pays);
		id = id2;
		this.film = film;
	}


	/**Constructeur vide et sans paramettre
	 * 
	 */
	public LieuTournage() {
		super();
	}


	@Override
	public String toString() {
		return "LieuTournage [id=" + id + ", film=" + film + "]";
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
	 * Getter pour film
	 * @return film
	 */
	public List<Film> getFilm() {
		return film;
	}


	/**
	 * Setter pour film 
	 * @param film
	 */
	public void setFilm(List<Film> film) {
		this.film = film;
	}


	
	
}
