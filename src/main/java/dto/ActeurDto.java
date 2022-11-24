package dto;

import java.time.LocalDate;

/** ActeurDto 
 * 
 * Represente un acteur 
 * 
 * @author nidhal
 *
 */
public class ActeurDto {

	/** identite */
	private String identite;
	
	/** url */
	private String url;
	
	/** height */
	private int height;
	
	/** date de naissance */
	private LocalDate dateNaissance;

	/**
	 * Constructeur
	 */
	public ActeurDto() {
	}

	@Override
	public String toString() {
		return "ActeurDto [identite=" + identite + ", url=" + url + ", height=" + height + ", dateNaissance="
				+ dateNaissance + "]";
	}

	/** Getter pour identite
	 * @return identite
	 */
	public String getIdentite() {
		return identite;
	}

	/** Setter pour identite
	 * @param identite
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
	}

	/** Getter pour url
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

	/** Getter pour height
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/** Setter pour height
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/** Getter pour la date de naissance 
	 * @return dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**Setter pour la date de naissance 
	 * @param dateNaissance
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
