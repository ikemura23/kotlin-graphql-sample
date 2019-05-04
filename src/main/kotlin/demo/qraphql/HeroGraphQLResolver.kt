package demo.qraphql

import com.coxautodev.graphql.tools.GraphQLResolver
import demo.api.HeroRepository
import demo.model.Hero
import org.springframework.stereotype.Component

@Component
class HeroGraphQLResolver(
    private val heroRepository: HeroRepository
) : GraphQLResolver<Hero> {

    fun getFriends(hero: Hero): List<Hero> {
        return heroRepository.getFriends(hero.name)
    }
}