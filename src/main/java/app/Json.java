package app;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.icu.text.SimpleDateFormat;

import dto.FilmDto;

public class Json {

	public static void main(String[] args) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		mapper.setDateFormat(formatter);
		
		FilmDto[] filmDto = mapper.readValue(new File("src/main/resources/films/films.json"), FilmDto[].class);
		for (FilmDto f: filmDto) {
			System.out.println(f);
		}
	}

}
