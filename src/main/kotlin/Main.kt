fun main() {
    // Instance of Car
    val matatu = Car("Nissan", "Toyota", "Yellow", 14)
    matatu.carry(24) // carrying overcapacity.
    matatu.carry(14) // carrying capacity.
    matatu.identity()
    println(matatu.calculateParkingFees(50))

    // Instance of bus
    val busname = Bus("Scania", "Isuzu", "black", 56)
    println(busname.maxTripFare(150.99))
    println(busname.calculateParkingFees(2))

}

/*

Question 1

Create a class Car with the following attributes: make, model, color, capacity.
It has these functions:
- carry(people: Int) : Prints out “Carrying $people passengers” if the
number of people is within its capacity else it prints out “Over capacity
by $x people” where x is the number of people exceeding its capacity

- identity() : Prints out the color, make and model in the following
format e.g: “I am a white subaru legacy”
- calculateParkingFees(hours: Int) : Calculates and returns the
parking fees by multiplying the hours by 20

 */

 open class Car(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        var x = people - capacity
        if (people.equals(capacity)){
            println("Carrying $people passengers.")
        }else{
            println("Over capacity by $x people." )
        }
    }
    fun identity(){
        println("Iam a white subaru legacy.")
    }
    open fun calculateParkingFees(hours: Int): Int{
        return hours * 20
    }
}


/*

Question 2

Create a class Bus with the same attributes and functions as the Car class.
In addition, it has another method called maxTripFare(fare: Double) that
calculates and returns the maximum amount of fare that can be collected per
trip. (2 points)
The bus’ calculateParkingFees method returns the product of hours and
the capacity of the bus

 */

class Bus(make: String, model: String, color: String, capacity: Int): Car(make, model, color,capacity){
    fun maxTripFare(fare: Double): Double{
        return capacity * fare
    }
    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}
