package com.mdelacruz.ejemplo.service;

import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.dto.GR001002Response;
import reactor.core.publisher.Mono;

public interface GQ001002Service {
    Mono<GR001002Response> getGR001002Response(GQ001002Request request);
}
