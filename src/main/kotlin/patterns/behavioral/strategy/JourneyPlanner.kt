package patterns.behavioral.strategy

class JourneyPlanner(private val journeyPlannerStrategy: ModeOfTransportStrategy) {

    fun getDurationOfJourney(distance: Double): Double {
        return journeyPlannerStrategy.calculateDuration(distance = distance)
    }
}