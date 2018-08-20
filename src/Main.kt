fun main(args: Array<String>) {
    val binarySearch = BinarySearch()
    val search = Search()

    val list = arrayListOf<Int>()
    var temp = 0
    while (temp < 100000000) {
        list.add(++temp)
    }
    val element = temp-1

    println("List size: ${list.size}")

    val startBinarySearch = System.currentTimeMillis()
    val resultBS = binarySearch.search(list, element)
    println("Binary search time: ${System.currentTimeMillis() - startBinarySearch}, position: $resultBS")

    val startSearch = System.currentTimeMillis()
    val result = search.search(list, element)
    println("Search time: ${System.currentTimeMillis() - startSearch}, position: $result")
}
