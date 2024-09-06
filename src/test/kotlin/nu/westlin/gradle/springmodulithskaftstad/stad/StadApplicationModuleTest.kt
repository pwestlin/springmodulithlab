package nu.westlin.gradle.springmodulithskaftstad.stad

import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import nu.westlin.gradle.springmodulithskaftstad.skaft.SkaftService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.modulith.test.ApplicationModuleTest

@ApplicationModuleTest
class StadApplicationModuleTest(@Autowired private val stadService: StadService) {

    private val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    @MockkBean
    private lateinit var skaftService: SkaftService

    @Test
    fun `do shit`() {
        logger.debug("Tjena")

        val strings = listOf("Foo", "Bar", "Baz")

        every { skaftService.getSkaftThings() } returns strings

        assertThat(stadService.stadThings()).containsExactlyInAnyOrderElementsOf(strings)
    }
}