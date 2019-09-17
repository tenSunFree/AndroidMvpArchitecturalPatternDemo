package com.home.androidmvparchitecturalpatterndemo.view.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.home.androidmvparchitecturalpatterndemo.R
import com.home.androidmvparchitecturalpatterndemo.model.MainBean
import com.mikhaellopez.circularimageview.CircularImageView

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private var postList: List<MainBean.Post>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main_recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.circularImageView.context).load(postList!![position].avatarImageUrl)
            .into(holder.circularImageView)
        holder.nameTextView.text = postList!![position].name
        holder.fromTextView.text = postList!![position].from
        holder.timeTextView.text = postList!![position].time
        holder.contentTextView.text = postList!![position].content
        when (val pictureCount = postList!![position].contentImageUrlList.size) {
            1 -> {
                gonePictureGroupConstraintLayout(holder)
                holder.pictureGroupConstraintLayout1.visibility = View.VISIBLE
                holder.moneyTextView1.text = postList!![position].money
                Glide.with(holder.pictureGroupImageView11.context)
                    .load(postList!![position].contentImageUrlList[0].imageUrl)
                    .into(holder.pictureGroupImageView11)
            }
            2 -> {
                gonePictureGroupConstraintLayout(holder)
                holder.pictureGroupConstraintLayout2.visibility = View.VISIBLE
                holder.moneyTextView2.text = postList!![position].money
                Glide.with(holder.pictureGroupImageView21.context)
                    .load(postList!![position].contentImageUrlList[0].imageUrl)
                    .into(holder.pictureGroupImageView21)
                Glide.with(holder.pictureGroupImageView22.context)
                    .load(postList!![position].contentImageUrlList[1].imageUrl)
                    .into(holder.pictureGroupImageView22)
            }
            3 -> {
                gonePictureGroupConstraintLayout(holder)
                holder.pictureGroupConstraintLayout3.visibility = View.VISIBLE
                holder.moneyTextView3.text = postList!![position].money
                Glide.with(holder.pictureGroupImageView31.context)
                    .load(postList!![position].contentImageUrlList[0].imageUrl)
                    .into(holder.pictureGroupImageView31)
                Glide.with(holder.pictureGroupImageView32.context)
                    .load(postList!![position].contentImageUrlList[1].imageUrl)
                    .into(holder.pictureGroupImageView32)
                Glide.with(holder.pictureGroupImageView33.context)
                    .load(postList!![position].contentImageUrlList[2].imageUrl)
                    .into(holder.pictureGroupImageView33)
            }
            4 -> {
                gonePictureGroupConstraintLayout(holder)
                holder.pictureGroupConstraintLayout4.visibility = View.VISIBLE
                holder.moneyTextView4.text = postList!![position].money
                Glide.with(holder.pictureGroupImageView41.context)
                    .load(postList!![position].contentImageUrlList[0].imageUrl)
                    .into(holder.pictureGroupImageView41)
                Glide.with(holder.pictureGroupImageView42.context)
                    .load(postList!![position].contentImageUrlList[1].imageUrl)
                    .into(holder.pictureGroupImageView42)
                Glide.with(holder.pictureGroupImageView43.context)
                    .load(postList!![position].contentImageUrlList[2].imageUrl)
                    .into(holder.pictureGroupImageView43)
                Glide.with(holder.pictureGroupImageView44.context)
                    .load(postList!![position].contentImageUrlList[3].imageUrl)
                    .into(holder.pictureGroupImageView44)
            }
            else -> {
                gonePictureGroupConstraintLayout(holder)
                holder.pictureGroupConstraintLayout5.visibility = View.VISIBLE
                holder.moneyTextView5.text = postList!![position].money
                if (pictureCount > 5) {
                    holder.pictureCountFrameLayout.visibility = View.VISIBLE
                    val add = "+"
                    holder.pictureCountTextView.text = add + (pictureCount - 5)
                } else {
                    holder.pictureCountFrameLayout.visibility = View.GONE
                }
                Glide.with(holder.pictureGroupImageView51.context)
                    .load(postList!![position].contentImageUrlList[0].imageUrl)
                    .into(holder.pictureGroupImageView51)
                Glide.with(holder.pictureGroupImageView52.context)
                    .load(postList!![position].contentImageUrlList[1].imageUrl)
                    .into(holder.pictureGroupImageView52)
                Glide.with(holder.pictureGroupImageView53.context)
                    .load(postList!![position].contentImageUrlList[2].imageUrl)
                    .into(holder.pictureGroupImageView53)
                Glide.with(holder.pictureGroupImageView54.context)
                    .load(postList!![position].contentImageUrlList[3].imageUrl)
                    .into(holder.pictureGroupImageView54)
                Glide.with(holder.pictureGroupImageView55.context)
                    .load(postList!![position].contentImageUrlList[4].imageUrl)
                    .into(holder.pictureGroupImageView55)
            }
        }
        Glide.with(holder.explosionBarImageView.context)
            .load(R.drawable.icon_explosion_bar)
            .into(holder.explosionBarImageView)
    }

    private fun gonePictureGroupConstraintLayout(holder: ViewHolder) {
        holder.pictureGroupConstraintLayout1.visibility = View.GONE
        holder.pictureGroupConstraintLayout2.visibility = View.GONE
        holder.pictureGroupConstraintLayout3.visibility = View.GONE
        holder.pictureGroupConstraintLayout4.visibility = View.GONE
        holder.pictureGroupConstraintLayout5.visibility = View.GONE
    }

    override fun getItemCount(): Int {
        return postList!!.size
    }

    fun setPostList(postList: List<MainBean.Post>) {
        this.postList = postList
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val circularImageView: CircularImageView = itemView.findViewById(R.id.circular_image_view)
        val nameTextView: TextView = itemView.findViewById(R.id.text_view_name)
        val fromTextView: TextView = itemView.findViewById(R.id.text_view_from)
        val timeTextView: TextView = itemView.findViewById(R.id.text_view_time)
        val contentTextView: TextView = itemView.findViewById(R.id.text_view_content)
        val pictureGroupConstraintLayout1: ConstraintLayout =
            itemView.findViewById(R.id.constraint_layout_picture_group1)
        val pictureGroupConstraintLayout2: ConstraintLayout =
            itemView.findViewById(R.id.constraint_layout_picture_group2)
        val pictureGroupConstraintLayout3: ConstraintLayout =
            itemView.findViewById(R.id.constraint_layout_picture_group3)
        val pictureGroupConstraintLayout4: ConstraintLayout =
            itemView.findViewById(R.id.constraint_layout_picture_group4)
        val pictureGroupConstraintLayout5: ConstraintLayout =
            itemView.findViewById(R.id.constraint_layout_picture_group5)
        val moneyTextView1: TextView = itemView.findViewById(R.id.text_view_money1)
        val moneyTextView2: TextView = itemView.findViewById(R.id.text_view_money2)
        val moneyTextView3: TextView = itemView.findViewById(R.id.text_view_money3)
        val moneyTextView4: TextView = itemView.findViewById(R.id.text_view_money4)
        val moneyTextView5: TextView = itemView.findViewById(R.id.text_view_money5)
        val pictureCountTextView: TextView = itemView.findViewById(R.id.text_view_picture_count)
        val pictureGroupImageView11: ImageView =
            itemView.findViewById(R.id.image_view_picture_group11)
        val pictureGroupImageView21: ImageView =
            itemView.findViewById(R.id.image_view_picture_group21)
        val pictureGroupImageView22: ImageView =
            itemView.findViewById(R.id.image_view_picture_group22)
        val pictureGroupImageView31: ImageView =
            itemView.findViewById(R.id.image_view_picture_group31)
        val pictureGroupImageView32: ImageView =
            itemView.findViewById(R.id.image_view_picture_group32)
        val pictureGroupImageView33: ImageView =
            itemView.findViewById(R.id.image_view_picture_group33)
        val pictureGroupImageView41: ImageView =
            itemView.findViewById(R.id.image_view_picture_group41)
        val pictureGroupImageView42: ImageView =
            itemView.findViewById(R.id.image_view_picture_group42)
        val pictureGroupImageView43: ImageView =
            itemView.findViewById(R.id.image_view_picture_group43)
        val pictureGroupImageView44: ImageView =
            itemView.findViewById(R.id.image_view_picture_group44)
        val pictureGroupImageView51: ImageView =
            itemView.findViewById(R.id.image_view_picture_group51)
        val pictureGroupImageView52: ImageView =
            itemView.findViewById(R.id.image_view_picture_group52)
        val pictureGroupImageView53: ImageView =
            itemView.findViewById(R.id.image_view_picture_group53)
        val pictureGroupImageView54: ImageView =
            itemView.findViewById(R.id.image_view_picture_group54)
        val pictureGroupImageView55: ImageView =
            itemView.findViewById(R.id.image_view_picture_group55)
        val pictureCountFrameLayout: FrameLayout =
            itemView.findViewById(R.id.frame_layout_picture_count)
        val explosionBarImageView: ImageView = itemView.findViewById(R.id.image_view_explosion_bar)
    }
}