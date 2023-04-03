import javax.print.attribute.standard.PrinterMakeAndModel

fun main() {
println(manyStrings(listOf("Omara","Mummy","Angel","Irene","Yuventine","Micheal","Anabo","Esther","Ijala","Emma")))

    println(heights(listOf(1.6,1.8,1.9)))
    println(heights2(listOf(1.6,1.8,1.9)))



}






//    1. Given a list of 10 strings, write a function that returns a list of the strings
//    at even indices like index 2,4,6 so on (2 points)
fun manyStrings(names:List<String>):List<String>{
    var evenList= mutableListOf<String>()
for(i in names){
    if(names.indexOf(i) % 2==0)
        evenList.add(i)
}
  return evenList

}






//
//    2. Given a list of people’s heights in metres. Write a function that returns
//    the average height and the total height (2 points)
fun heights(measure:List<Double>):Double {
    var averageList = measure.average()
//    var total = measure.sum()
//    var all=averageList + total
 return averageList

}
fun heights2(measured:List<Double>):Double{
    var total=measured.sum()
    return total
}








//    3. Given a list of Person objects, each with the attributes, name, age,
//    height and weight. Sort the list in order of descending age (2 points)

data class Objects(var name: String, var age:Int, var height:Double, var weights:Double){
fun createList(){
    var person1= Objects("Emma",1,70.9,8.1 )
    var person2= Objects("Priscila",25,1.8,70.5)
    var personObjects= listOf(person1,person2)
    var sortedpersonObjects= personObjects.sortedByDescending { personObjects -> personObjects.age}
    println(sortedpersonObjects)
     }
}









//
//    4. Given a list similar to the one above, write a function in which you will
//    create 2 more people objects and add them to the list at one go.
//    (1 points)
data class many(var name:String,var age: Int,var height: Double,var weights: Double){
    fun existed(){
      var person3=Objects("Eyolu",9,200.0,38.5)
var person4=Objects("Ebiu",63,500.4,78.0)
        var include= listOf(person4,person3)
        println(include)
//        var all=include+sortedpersonObjects


    }
}






//
//    5. Write a function that takes in a list of Car objects each with a
//            registration and mileage attribute and returns the average mileage of
//            all the vehicles in the list.
data class Cars(var name: String,var make: String,var Model:String,var registration:Any,var color:String ){
 fun listed(){
     var car1= Cars("Hilux",)
}
//fun cars(named:listOf<Int>):Int{

}