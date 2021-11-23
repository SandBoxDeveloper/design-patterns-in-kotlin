package patterns.behavioral.strategy

class WalkingStrategy : ModeOfTransportStrategy {

    companion object {
        const val PACE = 3
    }

    override fun calculateDuration(distance: Double): Double {
        return distance / PACE
    }
}