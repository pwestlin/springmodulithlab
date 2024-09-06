package nu.westlin.gradle.springmodulithskaftstad

import org.junit.jupiter.api.Test
import org.springframework.modulith.core.ApplicationModules
import org.springframework.modulith.docs.Documenter

class ApplicationModulesTest {

    private val modules = ApplicationModules.of(SpringmodulithskaftstadApplication::class.java)

    @Test
    fun `print modules`() {
        modules.forEach { println(it) }
    }


    @Test
    fun verifiesModularStructure() {
        modules.verify()
    }

    @Test
    fun createModuleDocumentation() {
        Documenter(modules).writeDocumentation()
    }

}