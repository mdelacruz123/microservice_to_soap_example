package com.mdelacruz.ejemplo.util;

import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.dto.GR091001Response;
import com.mdelacruz.ejemplo.wsdl.*;

public class Util {
    public static RequestMessage createGQ091001SOAPRequest(GQ091001Request request){

        RequestMessage soapRequest = new RequestMessage();

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

    public static GR091001Response createGR091001Response(ResponseMessage response){

        GR091001Response gr091001Response = new GR091001Response();

        gr091001Response.setSessionType(response.getGR091001().getGeDmSignOnProfile().getSessionType().getValue());
        gr091001Response.setSignOnDate(response.getGR091001().getGeDmSignOnProfile().getSignOnDate().getValue().toString());
        gr091001Response.setClientNetworkAddress(response.getGR091001().getGeDmSignOnProfile().getClientNetworkAddress().getValue());
        gr091001Response.setSignOnId(response.getGR091001().getGeDmSignOnProfile().getSignOnId().getValue());

        return gr091001Response;
    }


}
