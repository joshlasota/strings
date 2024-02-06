fun main(args: Array<String>) {
    val questions = listOf(
        "What is the name of Nintendo's iconic plumber? (First name only)",
        "Which Nintendo character is known for wearing a green hat and wielding a sword?",
        "What is the name of the princess in the Legend of Zelda series? (First name only)",
        "Which Nintendo game features catching pocket monsters?",
        "In which Nintendo game series would you find the character Kirby?"
    )
    val answers = listOf(
        "mario",
        "link",
        "zelda",
        "pokemon",
        "kirby"
    )

    var correctAnswers = 0

    for (i in questions.indices) {
        println("Question ${i + 1}: ${questions[i]}")
        val userAnswer = readLine()?.trim()?.toLowerCase()
        if (userAnswer == answers[i].toLowerCase()) {
            println("Correct!")
            correctAnswers++
        } else {
            println("Incorrect.")
        }
        println()
    }

    println("Quiz complete! You got $correctAnswers out of ${questions.size} questions correct.")
}