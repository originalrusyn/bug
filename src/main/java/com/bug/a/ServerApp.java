package com.bug.a;



import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;

/**
 * @author One on 30.08.17.
 */
@SpringBootApplication
public class ServerApp extends SpringBootServletInitializer {

    private static String C;

    static {
        //HACK Avoids duplicate metrics registration in case of Spring Boot dev-tools restarts
        C ="gg";
    }

    @Bean CloseableHttpClient httpClient() throws Exception {
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
            .loadTrustMaterial(null, acceptingTrustStrategy)
            .build();

        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

        return HttpClients.custom()
            .setSSLSocketFactory(csf)
            .build();
    }

    @Bean RestTemplate elementsRestTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder
            .build();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServerApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }
}
