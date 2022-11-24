package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Film
 * 
 * Represente une table FILM
 * 
 * @author nidhal
 *
 */
@Entity
@Table(name = "FILM")
public class Film {

	/**
	 * L'attribut id de la table
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * Attribut id du film
	 */
	@Column(name = "FILM_ID")
	private String filmId;

	/**
	 * Attribut Url
	 */
	@Column(name = "URL")
	private String url;

	/**
	 * Attribut plot (description)
	 */
	@Column(name = "PLOT")
	private String plot;

	/**
	 * Attribut langue
	 */
	@Column(name = "LANGUE")
	private String langue;

	/**
	 * Attribut année sortie
	 */
	@Column(name = "ANNEE_SORTIE")
	private String annneSortie;

	/**
	 * Liste pour le genre de film
	 * 
	 * Attribut genre
	 */
	@Column(name = "GENRE")
	private List<String> genre = new ArrayList<String>();

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param filmId
	 * @param url
	 * @param plot
	 * @param langue
	 * @param annneSortie
	 * @param genre
	 */
	public Film(int id, String filmId, String url, String plot, String langue, String annneSortie, List<String> genre) {
		super();
		this.id = id;
		this.filmId = filmId;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.annneSortie = annneSortie;
		this.genre = genre;
	}

	/**
	 * Constructeur sans parametre et vide
	 */
	public Film() {
		super();
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", filmId=" + filmId + ", url=" + url + ", plot=" + plot + ", langue=" + langue
				+ ", annneSortie=" + annneSortie + ", genre=" + genre + "]";
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
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour filmId
	 * 
	 * @return filmId
	 */
	public String getFilmId() {
		return filmId;
	}

	/**
	 * Setter pour filmId
	 * 
	 * @param filmId the filmId to set
	 */
	public void setFilmId(String filmId) {
		this.filmId = filmId;
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
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Getter pour plot
	 * 
	 * @return plot
	 */
	public String getPlot() {
		return plot;
	}

	/**
	 * Setter pour plot
	 * 
	 * @param plot the plot to set
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}

	/**
	 * Getter pour langue
	 * 
	 * @return langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * Setter pour langue
	 * 
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * Getter pour annneSortie
	 * 
	 * @return annneSortie
	 */
	public String getAnnneSortie() {
		return annneSortie;
	}

	/**
	 * Setter pour annneSortie
	 * 
	 * @param annneSortie the annneSortie to set
	 */
	public void setAnnneSortie(String annneSortie) {
		this.annneSortie = annneSortie;
	}

	/**
	 * Getter pour genre
	 * 
	 * @return genre
	 */
	public List<String> getGenre() {
		return genre;
	}

	/**
	 * Setter pour genre
	 * 
	 * @param genre the genre to set
	 */
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

}
