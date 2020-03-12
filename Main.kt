import java.lang.Exception
import java.util.*

var name2: String = "";
var greeting: String = "Hello"

//Nullable var requires a ? after the type, example:

fun sayHell(x: String, vararg items:String){
    items.forEach {
        item ->
        println("$x  $item")
    }
}

fun test(water:String, drops: Int){
    println("$drops drops of $water")
}

val green: String? = null

///Enum

enum class CourseType {
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}


object CourseFactory{
    fun create(type: CourseType): Course{
        val id = UUID.randomUUID().toString() // generates random ID num
        val name = when(type){
            CourseType.EASY -> type.name
            CourseType.MEDIUM -> type.getFormattedName()
            CourseType.HARD -> "Hard"

        }
        return Course(id, name)
    }
}


class Course(val id: String, val name: String){
    override fun toString(): String{
        return "id:$id name: $name"
    }
}


//MultiThreading

class Xhread():Thread(){
    var threadName: String? = null
    var runTimes:Int = 5
    constructor(name: String, times:Int):this(){
        threadName = name
        runTimes = times
    }

    override fun run() {
        super.run()

        var count = 0
        while (count < runTimes){
            count++
            println("${this.threadName} ran $count times ")
            try {
                Thread.sleep(500)
            }
            catch (ex:Exception){
                println(ex.message)
            }

        }
    }

}

fun printIndices(arr: Array<Int>){
    for(i in arr.indices){
        print(i)
    }
        print("\n")
    for(i in arr){
        print("$i  ")
    }
}


fun main(){

    var arr = Array(5) { i -> i * 2}

    printIndices(arr);



//    //MultiThread Lesson
//    var x = Xhread("x", 5)
//    x.start()
//    var y = Xhread("y", 10)
//    y.start()
//
//    x.join() //wait til x finishes before starting other threads
//    y.join() //wait til y finishes before starting other threads
//    println("Starting Last Thread")
//    var z = Xhread("z",5)
//    z.start()


    //Enum Class Lesson
//    val cr = CourseFactory.create(CourseType.HARD)
//    println(cr)
//    val cr2 = CourseFactory.create(CourseType.EASY)
//    println(cr2)
//    val cr3 = CourseFactory.create(CourseType.MEDIUM)
//    println(cr3)

    //Companion Class Lesson :: its almost like friend functions in C++
//    val entity = Entity.Factory.create()
//    println(Entity.id)

    //Interface Lesson
//    var T = Teacher1();
//    T.print()
//    T.students = 11
//    T.print()

    // Class lesson
//    var stevo = Animal("Herbert", "Dog")
//    println("His name is ${stevo._name} and its type is ${stevo._type}")
//    stevo.bloodType = "O+"
//    println("blood type ${stevo.bloodType}")
//    stevo.print()
//
//    var ex: String? = null
//    var ex1 = ex  ?: "Star"
//    print("$ex1")

    //function lesson
//    test(water = "mercury", drops = 15)
//
//    sayHell("c", *arrayOf("xcaca"))
//    println("Hello Kotlin")
//    val name: String = "Tyler" //Read only once, can't be updated
//    name2 = "Tyler2"
//    //mutable is mutate- able: can be modified later
//    println(name + name2 )
//
//    name2 = "newnew"
//    println(name2)
//
//
//    //Switch Example
//    var x = 99
//    when(x){
//        9 -> println("Nine")
//        8 -> println("eight")
//        else -> print("some other number")
//    }



}
