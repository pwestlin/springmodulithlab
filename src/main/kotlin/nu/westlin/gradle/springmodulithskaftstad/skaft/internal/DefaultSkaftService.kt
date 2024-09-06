package nu.westlin.gradle.springmodulithskaftstad.skaft.internal

import nu.westlin.gradle.springmodulithskaftstad.domain.Foo
import nu.westlin.gradle.springmodulithskaftstad.skaft.SkaftService
import org.springframework.stereotype.Service

@Service
class DefaultSkaftService: SkaftService {
    override fun getSkaftThings(): List<String> {
        val foo = Foo("bar")
        return listOf("Skaft", "rules")
    }
}