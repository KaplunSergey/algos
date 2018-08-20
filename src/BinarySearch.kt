
class BinarySearch {

    fun search(list: List<Int>, find: Int) : Int {
        var lowValue = 0
        var highValue = list.size - 1

        while (lowValue <= highValue) {
            val midValue = (lowValue + highValue) / 2
            val guess = list[midValue]

            when {
                guess == find -> return midValue
                guess > find -> highValue = midValue - 1
                else -> lowValue = midValue + 1
            }
        }

        return -1
    }
}