package com.mdelacruz.ejemplo.conf;

import com.mdelacruz.ejemplo.client.GQ091001Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GQ091001Configuration {

    @Bean
    public Jaxb2Marshaller gq091001Marshaller() {
        Jaxb2Marshaller gq091001Marshaller = new Jaxb2Marshaller();
        gq091001Marshaller.setContextPath("com.mdelacruz.ejemplo.wsdl.gq091001");
        return gq091001Marshaller;
    }

    @Bean
    public GQ091001Client gq091001Client(Jaxb2Marshaller gq091001Marshaller) {
        GQ091001Client client = new GQ091001Client();
        client.setDefaultUri("http://localhost:8082/mockGQ091001HTTPSoapBinding");
        client.setMarshaller(gq091001Marshaller);
        client.setUnmarshaller(gq091001Marshaller);
        return client;
    }
}
