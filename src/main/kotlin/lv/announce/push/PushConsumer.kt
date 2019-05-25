package lv.announce.push

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class PushConsumer {
    private val log = LoggerFactory.getLogger(PushConsumer::class.java)

    @RabbitListener(queues = ["\${push.rabbit.queue.notifications}"])
    fun getNotification(message: String) {
        log.info("Push: received AMQP message:[$message]")
    }
}