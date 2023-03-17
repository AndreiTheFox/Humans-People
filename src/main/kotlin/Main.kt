fun main() {
    val likes: Int = 511
    val prefix: String = if (likes == 1) {
        "человеку"
    } else if (((likes + 89)) %100 == 0) {
        "людям"
    }
    else if ((likes - 1) % 10 == 0) {
        "человеку"
    } else {
        "людям"
    }

    if (likes > 0) print("понравилось $likes $prefix")
}