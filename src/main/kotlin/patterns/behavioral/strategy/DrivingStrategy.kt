package patterns.behavioral.strategy

class DrivingStrategy : ModeOfTransportStrategy {

    companion object {
        const val PACE = 30
    }

    override fun calculateDuration(distance: Double): Double {
        return distance / PACE
    }
}