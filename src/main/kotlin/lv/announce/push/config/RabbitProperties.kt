package lv.announce.push.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
data class RabbitProperties(
        @Value("\${push.rabbit.queue.notifications}") val workerNotificationsQueueName: String
)