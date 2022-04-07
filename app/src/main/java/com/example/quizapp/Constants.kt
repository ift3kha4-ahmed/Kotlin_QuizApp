package com.example.quizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,"Which Country does this flag belong to?",R.drawable.ic_flag_of_argentina,"Argentina",
            "Australia","Afghanistan","New Zealand",1
        )

        val que2 = Question(2,"Which Country does this flag belong to?",R.drawable.ic_flag_of_australia,"Argentina",
            "Australia","Afghanistan","New Zealand",2
        )

        val que3 = Question(3,"Which Country does this flag belong to?",R.drawable.ic_flag_of_belgium,"Argentina",
            "Australia","Belgium","New Zealand",3
        )

        val que4 = Question(4,"Which Country does this flag belong to?",R.drawable.ic_flag_of_denmark,"South Africa",
            "USA","Denmark","India",3
        )
        val que5 = Question(5,"Which Country does this flag belong to?",R.drawable.ic_flag_of_fiji,"Argentina",
            "Australia","fiji","New Zealand",3
        )
        val que6 = Question(6,"Which Country does this flag belong to?",R.drawable.ic_flag_of_germany,"USA",
            "UK","Germany","Russia",3
        )
        val que7 = Question(7,"Which Country does this flag belong to?",R.drawable.ic_flag_of_india,"Argentina",
            "India","Afghanistan","New Zealand",2
        )
        val que8 = Question(8,"Which Country does this flag belong to?",R.drawable.ic_flag_of_kuwait,"Argentina",
            "Australia","Canada","Kuwait",4
        )
        val que9 = Question(9,"Which Country does this flag belong to?",R.drawable.ic_flag_of_new_zealand,"Japan",
            "Indo","Brazil","New Zealand",4
        )
        val que10 = Question(10,"Which Country does this flag belong to?",R.drawable.ic_flag_of_brazil,"Brazil",
            "Australia","Afghanistan","New Zealand",1
        )


        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        questionList.add(que10)

        return questionList
    }
}