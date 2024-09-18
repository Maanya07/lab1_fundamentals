// Jagannathan, Maanya Problem 2 

fun bingoWord(word: String): String {
    // Code to get the uppercase version of the first letter 
    val firstLetter = word.first().uppercase()
    //code to get the length of the word
    val lengthOfWord = word.length
    // Return the bingo word in the format "FirstLetter Length"
    return "$firstLetter $lengthOfWord"
}

fun main() {
    // Test the bingoWord function with different inputs
    println("Bingo word for 'bingo' is: ${bingoWord("bingo")}")
    println("Bingo word for 'Win' is: ${bingoWord("Win")}")
    println("Bingo word for 'alex' is: ${bingoWord("alex")}")
    println("Bingo word for 'kotlin' is: ${bingoWord("kotlin")}")
}

main ();
