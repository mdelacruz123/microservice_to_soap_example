package com.mdelacruz.ejemplo.service;

import com.mdelacruz.ejemplo.client.GQ001002Client;
import com.mdelacruz.ejemplo.client.GQ091001Client;
import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR001002Response;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import com.mdelacruz.ejemplo.util.Util;
import org.springframework.stereotype.Service;

@Service
public class GQ001002ServiceImpl implements GQ001002Service{

    private GQ001002Client gq001002Client;

    public GQ001002ServiceImpl(GQ001002Client gq001002Client){
        this.gq001002Client = gq001002Client;
    }

    public GR001002Response getGR001002Response(GQ001002Request request){
        return Util.createGR001002Response(gq001002Client.getGR001002Response(request));
    }
}
