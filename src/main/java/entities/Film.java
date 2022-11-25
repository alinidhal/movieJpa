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
import javax.persistence.ManyToOne;
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
	 * Attribut id_pays
	 */
	@ManyToOne
	@Column(name = "ID_PAYS")
	private Pays pays;

	/**
	 * Attribut acteurs
	 */
	@ManyToMany
	@JoinTable(name = "CASTING_PRINCIPAL", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ACTEUR_ID", referencedColumnName = "ID"))
	private List<Acteur> acteurs = new ArrayList<Acteur>();

	/**
	 * Attribut role
	 */
	@ManyToMany
	@JoinTable(name = "FILM_ROLE", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID"))
	private List<Role> roles = new ArrayList<Role>();

	/**
	 * Attribut lieuTournages
	 */
	@ManyToMany
	@JoinTable(name = "FILM_LIEU_TOURNAGE", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "LIEU_TOURNAGE_ID", referencedColumnName = "ID"))
	private List<LieuTournage> lieuTournages = new ArrayList<LieuTournage>();

	/**
	 * Attribut realisateurs
	 */
	@ManyToMany
	@JoinTable(name = "FILM_REALISATEUR", joinColumns = @JoinColumn(name = "FILM_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "REALISATEUR_ID", referencedColumnName = "ID"))
	private List<Realisateur> realisateurs = new ArrayList<Realisateur>();

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
	 * @param pays
	 * @param acteurs
	 * @param roles
	 * @param lieuTournages
	 * @param realisateurs
	 */
	public Film(int id, String filmId, String url, String plot, String langue, String annneSortie, List<String> genre,
			Pays pays, List<Acteur> acteurs, List<Role> roles, List<LieuTournage> lieuTournages,
			List<Realisateur> realisateurs) {
		super();
		this.id = id;
		this.filmId = filmId;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.annneSortie = annneSortie;
		this.genre = genre;
		this.pays = pays;
		this.acteurs = acteurs;
		this.roles = roles;
		this.lieuTournages = lieuTournages;
		this.realisateurs = realisateurs;
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
				+ ", annneSortie=" + annneSortie + ", genre=" + genre + ", pays=" + pays + ", acteurs=" + acteurs
				+ ", roles=" + roles + ", lieuTournages=" + lieuTournages + ", realisateurs=" + realisateurs + "]";
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
	 * @param filmId
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
	 * @param url
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
	 * @param plot
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
	 * @param langue
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
	 * @param annneSortie
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
	 * @param genre
	 */
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	/**
	 * Getter pour pays
	 * 
	 * @return pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * Setter pour pays
	 * 
	 * @param pays
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * Getter pour acteurs
	 * 
	 * @return acteurs
	 */
	public List<Acteur> getActeurs() {
		return acteurs;
	}

	/**
	 * Setter pour acteurs
	 * 
	 * @param acteurs
	 */
	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	/**
	 * Getter pour roles
	 * 
	 * @return roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * Setter pour roles
	 * 
	 * @param roles
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	/**
	 * Getter pour lieuTournages
	 * 
	 * @return lieuTournages
	 */
	public List<LieuTournage> getLieuTournages() {
		return lieuTournages;
	}

	/**
	 * Setter pour lieuTournages
	 * 
	 * @param lieuTournages
	 */
	public void setLieuTournages(List<LieuTournage> lieuTournages) {
		this.lieuTournages = lieuTournages;
	}

	/**
	 * Getter pour realisateurs
	 * 
	 * @return realisateurs
	 */
	public List<Realisateur> getRealisateurs() {
		return realisateurs;
	}

	/**
	 * Setter pour realisateurs
	 * 
	 * @param realisateurs
	 */
	public void setRealisateurs(List<Realisateur> realisateurs) {
		this.realisateurs = realisateurs;
	}

}
