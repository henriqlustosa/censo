package censo.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.CensoDto;
import censo.model.Censo;

@RestController
@RequestMapping("/hspmsgh-api/censo")
public class CensoController {

	@GetMapping("/")
	ResponseEntity<List<Censo>> getCensos(){
		
		List<Censo> censos = CensoDto.Censos();
		
		
		if(censos == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(censos);
	}
	
}