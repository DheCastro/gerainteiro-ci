package br.com.dhecastro.gerainteiro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value="REST Gera Inteiro")
@RestController
@RequestMapping("/gerainteiro")
public class GeraInteiroResource {

	@ApiOperation(value="Retorna um número inteiro formado a partir de outros dois, com lógica específica")
    @RequestMapping(value = "/{numeroa}/{numerob}", method = RequestMethod.GET)
    public ResponseEntity<Integer> geraInteiro(@ApiParam("numero a") @PathVariable("numeroa") String numeroum,
    													  @ApiParam("numero b") @PathVariable("numerob") String numerodois) {
    
		if (numeroum == null || numerodois == null) {
			return new ResponseEntity<Integer>(0, HttpStatus.OK);
        }
		
        String c = "";
        int limite = Math.max(numeroum.length(), numerodois.length());
        for (int i = 0; i <= limite; i++) {
            if (i < numeroum.length()) {
                c += numeroum.charAt(i);
            }
            if (i < numerodois.length()) {
                c += numerodois.charAt(i);
            }
        }
        
	    return new ResponseEntity<Integer>(Integer.parseInt(c) > 1000000 ? -1 : Integer.parseInt(c), HttpStatus.OK);
    } 
}
