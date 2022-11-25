package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** LieuNaissanceDto 
 * 
 * Represente un lieu de naissance Dto (Data Transfert Object)
 * 
 * @author nidhal
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class LieuNaissanceDto extends LieuDto{
	
	/**
	 * Constructeur vide
	 */
	public LieuNaissanceDto() {}

}
