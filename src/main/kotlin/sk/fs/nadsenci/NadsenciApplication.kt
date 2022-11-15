package sk.fs.nadsenci

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NadsenciApplication

fun main(args: Array<String>) {
    runApplication<NadsenciApplication>(*args)
}
