data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}

class Quiz{
    val question1 = Question<String>(
        questionText = "Речка спятила с ума - По домам пошла сама. ___",
        answer = "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        questionText = "Небо зеленое. Прада/ложь",
        answer = false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        questionText = "Сколько дней меж полнолуниями?",
        answer = 28,
        Difficulty.HARD
    )

    companion object StudentProgress{
        var total: Int=10
        var answered: Int=3
    }
}

val Quiz.StudentProgress.progressText: String get() = "${answered} of ${total} answered"
fun Quiz.StudentProgress.printProgressBar(){
    repeat(times = Quiz.answered){ println("▓") }
    repeat(times = Quiz.total - Quiz.answered){ println("▓") }
    println()
    println(Quiz.progressText)
}

fun main(){
//    println(question1.answer)
//    println(question2.answer)
//    println(question3.answer)
//    println(question1.toString())
//    println("${Quiz.answered} of ${Quiz.total} answered")
//    println(Quiz.progressText)
    Quiz.printProgressBar()
}