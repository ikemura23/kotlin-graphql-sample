package demo.api

import demo.model.Hero
import org.springframework.stereotype.Component

/**
 * ヒーローリポジトリ
 */
@Component
class HeroRepository {
    /**
     * ヒーローリストを作成する
     */
    private fun createHero(): List<Hero> {
        return listOf(
            Hero("ルーク"),
            Hero("レイア姫"),
            Hero("チューバッカ"),
            Hero("ハン・ソロ")
        )
    }

    /**
     * 名前からヒーロを探す
     */
    fun findHeloByName(name: String): Hero? {
        return createHero().firstOrNull { it.name == name }
    }

    /**
     * 名前のヒーロー以外を返す
     */
    fun getFriends(name: String): List<Hero> {
        return createHero().filter { it.name != name }
    }
}