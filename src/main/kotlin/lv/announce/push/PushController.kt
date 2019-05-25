package lv.announce.push

import lv.announce.push.config.PushProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PushController(val properties: PushProperties) {
    @GetMapping("/hello")
    fun hello() = "Hello from service: " + properties.applicationName
}