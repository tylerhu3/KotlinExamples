interface Master {
    var students: Int

    fun print()

}

class Teacher1: Master{
    override var students: Int = 0


    override fun print() {
        println("this teacher has $students students")
    }
}

