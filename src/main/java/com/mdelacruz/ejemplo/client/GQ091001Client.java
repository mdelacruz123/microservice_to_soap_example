package com.mdelacruz.ejemplo.client;

import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.util.Util;
import com.mdelacruz.ejemplo.wsdl.gq091001.RequestMessage;
import com.mdelacruz.ejemplo.wsdl.gq091001.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import reactor.core.publisher.Mono;

public class GQ091001Client extends WebServiceGatewaySupport {

    private final Util util;

    private static final Logger logger = LoggerFactory.getLogger(GQ091001Client.class);

    public GQ091001Client(Util util) {
        this.util = util;
    }

    public Mono<ResponseMessage> getGR091001Response(GQ091001Request request){

        try{
            RequestMessage requestMessage = util.createGQ091001SOAPRequest(request);
            ResponseMessage response = (ResponseMessage)getWebServiceTemplate()
                    .marshalSendAndReceive("http://localhost:8082/mockGQ091001HTTPSoapBinding",
                            requestMessage, new SoapActionCallback(""));

            return Mono.just(response);
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
