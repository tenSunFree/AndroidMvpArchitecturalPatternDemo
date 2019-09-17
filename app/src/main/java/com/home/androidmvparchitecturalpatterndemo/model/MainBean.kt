package com.home.androidmvparchitecturalpatterndemo.model

import com.google.gson.annotations.SerializedName

data class MainBean(
    @SerializedName("postList")
    val postList: List<Post>
) {
    data class Post(
        @SerializedName("avatarImageUrl")
        val avatarImageUrl: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("from")
        val from: String,
        @SerializedName("time")
        val time: String,
        @SerializedName("content")
        val content: String,
        @SerializedName("contentImageUrlList")
        val contentImageUrlList: List<ContentImageUrl>,
        @SerializedName("money")
        val money: String
    ) {
        data class ContentImageUrl(
            @SerializedName("imageUrl")
            val imageUrl: String
        )
    }
}