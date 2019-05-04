package demo.qraphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import demo.api.HeroRepository
import org.springframework.stereotype.Component

@Component
class Query(
    private val heroRepository: HeroRepository
) : GraphQLQueryResolver {
    fun version(): String {
        return "1.0"
    }

    fun getStarWarsHero() = heroRepository.findHeloByName("ルーク")
}