package patterns.behavioral.strategy

class CyclingStrategy : ModeOfTransportStrategy {

    companion object {
        const val PACE = 10
    }

    override fun calculateDuration(distance: Double): Double {
        return distance / PACE
    }
}