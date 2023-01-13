package com.onetwonet.contoller;

import com.onetwonet.api.BetApi;
import com.onetwonet.dto.BetResponse;
import com.onetwonet.dto.BetsCreateRequest;
import com.onetwonet.jpa.model.Bet;
import com.onetwonet.json.JsonParser;
import com.onetwonet.service.BetService;
import com.onetwonet.utils.MessageSender;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class BetController implements BetApi {
    @Value("${kafka.msg.generate.address}")
    private String generateKafkaMsgUrl;
    private final JsonParser jsonParser;
    private final BetService betService;

    @Override
    public ResponseEntity<List<BetResponse>> createBets(BetsCreateRequest betsCreateRequest) {
        List<BetResponse> result = betService.createBets(betsCreateRequest);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        List<Bet> newBets = betService.betResponseToBet(betsCreateRequest);

        String objectToStr = jsonParser.objectToString(newBets);
        MessageSender messageSender = new MessageSender(generateKafkaMsgUrl, objectToStr);
        Thread thread = new Thread(messageSender);
        thread.start();

        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<List<BetResponse>> findBets() {
        List<BetResponse> result = betService.findAll();
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }


}
