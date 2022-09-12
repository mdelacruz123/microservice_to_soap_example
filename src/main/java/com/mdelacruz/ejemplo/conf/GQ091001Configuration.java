package com.mdelacruz.ejemplo.conf;

import com.mdelacruz.ejemplo.client.GQ091001Client;
import com.mdelacruz.ejemplo.wsdl.ObjectFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GQ091001Configuration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.mdelacruz.ejemplo.wsdl");
        return marshaller;
    }

    @Bean
    public GQ091001Client countryClient(Jaxb2Marshaller marshaller) {
        GQ091001Client client = new GQ091001Client();
        client.setDefaultUri("http://localhost:8082/mockGQ091001HTTPSoapBinding");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
