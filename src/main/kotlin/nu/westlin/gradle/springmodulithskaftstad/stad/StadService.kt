package nu.westlin.gradle.springmodulithskaftstad.stad

import nu.westlin.gradle.springmodulithskaftstad.skaft.SkaftService
import org.springframework.stereotype.Service

@Service
class StadService(private val skaftService: SkaftService) {
    fun stadThings(): List<String> {
        return skaftService.getSkaftThings()
    }
}