package com.raywenderlich.listmaker

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_selection_view_holder.view.*

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPosition = itemView.itemNumberTextView
    val listTitle = itemView.itemStringTextView
}