fun main(){

 val person = Person("Xursand",21)
 val person2 = Person("Xursand",21)
 val person3 = Person()
    println(person3.toString())



}

//data class Person(val name:String,val age:Int )
data class Person(val name:String = "Unknown",val age:Int =0 )