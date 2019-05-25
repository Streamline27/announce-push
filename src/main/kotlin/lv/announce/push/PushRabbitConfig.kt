package lv.announce.push

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.connection.ConnectionFactory
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springframework.amqp.rabbit.core.RabbitAdmin


@Configuration
class PushRabbitConfig(val properties: PushProperties) {

    @Bean
    fun rabbitAdmin(connectionFactory: ConnectionFactory) =
            RabbitAdmin(connectionFactory)

    @Bean
    fun queue(): Queue = Queue(properties.workerNotificationsQueueName)
}