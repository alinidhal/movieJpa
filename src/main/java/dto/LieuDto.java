package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** LieuDto
 * 
 * Represente un lieu 
 * 
 * @author nidhal
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class LieuDto {

	/** ville */
	private String ville;

	/** Departement d'état */
	private String etatDept;

	/** pays */
	private PaysDto pays;

	
	/**Constructeur 
	
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public LieuDto(String ville, String etatDept, PaysDto pays) {
		super();
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
	}

	/**
	 * Constructeur vide
	 */
	public LieuDto() {
	}

	@Override
	public String toString() {
		return "LieuDto [ville=" + ville + ", etatDept=" + etatDept + ", pays=" + pays + "]";
	}

	/** Getter pour ville
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}

	/** Setter pour ville
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/** Getter pour departement d'etat
	 * @return etatDept
	 */
	public String getEtatDept() {
		return etatDept;
	}

	/** Setter pour departement d'etat
	 * @param etatDept
	 */
	public void setEtatDept(String etatDept) {
		this.etatDept = etatDept;
	}

	/** Getter pour pays
	 * @return pays
	 */ 
	public PaysDto getPays() {
		return pays;
	}

	/** Settter pour pays
	 * @param pays
	 */
	public void setPays(PaysDto pays) {
		this.pays = pays;
	}

}
