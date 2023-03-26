fun main(args: Array<String>) {
    var student1=Students()
    student1.gender = "Male and Females"
    student1.course ="Hospitality and Engineering"
    println("The population is made of ${student1.gender} and the courses taken are ${student1.course}")
    student1.curriculum()
    var boys1= Students.Boys()
    boys1.gender ="Male"
    boys1.course ="Engineering"
    boys1.curriculum()
    boys1.football()
    println("Population of boys are 30 ${boys1.gender} all taking ${boys1.course} course as well as palying football")

    var ladies1=Students.Ladies ()
    ladies1.gender ="Females"
    ladies1.course ="Hospitality"
    println("The number of girls are 27 and are all ${ladies1.gender} doing ${ladies1.course} and half the number participating in Hockey.")



}
open class Students{
    var gender : String= ""
    var course :String = ""
    fun curriculum () {
        println("We are using the British system")
    }
    class Boys:Students () {
        fun football() {
            println("The number playing football is 20 out of 30 boys")
        }
    }
    class Ladies:Students () {
        fun hockey() {
            println("The ladies enjoys Hockey")
        }
    }

    }

