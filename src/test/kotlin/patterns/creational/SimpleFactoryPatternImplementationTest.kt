package patterns.creational

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import patterns.creational.factory.SimpleFactoryPatternImplementation

class SimpleFactoryPatternImplementationTest {

    lateinit var subject: SimpleFactoryPatternImplementation

    @Before
    fun setUp() {
        subject = SimpleFactoryPatternImplementation()
    }

    @Test
    fun `given list of team members then display a greeting from all members`() {
        val data = listOf(
            mapOf<String, String>("type" to "Developer", "color" to "#ff0000", "icon" to "🧑‍💻", "name" to "Andre"),
            mapOf<String, String>("type" to "Developer", "color" to "#ff0000", "icon" to "🧑‍💻", "name" to "Roberta"),
            mapOf<String, String>("type" to "Tester", "color" to "#00ff00", "icon" to "🧪", "name" to "Will"),
            mapOf<String, String>("type" to "Designer", "color" to "#0000ff", "icon" to "🎨", "name" to "Zena"),
            mapOf<String, String>("type" to "ADL", "color" to "#ff00ff", "icon" to "🎨", "name" to "Odion")
        )
        val result = subject.consumeData(data)
        val expected = "Hello my name is Andre, I am a Developer and I use Kotlin, Hello my name is Roberta, I am a Developer and I use Kotlin, Hello my name is Will, I am a Tester and I use Cucumber, Hello my name is Zena, I am a Designer and I use Figma, Hello my name is Odion, I am a ADL and I use Jira"
        assertThat(result).isEqualTo(expected)
    }
}