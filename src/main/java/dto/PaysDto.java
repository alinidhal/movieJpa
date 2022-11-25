package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**PaysDto 
 * 
 * Represente un pays 
 * 
 * @author nidhal
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaysDto {

	/** nom */
	private String nom;
	
	/** url */
	private String url;

	
	/**Constructeur 
	
	 * @param nom
	 * @param url
	 */
	public PaysDto(String nom, String url) {
		super();
		this.nom = nom;
		this.url = url;
	}

	/**
	 * Constructeur vide de PaysDto
	 */
	public PaysDto() {
	}

	@Override
	public String toString() {
		return "PaysDto [nom=" + nom + ", url=" + url + "]";
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
	

}
