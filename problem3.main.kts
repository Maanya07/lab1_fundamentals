// blah
fun getGreeter(greeting: String): (String) -> String {
    return { name: String -> "$greeting, $name!" }
}

fun main() {
    // Create different greeting functions
    val goodbye = getGreeter("Auf Wiedersehen")
    val hello = getGreeter("Hello")
    val welcome = getGreeter("Welcome")

    // Test the greeting functions with different names
    println(goodbye("Alex"))   // Output: 'Auf Wiedersehen, Alex!'
    println(hello("Sam"))      // Output: 'Hello, Sam!'
    println(welcome("Chris"))  // Output: 'Welcome, Chris!'
}

main ()