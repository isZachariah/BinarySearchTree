fun main(args: Array<String>) {

    val tree = Node(5)
    val keys = arrayOf(1, 8, 6, 3, 9, 15, 22, 34, 0, 97, 45, 17, 12, 21, 7, 80)
    for (key in keys) {
        tree.insert(key)
    }
    val node = tree.find(22)!!

    println(tree.visit().joinToString { it.toString() })
}