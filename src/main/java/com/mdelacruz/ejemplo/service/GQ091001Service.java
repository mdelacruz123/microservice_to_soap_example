package com.mdelacruz.ejemplo.service;

import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import reactor.core.publisher.Mono;

public interface GQ091001Service {
    Mono<GR091001Response> getGR091001Response(GQ091001Request request);
}
