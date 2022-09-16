package com.mdelacruz.ejemplo.controller;


import com.mdelacruz.ejemplo.dto.GR001002Response;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import com.mdelacruz.ejemplo.service.GQ001002Service;
import com.mdelacruz.ejemplo.service.GQ091001Service;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Service
public class GQ091001Router {

    private final GQ091001Service gq091001Service;

    private final GQ001002Service gq001002Service;

    public GQ091001Router(GQ091001Service gq091001Service, GQ001002Service gq001002Service) {
        this.gq091001Service = gq091001Service;
        this.gq001002Service = gq001002Service;
    }

    @Operation(summary = "Inicia sesión con ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sesión Iniciada",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GR091001Response.class)) }),
            @ApiResponse(responseCode = "404", description = "Operación no encontrada",
                    content = @Content) })
    @Bean
    public RouterFunction<ServerResponse> routeLogin(GQ091001Handler handler){
        return route().path(
                "signon", builder -> builder
                        .POST("login", handler::getGR091001Response)
        ).build();
    }

    @Operation(summary = "Inicia sesión con (otro ws de prueba)")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sesión Iniciada",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = GR001002Response.class)) }),
            @ApiResponse(responseCode = "404", description = "Operación no encontrada",
                    content = @Content) })
    @Bean
    public RouterFunction<ServerResponse> routeLoginTwo(GQ091001Handler handler){
        return route().path(
                "signon", builder -> builder
                        .POST("login2", handler::getGR001002Response)
        ).build();
    }
}
