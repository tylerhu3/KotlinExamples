class Animal{
    var _name = ""
    var _type = ""
    var bloodType:String? = null

    // init is a special function called during construction
    // it can be called made multiple times, and it's called
    // from top to bottom
    init{
        println("iniit 1 executed")
    }
    constructor(name:String, type: String)
    {
        println("constructor 1 executed")
        _name = name
        _type = type
    }

    init{
        println("iniit 2  executed")
    }

    fun print(){
        println("printFunction invoked")
    }
}