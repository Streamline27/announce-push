package lv.announce.push

import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Component
class Consumer {
    private val log = LoggerFactory.getLogger(Consumer::class.java)

    @RabbitListener(queues = ["\${push.rabbit.queue.notifications}"])
    fun getNotification(message: String) {
        log.info("Push: received AMQP message:[$message]")
    }
}