package com.example.memo

import java.util.*

/**
 * メモデータ管理
 */
class MemoRepository {

    /**
     * メモを全件取得
     *
     * @return List
     */
    fun findAllMemo(): List<Memo> {
        // FIXME:テストデータを返す
        return listOf(
            Memo("1", "メモです", Date(), Date()),
            Memo("2", "メモです", Date(), Date()),
            Memo("3", "メモです", Date(), Date()),
            Memo("4", "メモです", Date(), Date()),
            Memo("5", "メモです", Date(), Date())
        )
    }
}