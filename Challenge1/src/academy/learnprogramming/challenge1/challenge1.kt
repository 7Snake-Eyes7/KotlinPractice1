package academy.learnprogramming.challenge1

fun main(){
    val hello1 = "Hello"
    val hello2 = "Hello"
    println(hello1===hello2)
    //referential
    //since the above 2 string literals are exact same instance, the output ll be true.
    // JVM optimises string like 'if you are specific strings multiple times,
    // it ll consider as only 1 instance since string are immutable'


    //structural
    println(hello1==hello2)

    var x = 5
    if(x<6){
        x=1
        println(x)
    }
    println(x)

    println("""    1
                |  11
                |  111""".trimMargin("1"))


    val z = arrayOf(1,2,3,4,5)
    println(z.forEach {z -> z*1 })

    val c = Array(4) {i -> i*2}
    for (c in c){
        println(c)
    }

    val v = arrayOf(1,"2","c",3,5)
    for (i in v){
        println(i)
    }
    println(v is Array<Any>)

    val b = arrayListOf<Int>(1,2,3,4)

    val a:String? = "a"
    val s = a?: "lol"
    println(s)

    val e = 1..6
    println(e)



}

