class Animal(var name:String){
    class Zoo(var animals:List<Animal>){
        operator fun iterator():Iterator<Animal>{
            return animals.iterator()
        }
    }
}
fun main(){
    var zoo = Animal.Zoo(listOf(Animal("Lion"), Animal("Dog")))
    for(animal in zoo){
        println("Animal : ${animal.name}")
    }
    for(n in 5..10 step 2){
        println(n)
    }

    var authors = setOf("Shakespeare","Hemingway","Twain")
    var writers = setOf("Twain","Shakespeare","Hemingway")
    println(authors == writers)
    println(authors === writers)
}
