package dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FilmDto
 * 
 * Represente un film
 * 
 * @author nidhal
 *
 */
public class FilmDto {

	/** Id du film */
	@JsonProperty("id")
	private String filmId;

	/** pays */
	private PaysDto pays;

	/** nom */
	private String nom;

	/** url */
	private String url;

	/** Description */
	private String plot;

	/** langue */
	private String langue;

	/** lieu de tournage */
	private LieuTournageDto lieuTournage;

	/** realisateur */
	private RealisateurDto realisateur;

	/** annee sortie */
	private String anneeSortie;

	/** role */
	private RoleDto role;

	/** genre */
	private List<String> genre = new ArrayList<String>();

	/**
	 * Constructeur vide de FilmDto
	 */
	public FilmDto() {
	}

	@Override
	public String toString() {
		return "FilmDto [FilmId=" + filmId + ", nom=" + nom + ", pays=" + pays + ", url=" + url + ", plot=" + plot
				+ ", langue=" + langue + ", lieuTournage=" + lieuTournage + ", realisateur=" + realisateur
				+ ", anneeSortie=" + anneeSortie + ", role=" + role + ", genre=" + genre + "]";
	}

	/** Getter pour Realisateur
	 * @return realisateur
	 */
	public RealisateurDto getRealisateur() {
		return realisateur;
	}

	/** Setter pour Realisateur
	 * @param realisateur
	 */
	public void setRealisateur(RealisateurDto realisateur) {
		this.realisateur = realisateur;
	}

	/** Getter pour Role
	 *
	 * @return role
	 */
	public RoleDto getRole() {
		return role;
	}

	/** Setter pour role
	 * @param role
	 */
	public void setRole(RoleDto role) {
		this.role = role;
	}

	/** Getter  pour lieu du tournage 
	 * @return lieuTournage
	 */
	public LieuTournageDto getLieuTournage() {
		return lieuTournage;
	}

	/** Setter pour lieu du tournage 
	 * @param lieuTournage
	 */
	public void setLieuTournage(LieuTournageDto lieuTournage) {
		this.lieuTournage = lieuTournage;
	}

	/** Getter pour id du film
	 * @return filmId
	 */
	public String getFilmId() {
		return filmId;
	}

	/** Setter pour id du film 
	 * @param filmId
	 */
	public void setFilmId(String filmId) {
		this.filmId = filmId;
	}

	/** Getter pour nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour nom
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour Pays 
	 * @return pays
	 */
	public PaysDto getPays() {
		return pays;
	}

	/** Setter pour pays 
	 * @param pays
	 */
	public void setPays(PaysDto pays) {
		this.pays = pays;
	}

	/**Getter pour url
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/** Setter pour url
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/** Getter pour plot, la description
	 * @return plot
	 */
	public String getPlot() {
		return plot;
	}

	/** Setter pour plot
	 * @param plot
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}

	/** Getter pour langue 
	 * @return langue 
	 */
	public String getLangue() {
		return langue;
	}

	/** Setter pour langue 
	 * @param langue
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/** Getter pour annee sortie 
	 * @return anneeSortie
	 */
	public String getAnneeSortie() {
		return anneeSortie;
	}

	/** Setter pour annee sortie 
	 * @param anneeSortie
	 */
	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	/**Getter pour genre
	 * @return genre
	 */
	public List<String> getGenre() {
		return genre;
	}

	/** Setter pour genre
	 * @param genre
	 */
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

}
