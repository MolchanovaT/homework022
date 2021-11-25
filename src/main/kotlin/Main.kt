fun main() {
    val likes = 10021

    val likesString = likes.toString()
    val likesStrLast = likesString.substring(likesString.length - 1, likesString.length)
    val likesStrTwoLAst = likesString.substring(likesString.length - 2, likesString.length)

    val result =
        if (likesStrLast == "1" && likesStrTwoLAst != "11") "Нравится $likes человеку" else "Нравится $likes людям"
    println(result)
}