package com.mdelacruz.ejemplo.service;

import com.mdelacruz.ejemplo.client.GQ091001Client;
import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import com.mdelacruz.ejemplo.util.Util;
import org.springframework.stereotype.Service;

@Service
public class GQ091001ServiceImpl implements GQ091001Service{

    private GQ091001Client gq091001Client;

    public GQ091001ServiceImpl(GQ091001Client gq091001Client){
        this.gq091001Client = gq091001Client;
    }

    public GR091001Response getGR091001Response(GQ091001Request request){
        return Util.createGR091001Response(gq091001Client.getGR091001Response(request));
    }
}
