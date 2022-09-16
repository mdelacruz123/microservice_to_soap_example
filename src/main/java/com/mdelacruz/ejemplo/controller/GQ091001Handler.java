package com.mdelacruz.ejemplo.controller;

import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.service.GQ001002Service;
import com.mdelacruz.ejemplo.service.GQ091001Service;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import reactor.core.publisher.Mono;

@Service
public class GQ091001Handler extends WebServiceGatewaySupport {

    private final GQ001002Service gq001002Service;
    private final GQ091001Service gq091001Service;

    public GQ091001Handler(GQ001002Service gq001002Service, GQ091001Service gq091001Service) {
        this.gq001002Service = gq001002Service;
        this.gq091001Service = gq091001Service;
    }

    public Mono<ServerResponse> getGR001002Response(ServerRequest req){
        return req.bodyToMono(GQ001002Request.class)
                .flatMap(r->gq001002Service.getGR001002Response(r))
                .flatMap(s -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(s))
                .onErrorResume(e -> Mono.just("Error " + e.getMessage()).flatMap(s -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(s)));
    }

    public Mono<ServerResponse> getGR091001Response(ServerRequest req){
        return req.bodyToMono(GQ091001Request.class)
                .flatMap(r->gq091001Service.getGR091001Response(r))
                .flatMap(s -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(s))
                .onErrorResume(e -> Mono.just("Error " + e.getMessage()).flatMap(s -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .bodyValue(s)));
    }
}
