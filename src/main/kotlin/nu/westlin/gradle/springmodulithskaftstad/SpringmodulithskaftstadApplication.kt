package nu.westlin.gradle.springmodulithskaftstad

import nu.westlin.gradle.springmodulithskaftstad.stad.StadService
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringmodulithskaftstadApplication

fun main(args: Array<String>) {
    val ctx = runApplication<SpringmodulithskaftstadApplication>(*args)

    ctx.getBean<StadService>().stadThings()

}
