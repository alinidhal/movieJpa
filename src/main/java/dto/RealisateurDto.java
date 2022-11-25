package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * RealisateurDto
 * 
 * Represente realisateur
 * 
 * @author nidhal
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RealisateurDto {

	/** identite */
	private String identite;

	/** url */
	private String url;

	/**
	 * Constructeur
	 * 
	 * @param identite
	 * @param url
	 */
	public RealisateurDto(String identite, String url) {
		super();
		this.identite = identite;
		this.url = url;
	}

	/**
	 * Constructeur
	 * 
	 */
	public RealisateurDto() {
		super();
	}

	@Override
	public String toString() {
		return "Realisateur [identite=" + identite + ", url=" + url + "]";
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

}
