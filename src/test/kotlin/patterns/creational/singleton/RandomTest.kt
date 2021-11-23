package patterns.creational.singleton

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

internal class RandomTest {

    lateinit var subject: Random

    @Before
    fun setUp() {
        subject = Random()
    }

    @Test
    fun `given username, when get username is called, then username is returned`() {
        //given
        val expected = "Andre"
        Database.instance.setUserName(expected)

        //when
        val result = subject.getUsername()

        //then
        assertThat(result).isEqualTo(expected)

        //given
        Database.instance.setUserName("Billy")

        //when
        val result2 = subject.getUsername()

        //then
        assertThat(result2).isEqualTo("Billy")
    }
}