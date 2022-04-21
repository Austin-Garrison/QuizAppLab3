package com.zybooks.quizapplab3

object QuestionBank {

    const val TOTAL_QUESTION: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val q1 = Question(1,"Who was the first president of the United States?","Thomas Jefferson",
            "Abraham Lincoln",
            "George Washington",
            "John Adams",
            3)

        val q2 = Question(2,"Chicago is a:",
            "state",
            "city",
            "country",
            "continent",
            2)

        val q3 = Question( 3,"When was the war of 1812?",
            "1912",
            "1821",
            "1820",
            "1812",
            4)

        val q4 = Question( 4,"Which is the correct spelling of Receive?",
            "Recieve",
            "Receive",
            "Receeve",
            "Receieve",
            2)

        val q5 = Question( 5,"Which of the following is considered a fish?",
            "Starfish",
            "Jellyfish",
            "Clown fish",
            "Crayfish",
            3)

        val q6 = Question( 5,"",
            "",
            "",
            "",
            "",
            1)

        questionList.add(q1)
        questionList.add(q2)
        questionList.add(q3)
        questionList.add(q4)
        questionList.add(q5)
        questionList.add(q6)

        return questionList
    }
}