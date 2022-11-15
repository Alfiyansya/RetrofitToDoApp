package com.alfiansyah.retrofittodoapp

import com.google.gson.annotations.SerializedName

data class Todo(
	val id: Int,
	val completed: Boolean,
	val title: String,
	val userId: Int
)
