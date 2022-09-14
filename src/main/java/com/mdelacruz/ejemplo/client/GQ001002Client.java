package com.mdelacruz.ejemplo.client;

import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.util.Util;
import com.mdelacruz.ejemplo.wsdl.gq001002.RequestMessage;
import com.mdelacruz.ejemplo.wsdl.gq001002.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class GQ001002Client extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(GQ001002Client.class);

    public ResponseMessage getGR001002Response(GQ001002Request request){

        try{
            RequestMessage requestMessage = Util.createGQ001002SOAPRequest(request);
            ResponseMessage response = (ResponseMessage)getWebServiceTemplate()
                    .marshalSendAndReceive("http://localhost:8083/mockGQ001002HTTPSoapBinding",
                            requestMessage, new SoapActionCallback(""));

            return response;
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
