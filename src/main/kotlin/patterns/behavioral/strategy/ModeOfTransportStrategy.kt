package patterns.behavioral.strategy

interface ModeOfTransportStrategy {

    fun calculateDuration(distance: Double): Double
}