package vital

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VitalApplication

fun main(args: Array<String>) {
	runApplication<VitalApplication>(*args)
}
