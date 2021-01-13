/**
 * Created by Elliot Åberg Fält
 * Date: 2021-01-13
 * Time: 15:14
 * Project: Funktionell_Programmering_Inlamningsuppgift
 * Copyright: MIT
 */
class Question(val question: String, val a1: String, val a2 :String, val a3 :String, val a4 :String, val category :Category, val correct :Int) {
    fun getAllAnswers() :List<String> {
        return listOf(a1,a2,a3,a4)
    }
    fun getQuestionString() : String {
        return question
    }
}