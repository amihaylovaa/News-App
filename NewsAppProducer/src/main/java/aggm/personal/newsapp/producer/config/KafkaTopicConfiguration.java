package aggm.personal.newsapp.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic logTopic() {
        return new NewTopic("logs", 1, (short) 1);
    }
}