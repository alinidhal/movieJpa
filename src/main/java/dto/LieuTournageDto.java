package dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** LieuTournageDto
 * 
 * Represente un lieu de tournage 
 * 
 * @author nidhal
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class LieuTournageDto extends LieuDto{

	/**
	 * Constructeur vide
	 */
	public LieuTournageDto() {}
}
