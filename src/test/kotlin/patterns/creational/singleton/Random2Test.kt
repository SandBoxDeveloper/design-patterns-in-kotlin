package patterns.creational.singleton

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

internal class Random2Test {

    lateinit var subject: Random2

    @Before
    fun setUp() {
        subject = Random2()
    }

    @Test
    fun `given username, when get username is called, then username is returned`() {
        //given
        val expected = "Andre"
        Database2().setUserName(expected)

        //when
        val result = subject.getUsername()

        //then
        assertThat(result).isEqualTo(expected)
    }
}