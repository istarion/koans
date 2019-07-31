import java.util.HashMap

fun buildMap(build: MutableMap<Int,String>.() -> Unit): MutableMap<Int,String>{
    val hashMap = mutableMapOf<Int,String>()
    hashMap.build()
    return hashMap
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
