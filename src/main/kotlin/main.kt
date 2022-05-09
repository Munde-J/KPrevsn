fun main(){
    println(isEven(7))
        println(isEven(12))

    var tunda = evenIndices("banana")
    println(tunda)

    var product = Product("bowl",12.5,150.5,"others")
    var product1 = Product("soap",20.5,50.0,"hygiene")
    var product2 = Product("spinach",10.0,350.0,"groceries")

    var stuff = mutableListOf(product,product1,product2)
    println(stuff)

    println( evenNames(arrayOf("Tessa", "Angela","Naima")))

}
fun isEven(numb:Int):Boolean{
    if (numb%2==0){
        return true
         }
    else{

    }
        return false
}
//    1. Create a function called isEven( ) that returns true when the number
//    passed to it is even or returns false when the number passed to it is odd
//    (2 points)
//
//    2. A product is represented by a data class with these attributes: name,
//    weight, price, category. Category can either be groceries, hygiene or
//    other. Write a function that takes in a product and uses a when
//    statement to assign each product to a list based on its category

data class Product(var name:String,var weight:Double,var price:Double,var category:String) {
    fun takeInProduct(pencil: Product) {
        var others = mutableListOf<Product>()
        var hygiene = mutableListOf<Product>()
        var groceries = mutableListOf<Product>()

        when (pencil.category) {
            "hygiene" -> hygiene.add(pencil)
            "groceries" -> groceries.add(pencil)

            else -> others.add(pencil)
        }
        println(hygiene)
        println(groceries)
        println(others)

    }
}



//    3. Write a function that given a string returns a string composed of only
//    the characters in even indices. For example given “banana” it will return
//    “bnn”          (2 points)
fun evenIndices(name:String):String{
    var melon = ""
    for (n in name){
        if (name.indexOf(n)%2==0)
            melon+=n
    }
    return melon
}
//
//    4.  Write a function that given an array of strings returns a list of strings
//            whose lengths are even. For example given [“Mary”, “adama”, “apple”] it
//    will return [“Mary”]        (2 points)
fun evenNames(name:Array<String>):List<String> {
    var w = mutableListOf<String>()
    for (a in name) {
        if (a.length % 2 == 0) {
            w.add(a)
        }
    }
    return w
}