package com.whate_dragon.shoping_list.presentation

import androidx.recyclerview.widget.DiffUtil
import com.whate_dragon.shoping_list.domain.ShopItem

class ShopListDiffCallback(
    private val olfList: List<ShopItem>,
    private val newList: List<ShopItem>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return olfList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = olfList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = olfList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem == newItem
    }
}