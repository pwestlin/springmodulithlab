package nu.westlin.gradle.springmodulithskaftstad.skrutt

import nu.westlin.gradle.springmodulithskaftstad.stad.StadService
import org.springframework.stereotype.Service

@Service
class SkruttService(
    private val stadService: StadService
) {
    fun skruttThings(): List<String> {
        TODO("not implemented")
    }
}