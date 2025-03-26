package JAVA_practice

class SmartDevice (){
    fun turnOn (){
        println("smart device is turned on ")
    }

    fun turnOff (){
        println("smart device is turned off ")
    }
}

fun main() {
    val TvDevice = SmartDevice()
    TvDevice.turnOff()
    TvDevice.turnOn()
}