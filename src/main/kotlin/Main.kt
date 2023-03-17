fun main() {
    val likes: Int = 698701
    val prefix: String = if (likes == 1) {
        "человеку"
    } else if ((likes - 1) % 10 == 0) {
        "человеку"
    } else {
        "людям"
    }

    if (likes > 0) print("понравилось $likes $prefix")
}