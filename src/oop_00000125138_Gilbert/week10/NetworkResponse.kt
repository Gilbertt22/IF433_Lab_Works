package oop_00000125138_Gilbert.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)