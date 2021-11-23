package patterns.behavioral

import org.junit.Before
import org.junit.Test
import patterns.behavioral.strategy.CyclingStrategy
import patterns.behavioral.strategy.DrivingStrategy
import patterns.behavioral.strategy.JourneyPlanner
import patterns.behavioral.strategy.WalkingStrategy
import kotlin.test.assertEquals

class SimpleStrategyPatternImplementationTest {

//    lateinit var subject: SimpleStrategyPatternImplementation

    lateinit var subject: JourneyPlanner

    @Before
    fun setUp() {
        //subject = JourneyPlanner()
    }

    @Test
    fun `GIVEN Mode is Walking, And the total distance, Then result is 20hrs`() {
        //GIVEN
        val strategy = WalkingStrategy()
        val distance = 60.00
        val expected = 20.00

        // WHEN
        subject = JourneyPlanner(strategy)
        val result = subject.getDurationOfJourney(distance = distance)

        // THEN
        assertEquals(expected, result)
    }

    @Test
    fun `GIVEN Mode is Cycling, And the total distance is 60, Then result is 6hrs`() {
        //Arrange
        val strategy = CyclingStrategy()
        val distance = 60.00
        val expected = 6.00
        subject = JourneyPlanner(strategy)

        // ACT
        val result = subject.getDurationOfJourney(distance = distance)

        // ASSERT
        assertEquals(expected, result)
    }

    @Test
    fun `GIVEN Mode is Driving, And the total distance is 60, Then result is 2hrs`() {
        //Arrange
        val strategy = DrivingStrategy()
        val distance = 60.00
        val expected = 2.00
        subject = JourneyPlanner(strategy)

        // ACT
        val result = subject.getDurationOfJourney(distance = distance)

        // ASSERT
        assertEquals(expected, result)
    }
}