package com.example.myquizapp

object Constants {

    const val USER_NAME : String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_questions"
    const val  CORRECT_ANSWERS:String="correct_answers"



    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_afghanistan,
            "Armenia","North Korea",
            "Afghanistan","Brazil",
            3
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia",
            "Colombia","none of these",
            1
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina","Australia",
            "Afghanistan","Brazil",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_pakistan,
            "India","Australia",
            "Pakistan","Brazil",
            3
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_sri_lanka,
            "Sri-lanka","Nigeria",
            "Afghanistan","Colombia",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_france_flag,
            "Nigeria","New-Zealand",
            "France","Brazil",
            3
        )
        questionList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_china_flag,
            "South Africa","Gabon",
            "Finland","China",
            4
        )
        questionList.add(que7)

        return questionList
    }
}