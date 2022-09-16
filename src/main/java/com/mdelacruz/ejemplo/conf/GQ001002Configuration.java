package com.mdelacruz.ejemplo.conf;

import com.mdelacruz.ejemplo.client.GQ001002Client;
import com.mdelacruz.ejemplo.util.Util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GQ001002Configuration {

    private final Util util;

    public GQ001002Configuration(Util util) {
        this.util = util;
    }

    @Bean
    public Jaxb2Marshaller gq001002Marshaller() {
        Jaxb2Marshaller gq001002Marshaller = new Jaxb2Marshaller();
        gq001002Marshaller.setContextPath("com.mdelacruz.ejemplo.wsdl.gq001002");
        return gq001002Marshaller;
    }

    @Bean
    public GQ001002Client countryClient(Jaxb2Marshaller gq001002Marshaller) {
        GQ001002Client client = new GQ001002Client(util);
        client.setDefaultUri("http://localhost:8083/mockGQ001002HTTPSoapBinding");
        client.setMarshaller(gq001002Marshaller);
        client.setUnmarshaller(gq001002Marshaller);
        return client;
    }
}
