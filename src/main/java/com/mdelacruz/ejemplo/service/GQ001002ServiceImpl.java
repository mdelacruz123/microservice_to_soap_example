package com.mdelacruz.ejemplo.service;

import com.mdelacruz.ejemplo.client.GQ001002Client;
import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.dto.GR001002Response;
import com.mdelacruz.ejemplo.util.Util;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GQ001002ServiceImpl implements GQ001002Service{

    private final GQ001002Client gq001002Client;
    private final Util util;

    public GQ001002ServiceImpl(GQ001002Client gq001002Client, Util util){
        this.gq001002Client = gq001002Client;
        this.util = util;
    }

    @Override
    public Mono<GR001002Response> getGR001002Response(GQ001002Request request){
        return util.createGR001002Response(gq001002Client.getGR001002Response(request));
    }
}
