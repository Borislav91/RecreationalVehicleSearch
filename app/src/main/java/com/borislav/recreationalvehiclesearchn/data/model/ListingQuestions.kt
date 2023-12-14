package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class ListingQuestions(
    @SerializedName("answer")
    val answer: String = "", // The van is kept at my office, where you can safely park/leave your car during your rental. 
    @SerializedName("question")
    val question: String = "" // What flexibility is available for picking up and dropping off the RV?
)