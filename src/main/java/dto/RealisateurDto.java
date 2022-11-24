package dto;

/**
 * RealisateurDto
 * 
 * Represente realisateur
 * 
 * @author nidhal
 *
 */
public class RealisateurDto {

	/** identite */
	private String identite;

	/** url */
	private String url;

	public RealisateurDto() {
		super();
	}

	@Override
	public String toString() {
		return "Realisateur [identite=" + identite + ", url=" + url + "]";
	}

	/**Getter pour identite
	 * @return identite
	 */
	public String getIdentite() {
		return identite;
	}

	/**Setter pour identite
	 * @param identite
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
	}

	/**Getter pour url
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**Setter pour url
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
