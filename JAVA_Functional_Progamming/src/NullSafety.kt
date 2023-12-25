fun main(args: Array<String>) {
    val name = null
//    val user? = null  // gives error
    val userName: String? = null
    var list: List<Any>  = listOf("1",2,"3")
//    list[0] = 1 // gives error as we can not access listOf with indices
    val indexList: List<Any> = mutableListOf("1",2,"3")
    indexList[1]
    print(list)
}