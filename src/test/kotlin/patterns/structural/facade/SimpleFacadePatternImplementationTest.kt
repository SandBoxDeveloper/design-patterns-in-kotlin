package patterns.structural.facade

import org.junit.Before
import org.junit.Test
import patterns.structural.facade.SimpleFacadePatternImplementation

class SimpleFacadePatternImplementationTest {

    lateinit var subject: SimpleFacadePatternImplementation

    @Before
    fun setUp() {
        subject = SimpleFacadePatternImplementation()
    }

    @Test
    fun `needs to be implemented`() {
    }
}