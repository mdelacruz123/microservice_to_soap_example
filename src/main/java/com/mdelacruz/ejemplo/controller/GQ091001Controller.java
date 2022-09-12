package com.mdelacruz.ejemplo.controller;

import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import com.mdelacruz.ejemplo.service.GQ091001Service;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signon")
public class GQ091001Controller {

    @Autowired
    GQ091001Service gq091001Service;

    @Operation(summary = "Inicia sesión con ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sesión Iniciada",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GQ091001Request.class)) }),
            @ApiResponse(responseCode = "404", description = "Operación no encontrada",
                    content = @Content) })
    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GR091001Response> getGr091001Response(@RequestBody GQ091001Request request) {
        return new ResponseEntity<GR091001Response>(gq091001Service.getGR091001Response(request), HttpStatus.OK);
    }

}
