package patterns.structural.adapter

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SimpleAdapterPatternImplementationTest {

    lateinit var subject: SimpleAdapterPatternImplementation

    @Before
    fun setUp() {
        subject = SimpleAdapterPatternImplementation()
    }

    @Test
    fun `given list of team members then display a greeting from member`() {
        val data = listOf(
            mapOf<String, String>("type" to "Developer", "color" to "#ff0000", "icon" to "🧑‍💻", "name" to "Andre Hitchman")
        )
        val result = subject.consumeData(data)
        val expected = "My first name is Andre and my last name is: Hitchman"
        assertThat(result).isEqualTo(expected)
    }
}