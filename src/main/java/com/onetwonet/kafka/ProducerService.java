package com.onetwonet.kafka;

import com.onetwonet.dto.Bets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, Bets> kafkaTemplate;


    public void produce(Bets message) {
        kafkaTemplate.send("bet_detail",
                message);
    }
}
