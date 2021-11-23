package patterns.creational.builder

class BromptonConcreteBuilderPattern : BikeBuilder {

    private var make: String? = null
    private var color: String? = null
    private var isElectric: Boolean = false
    private var height: Int? = null
    private var isFoldable: Boolean = false
    private var model: String? = null

    override fun buildMake(make: String) {
        this.make = make
    }

    override fun buildColor(color: String) {
        this.color = color
    }

    override fun buildIsElectric(isElectric: Boolean) {
        this.isElectric = isElectric
    }

    override fun buildHeight(height: Int) {
        this.height = height
    }

    override fun buildIsFoldable(isFoldable: Boolean) {
        this.isFoldable = isFoldable
    }

    override fun buildModel(model: String) {
        this.model = model
    }

    override fun getResult(): Bike {
        return Bike(
            make = this.make ?: throw IllegalArgumentException("missing required make"),
            color = this.color ?: throw IllegalArgumentException("missing required color"),
            isElectric = this.isElectric,
            height = this.height ?: throw IllegalArgumentException("missing required height"),
            isFoldable = this.isFoldable,
            model = this.model ?: throw IllegalArgumentException("missing required model")
        )
    }

//    return Bike(
//    make = "Brompton",
//    color = "Black",
//    isElectric = true,
//    height = 147,
//    isFoldable = false,
//    model = "H2L"
//    )

}

class Director {

    fun constructorBromptonBike(bikeBuilder: BikeBuilder) {
        bikeBuilder.buildColor("Red")
    }

    fun constructorRhino(bikeBuilder: BikeBuilder) {
        bikeBuilder.buildColor("Orange")
    }
}

class Demo {

    var director: Director = Director()
    val builder : BromptonConcreteBuilderPattern = BromptonConcreteBuilderPattern()

    fun make(){
        director.constructorRhino(builder)
    }

    var bike: Bike = builder.getResult()
}

class Bike constructor(
    make: String?,
    color: String?,
    isElectric: Boolean,
    height: Int?,
    isFoldable: Boolean,
    model: String?,
) {
    var make: String?
    var color: String?
    var isElectric: Boolean = false
    var height: Int? = null
    var isFoldable: Boolean = false
    var model: String?

    init {
        this.make = make
        this.color = color
        this.isElectric = isElectric
        this.height = height
        this.isFoldable = isFoldable
        this.model = model
    }
}


interface BikeBuilder {
    fun buildMake(make: String)
    fun buildColor(color: String)
    fun buildIsElectric(isElectric: Boolean)
    fun buildHeight(height: Int)
    fun buildIsFoldable(isFoldable: Boolean)
    fun buildModel(model: String)

    fun getResult(): Bike
}
