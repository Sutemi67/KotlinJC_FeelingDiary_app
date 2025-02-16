package apc.appcradle.kotlinjc_feelingdiary_app.data

import androidx.compose.ui.graphics.Color
import apc.appcradle.kotlinjc_feelingdiary_app.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.angerColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.fearColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.loveColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.sadnessColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.shameColor200

data class Feelings(
    val name: String,
    val color: Color,
    val returnState: CardState
)

val mainFeelingsList = listOf<Feelings>(
    Feelings("Гнев", angerColor200, CardState.ListAnger),
    Feelings("Страх", fearColor200, CardState.ListFear),
    Feelings("Стыд", shameColor200, CardState.ListShame),
    Feelings("Грусть", sadnessColor200, CardState.ListSad),
    Feelings("Радость", funColor200, CardState.ListFun),
    Feelings("Любовь", loveColor200, CardState.ListLove),
)

val angerFeelingsList = listOf<Feelings>(
    Feelings("Ирония", angerColor200, CardState.First),
    Feelings("Недовольство", angerColor200, CardState.First),
    Feelings("Возмущение", angerColor200, CardState.First),
    Feelings("Досада", angerColor200, CardState.First),
    Feelings("Раздражение", angerColor200, CardState.First),
    Feelings("Обида", angerColor200, CardState.First),
    Feelings("Уязвленность", angerColor200, CardState.First),
    Feelings("Зависть", angerColor200, CardState.First),
    Feelings("Ревность", angerColor200, CardState.First),
    Feelings("Униженность", angerColor200, CardState.First),
    Feelings("Негодование", angerColor200, CardState.First),
    Feelings("Презрение", angerColor200, CardState.First),
    Feelings("Злость", angerColor200, CardState.First),
    Feelings("Ненависть", angerColor200, CardState.First),
    Feelings("Ярость", angerColor200, CardState.First),
    Feelings("Бешенство", angerColor200, CardState.First),
    Feelings("Истерия", angerColor200, CardState.First),
)
val fearFeelingsList = listOf<Feelings>(
    Feelings("Застенчивость", fearColor200, CardState.First),
    Feelings("Смущение", fearColor200, CardState.First),
    Feelings("Боязнь", fearColor200, CardState.First),
    Feelings("Подозрение", fearColor200, CardState.First),
    Feelings("Опасение", fearColor200, CardState.First),
    Feelings("Тревога", fearColor200, CardState.First),
    Feelings("Оцепенение", fearColor200, CardState.First),
    Feelings("Испуг", fearColor200, CardState.First),
    Feelings("Отчаяние", fearColor200, CardState.First),
    Feelings("Ужас", fearColor200, CardState.First),
)
val shameFeelingsList = listOf<Feelings>(
    Feelings("Неловкость", shameColor200, CardState.First),
    Feelings("Стеснение", shameColor200, CardState.First),
    Feelings("Дискомфорт", shameColor200, CardState.First),
    Feelings("Растерянность", shameColor200, CardState.First),
    Feelings("Нерешительность", shameColor200, CardState.First),
    Feelings("Никчемность", shameColor200, CardState.First),
    Feelings("Угнетенность", shameColor200, CardState.First),
    Feelings("Замкнутость", shameColor200, CardState.First),
    Feelings("Позор", shameColor200, CardState.First),
    Feelings("Вина", shameColor200, CardState.First),
    Feelings("Унижение", shameColor200, CardState.First),
    Feelings("Раскаяние", shameColor200, CardState.First),
)
val sadFeelingsList = listOf<Feelings>(
    Feelings("Лень", sadnessColor200, CardState.First),
    Feelings("Жалость", sadnessColor200, CardState.First),
    Feelings("Беспомощность", sadnessColor200, CardState.First),
    Feelings("Отчужденность", sadnessColor200, CardState.First),
    Feelings("Сожаление", sadnessColor200, CardState.First),
    Feelings("Печать", sadnessColor200, CardState.First),
    Feelings("Безысходность", sadnessColor200, CardState.First),
    Feelings("Загнанность", sadnessColor200, CardState.First),
    Feelings("Разочарование", sadnessColor200, CardState.First),
    Feelings("Одиночество", sadnessColor200, CardState.First),
    Feelings("Отчаяние", sadnessColor200, CardState.First),
    Feelings("Безнадежность", sadnessColor200, CardState.First),
    Feelings("Душевная боль", sadnessColor200, CardState.First),
    Feelings("Тоска", sadnessColor200, CardState.First),
    Feelings("Горечь", sadnessColor200, CardState.First),
)
val funFeelingsList = listOf<Feelings>(
    Feelings("Умиротворенность", funColor200, CardState.First),
    Feelings("Спокойствие", funColor200, CardState.First),
    Feelings("Любопытство", funColor200, CardState.First),
    Feelings("Ожидание", funColor200, CardState.First),
    Feelings("Предвкушение", funColor200, CardState.First),
    Feelings("Нетерпение", funColor200, CardState.First),
    Feelings("Увлечение", funColor200, CardState.First),
    Feelings("Изумление", funColor200, CardState.First),
    Feelings("Благость", funColor200, CardState.First),
    Feelings("Волнение", funColor200, CardState.First),
    Feelings("Забота", funColor200, CardState.First),
    Feelings("Симпатия", funColor200, CardState.First),
    Feelings("Оживление", funColor200, CardState.First),
    Feelings("Принятие", funColor200, CardState.First),
    Feelings("Восторг", funColor200, CardState.First),
    Feelings("Счастье", funColor200, CardState.First),
    Feelings("Ликование", funColor200, CardState.First),
    Feelings("Вера", funColor200, CardState.First),
)
val loveFeelingsList = listOf<Feelings>(
    Feelings("Благодарность", loveColor200, CardState.First),
    Feelings("Искренность", loveColor200, CardState.First),
    Feelings("Дружелюбие", loveColor200, CardState.First),
    Feelings("Вдохновение", loveColor200, CardState.First),
    Feelings("Гордость", loveColor200, CardState.First),
    Feelings("Симпатия", loveColor200, CardState.First),
    Feelings("Нежность", loveColor200, CardState.First),
    Feelings("Блаженство", loveColor200, CardState.First),
    Feelings("Безопасность", loveColor200, CardState.First),
    Feelings("Доверие", loveColor200, CardState.First),
    Feelings("Теплота", loveColor200, CardState.First),
    Feelings("Доброта", loveColor200, CardState.First),
    Feelings("Восхищение", loveColor200, CardState.First),
    Feelings("Очарование", loveColor200, CardState.First),
)