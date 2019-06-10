package com.example.memo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * メモのリストを表示するためのアダプター
 *
 * @param memoList メモ全件
 */
class MemoRecyclerViewAdapter(private val memoList: List<Memo>) :
        RecyclerView.Adapter<MemoRecyclerViewAdapter.ViewHolder>() {

    /**
     * リストの数を設定
     */
    override fun getItemCount(): Int = memoList.size

    /**
     * リストのアイテムを生成
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_memo, parent, false)
        return ViewHolder(view)
    }

    /**
     * リストのアイテムにデータを反映
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val memo = memoList[position]
        holder.bind(memo)
    }

    /**
     * リストのアイテム ViewHolder
     *
     * @param view リストアイテムのView
     */
    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        /**
         * メモを反映
         *
         * @param memo メモ
         */
        fun bind(memo: Memo) {
            val contentTextView =  view.findViewById<TextView>(R.id.contentTextView)
            contentTextView.text = memo.content

            val createAtTextView =  view.findViewById<TextView>(R.id.createAtTextView)
            createAtTextView.text = memo.createAt.toString()
        }
    }
}
