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

    @Bean
    public NewTopic categoryTopic() {
        return new NewTopic("category", 1, (short) 1);
    }

    @Bean
    public NewTopic preferenceTopic() {
        return new NewTopic("preference", 1, (short) 1);
    }
}