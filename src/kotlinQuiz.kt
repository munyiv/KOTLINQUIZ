import java.util.*

fun main() {
    square(-10)
    var newtruck=Trunk("uiwhs8",200,145)
    newtruck.load(18)
    newtruck.unload(15)

    var newTrailer=Trailer("tysh7",1000,300,10)
    newTrailer.load(19)



}
data class Book(var Title:String ,var Author:String, var pages:Int){
fun books(){


    var kitabu= listOf("Born A crime","Forgive me Maryam","Kigogo")
//    var sortedkitabu=kitabu.sortedByDescending {  }




}
}
fun square(num:Int){
   var num=1
    do{
        println(num*num)
       num++
    }while (num>3000)


}
open class Trunk(var registration:String, var totalweight:Int, var capacity:Int){
    fun load(weight:Int){
        var plus=weight+totalweight
        println(plus)
    }
    fun unload(weight: Int){
        var newamount=totalweight-weight
        println(newamount)
    }
   fun weightCheck(weight: Int):Int{
       var overloaded= totalweight+weight
       var underloaded=totalweight-weight
       return overloaded
   }
}
class Trailer(var registration:String, var totalweight: Int, var capacity: Int ,var wheels:Int){
    fun load(weight: Int){
        var add=weight+totalweight
        println(add)
    }
}


