package aggm.personal.newsapp.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfiguration {
//
//    @Value("${spring.kafka.bootstrap-servers}")
//    private String bootstrapServer;
//
//    @Bean
//    public KafkaAdmin kafkaAdmin() {
//        Map<String, Object> config = new HashMap<>();
//
//        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
//
//        return new KafkaAdmin(config);
//    }

    @Bean
    public NewTopic logTopic() {
        return new NewTopic("logs", 1, (short) 1);
    }
}