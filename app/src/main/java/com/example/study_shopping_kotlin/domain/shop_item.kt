package com.example.study_shopping_kotlin.domain

data class shop_item(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id:Int = UNDENTIFIED_ID,
)
{
    companion object {
        const val UNDENTIFIED_ID = -1
    }

}

