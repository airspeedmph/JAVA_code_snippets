package Test

open class SmartDevice (val name : String , val  category : String ){



    var status = " online "

    fun turnOn (){
        println("smart device is turned on ")
    }

    fun turnOff (){
        println("smart device is turned off ")
    }
}



class SmartTvDevice ( deviceName : String , deviceCategory : String ) : SmartDevice (name = deviceName , category = deviceCategory)
{
    var speakerVolume = 1
    set(value )
    {
        if ( value in 0..100)
        {
            field = value
        }
    }

    var channelNumber = 5
        set(value) {
            if (channelNumber in 0..200){
                field = value
            }
        }


    fun increaseSpeakerVolume (){
        speakerVolume++
        println(" speaker volume set to $speakerVolume")
    }

    fun nextChannel (){
        channelNumber++
        println("channel changed to $channelNumber")
    }


}

class SmartLightDevice (deviceName : String , deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory)
{
    var brightnessLevel = 2
        set(value) {
            if (brightnessLevel in 0..100){
                field = value
            }
        }

    fun increseBrightness (){
        brightnessLevel++
        println(" brightness level increased to $brightnessLevel")
    }


}

fun main() {
    var TvDevice = SmartDevice(category = " entertainment ", name = "android tv ")
    println("device name is ${TvDevice.name}")
    TvDevice.turnOff()
    TvDevice.turnOn()
}