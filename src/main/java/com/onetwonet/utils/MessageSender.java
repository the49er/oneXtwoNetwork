package com.onetwonet.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@Slf4j
@Setter
@Getter
@RequiredArgsConstructor
@ComponentScan("com.onetwonet.utils.MessageSender")
public class MessageSender implements Runnable {

    @Value("${kafka.msg.generate.address}")
    private final String generateKafkaMsgUrl;
    private final String jsonInString;
    private final HttpClient httpClient = HttpClient.newHttpClient();
    {


    }

    @Override
    public void run() {
        HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(generateKafkaMsgUrl))
                        .POST(HttpRequest.BodyPublishers.ofString(jsonInString))
                        .header("Content-Type", "application/json")
                        .build();
        log.info("Send msg: new bets inserted");

        try {
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
