package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition=0
    var wrongPosition=0
    val n=secret.length
    var list= mutableListOf<Char>()
    var i=0
    while (i<n){
        if(guess[i] in secret)
        {if(secret.indexOf(guess[i])==i)
        {
            list.add(guess[i])
            rightPosition++
        }
            else
                if (!list.contains(guess[i]))
                wrongPosition++
        }
       i++
    }
    return Evaluation(rightPosition,wrongPosition)
}
