package nu.westlin.gradle.springmodulithskaftstad

import com.tngtech.archunit.core.importer.ClassFileImporter
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service


class ArchunitTest {

    private val classes = ClassFileImporter().importPackagesOf(ArchunitTest::class.java)

    @Test
    fun `classes annotated with @Service should be named FooService`() {
        classes()
            .that().areAnnotatedWith(Service::class.java)
            .should().haveNameMatching("^.*Service\$")
            .check(classes)
    }

    @Test
    @Disabled("Aktivera när det finns klasser annoterade med @Reposiory")
    fun `classes annotated with @Repository should be named FooRepository`() {
        classes()
            .that().areAnnotatedWith(Repository::class.java)
            .should().haveNameMatching("^.*Repository$")
            .check(classes)
    }
}
