package com.example.memo

import java.util.*

/**
 * メモ
 *
 * @param id ID
 * @param content 内容
 * @param createAt 作成日
 * @param updateAt 更新日
 */
data class Memo(
    val id: String,
    val content: String,
    val createAt: Date,
    val updateAt: Date
)