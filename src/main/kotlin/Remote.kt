interface Remote {
    fun up()
    fun down()
    fun doubleUp() {
        up()
        up()
    }
    
}

class TV {
    var volume = 100;
}

class TVRemote(val tv : TV): Remote {
    override fun up() {
       tv.volume ++
    }

    override fun down() {
        tv.volume --
    }

}

fun main() {
    var tv = TV()
    var tvRemote = TVRemote(tv)
    tvRemote.up()
    println(tv.volume)
    tvRemote.doubleUp()
    println(tv.volume)
}