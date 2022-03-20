import java.util.*

fun main(args: Array<String>) {
    val map = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    println(map)
    println(map.containsKey("Oner"))
    println(map["Oner"])
    println(map.getOrDefault("Oner", "НЕТ"))

    for ((key, value) in map){
        println("Key is $key, value is $value")
    }

    val map2 = mapOf(1 to "one", 3 to "three", 9 to "nine")
    println(map2.mapValues { it.value.uppercase(Locale.getDefault()) })
    println(map2.mapKeys { it.value + "!"})

    val map3 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    map3["Four"] = 4
    println(map3)

    val currenciesMutableMap: MutableMap<String, String> =
        mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Рубль" to "Россия")
    println("Страны: ${currenciesMutableMap.values}")
    println("Валюты: ${currenciesMutableMap.keys}")
    currenciesMutableMap.remove("Доллар")
    println(currenciesMutableMap)

    val map4 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    map4 += "Five" to 5
    map4 -= "Two"
    println(map4)

    val map5 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
    val entry1 = Pair("Four", 4)
    val entry2 = Pair("Five", 5)
    val entryToAdd = mapOf(entry1, entry2)
    map5 += entryToAdd
    println(map5)
//    map5.putAll(entryToAdd)
    println(map5.toList().first().first)

    val inventory = mutableMapOf(
        "Vanilla" to 24,
        "Chocolate" to 14,
        "Strawberry" to 9,
    )

    val lotsLeft = inventory.filterValues { qty -> qty > 10 }
    println(lotsLeft)
    val lotsLeftByKey = inventory.filterKeys { key -> key.startsWith("V") }
    println(lotsLeftByKey)

    val asStrings = inventory.map { (flavor, qty) -> "$qty tubs of $flavor" }
    println(asStrings)

    println(inventory.toSortedMap())
    val result = inventory.toList().sortedBy { (_, value) -> value}.toMap()
    println(result)

    for (i in 1..10 step 2) {
        println(i)
    }

    val a = 2

    println(a ?: "пустой")
}