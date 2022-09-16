package com.mdelacruz.ejemplo.client;

import com.mdelacruz.ejemplo.dto.GQ001002Request;
import com.mdelacruz.ejemplo.util.Util;
import com.mdelacruz.ejemplo.wsdl.gq001002.RequestMessage;
import com.mdelacruz.ejemplo.wsdl.gq001002.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import reactor.core.publisher.Mono;

public class GQ001002Client extends WebServiceGatewaySupport {

    private final Util util;

    private static final Logger logger = LoggerFactory.getLogger(GQ001002Client.class);

    public GQ001002Client(Util util) {
        this.util = util;
    }

    public Mono<ResponseMessage> getGR001002Response(GQ001002Request request){

        try{
            RequestMessage requestMessage = util.createGQ001002SOAPRequest(request);
            ResponseMessage response = (ResponseMessage)getWebServiceTemplate()
                    .marshalSendAndReceive("http://localhost:8083/mockGQ001002HTTPSoapBinding",
                            requestMessage, new SoapActionCallback(""));

            return Mono.just(response);
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
