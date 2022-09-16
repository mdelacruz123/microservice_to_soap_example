package com.mdelacruz.ejemplo.util;

import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR001002Response;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import com.mdelacruz.ejemplo.wsdl.gq091001.*;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class Util {
    public static RequestMessage createGQ091001SOAPRequest(GQ091001Request request){

        com.mdelacruz.ejemplo.wsdl.gq091001.RequestMessage soapRequest = new com.mdelacruz.ejemplo.wsdl.gq091001.RequestMessage();

        IssuerApplicationHeader issuerApplicationHeader = new IssuerApplicationHeader();
        issuerApplicationHeader.setContextFunction(request.getContextFunction());

        GQ091001 gq091001Object = new GQ091001();
        GeDmArgumentBlockGQ091001Subset0001 geDmArgumentBlockGQ091001Subset0001
                = new GeDmArgumentBlockGQ091001Subset0001();

        String256Field key1 = new String256Field();
        key1.setValue(request.getKey1Value());

        String4Field code1 = new String4Field();
        code1.setValue(request.getCode1Value());

        String80Field text1 = new String80Field();
        text1.setValue(request.getText1Value());

        String80Field text2 = new String80Field();
        //text2.setValue(request.getText2Value());

        String4Field code2 = new String4Field();
        code2.setValue(request.getCode2Value());

        geDmArgumentBlockGQ091001Subset0001.setKey1(key1);
        geDmArgumentBlockGQ091001Subset0001.setCode1(code1);
        geDmArgumentBlockGQ091001Subset0001.setText1(text1);
        geDmArgumentBlockGQ091001Subset0001.setText2(text2);
        geDmArgumentBlockGQ091001Subset0001.setCode2(code2);

        gq091001Object.setGeDmArgumentBlockGQ091001Subset0001(geDmArgumentBlockGQ091001Subset0001);

        soapRequest.setIssuerApplicationHeader(issuerApplicationHeader);
        soapRequest.setGQ091001(gq091001Object);

        return soapRequest;
    }

    public static Mono<GR091001Response> createGR091001Response(Mono<ResponseMessage> response){
        return response
                .map(r->{
                    GR091001Response gr091001Response = new GR091001Response();

                    gr091001Response.setSessionType(r.getGR091001().getGeDmSignOnProfile().getSessionType().getValue());
                    gr091001Response.setSignOnDate(r.getGR091001().getGeDmSignOnProfile().getSignOnDate().getValue().toString());
                    gr091001Response.setClientNetworkAddress(r.getGR091001().getGeDmSignOnProfile().getClientNetworkAddress().getValue());
                    gr091001Response.setSignOnId(r.getGR091001().getGeDmSignOnProfile().getSignOnId().getValue());
                    return gr091001Response;
                });
    }

    public static com.mdelacruz.ejemplo.wsdl.gq001002.RequestMessage createGQ001002SOAPRequest(GQ001002Request request) {

        com.mdelacruz.ejemplo.wsdl.gq001002.RequestMessage soapRequest = new com.mdelacruz.ejemplo.wsdl.gq001002.RequestMessage();
        com.mdelacruz.ejemplo.wsdl.gq001002.IssuerApplicationHeader issuerApplicationHeader = new com.mdelacruz.ejemplo.wsdl.gq001002.IssuerApplicationHeader();
        issuerApplicationHeader.setSessionId(request.getSessionId());
        issuerApplicationHeader.setContextFunction(request.getContextFunction());
        soapRequest.setIssuerApplicationHeader(issuerApplicationHeader);
        return soapRequest;
    }

    public static Mono<GR001002Response> createGR001002Response(Mono<com.mdelacruz.ejemplo.wsdl.gq001002.ResponseMessage> response){
        return response.map(res->{
            GR001002Response gr001002Response = new GR001002Response();

            gr001002Response.setIdValue(res.getGR001002().getRepeatingGroupOut1().getRepeatingGroupInstanceOut1()
                    .get(0).getGeDmInstitution().getId().getValue());
            gr001002Response.setNameValue(res.getGR001002().getRepeatingGroupOut1().getRepeatingGroupInstanceOut1()
                    .get(0).getGeDmInstitution().getName().getValue());
            return gr001002Response;
        });
    }

}
