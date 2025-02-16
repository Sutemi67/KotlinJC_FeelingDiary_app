package apc.appcradle.kotlinjc_feelingdiary_app.data

import androidx.compose.ui.graphics.Color
import apc.appcradle.kotlinjc_feelingdiary_app.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.angerColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.fearColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.loveColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.sadnessColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.shameColor200

data class Feeling(
    val name: String,
    val color: Color,
    val returnState: CardState
)

val mainFeelingsList = listOf<Feeling>(
    Feeling("Гнев", angerColor200, CardState.ListAnger),
    Feeling("Страх", fearColor200, CardState.ListFear),
    Feeling("Стыд", shameColor200, CardState.ListShame),
    Feeling("Грусть", sadnessColor200, CardState.ListSad),
    Feeling("Радость", funColor200, CardState.ListFun),
    Feeling("Любовь", loveColor200, CardState.ListLove),
)


val angerFeelingsList = listOf<Feeling>(
    Feeling("Ирония", angerColor200, CardState.OneFeelDescribing("Ирония", angerColor200)),
    Feeling("Недовольство", angerColor200, CardState.OneFeelDescribing("Недовольство", angerColor200)),
    Feeling("Возмущение", angerColor200, CardState.OneFeelDescribing("Возмущение", angerColor200)),
    Feeling("Досада", angerColor200, CardState.OneFeelDescribing("Досада", angerColor200)),
    Feeling("Раздражение", angerColor200, CardState.OneFeelDescribing("Раздражение", angerColor200)),
    Feeling("Обида", angerColor200, CardState.OneFeelDescribing("Обида", angerColor200)),
    Feeling("Уязвленность", angerColor200, CardState.OneFeelDescribing("Уязвленность", angerColor200)),
    Feeling("Зависть", angerColor200, CardState.OneFeelDescribing("Зависть", angerColor200)),
    Feeling("Ревность", angerColor200, CardState.OneFeelDescribing("Ревность", angerColor200)),
    Feeling("Униженность", angerColor200, CardState.OneFeelDescribing("Униженность", angerColor200)),
    Feeling("Негодование", angerColor200, CardState.OneFeelDescribing("Негодование", angerColor200)),
    Feeling("Презрение", angerColor200, CardState.OneFeelDescribing("Презрение", angerColor200)),
    Feeling("Злость", angerColor200, CardState.OneFeelDescribing("Злость", angerColor200)),
    Feeling("Ненависть", angerColor200, CardState.OneFeelDescribing("Ненависть", angerColor200)),
    Feeling("Ярость", angerColor200, CardState.OneFeelDescribing("Ярость", angerColor200)),
    Feeling("Бешенство", angerColor200, CardState.OneFeelDescribing("Бешенство", angerColor200)),
    Feeling("Истерия", angerColor200, CardState.OneFeelDescribing("Истерия", angerColor200)),
)


val fearFeelingsList = listOf<Feeling>(
    Feeling("Застенчивость", fearColor200, CardState.First),
    Feeling("Смущение", fearColor200, CardState.First),
    Feeling("Боязнь", fearColor200, CardState.First),
    Feeling("Подозрение", fearColor200, CardState.First),
    Feeling("Опасение", fearColor200, CardState.First),
    Feeling("Тревога", fearColor200, CardState.First),
    Feeling("Оцепенение", fearColor200, CardState.First),
    Feeling("Испуг", fearColor200, CardState.First),
    Feeling("Отчаяние", fearColor200, CardState.First),
    Feeling("Ужас", fearColor200, CardState.First),
)
val shameFeelingsList = listOf<Feeling>(
    Feeling("Неловкость", shameColor200, CardState.First),
    Feeling("Стеснение", shameColor200, CardState.First),
    Feeling("Дискомфорт", shameColor200, CardState.First),
    Feeling("Растерянность", shameColor200, CardState.First),
    Feeling("Нерешительность", shameColor200, CardState.First),
    Feeling("Никчемность", shameColor200, CardState.First),
    Feeling("Угнетенность", shameColor200, CardState.First),
    Feeling("Замкнутость", shameColor200, CardState.First),
    Feeling("Позор", shameColor200, CardState.First),
    Feeling("Вина", shameColor200, CardState.First),
    Feeling("Унижение", shameColor200, CardState.First),
    Feeling("Раскаяние", shameColor200, CardState.First),
)
val sadFeelingsList = listOf<Feeling>(
    Feeling("Лень", sadnessColor200, CardState.First),
    Feeling("Жалость", sadnessColor200, CardState.First),
    Feeling("Беспомощность", sadnessColor200, CardState.First),
    Feeling("Отчужденность", sadnessColor200, CardState.First),
    Feeling("Сожаление", sadnessColor200, CardState.First),
    Feeling("Печать", sadnessColor200, CardState.First),
    Feeling("Безысходность", sadnessColor200, CardState.First),
    Feeling("Загнанность", sadnessColor200, CardState.First),
    Feeling("Разочарование", sadnessColor200, CardState.First),
    Feeling("Одиночество", sadnessColor200, CardState.First),
    Feeling("Отчаяние", sadnessColor200, CardState.First),
    Feeling("Безнадежность", sadnessColor200, CardState.First),
    Feeling("Душевная боль", sadnessColor200, CardState.First),
    Feeling("Тоска", sadnessColor200, CardState.First),
    Feeling("Горечь", sadnessColor200, CardState.First),
)
val funFeelingsList = listOf<Feeling>(
    Feeling("Умиротворенность", funColor200, CardState.First),
    Feeling("Спокойствие", funColor200, CardState.First),
    Feeling("Любопытство", funColor200, CardState.First),
    Feeling("Ожидание", funColor200, CardState.First),
    Feeling("Предвкушение", funColor200, CardState.First),
    Feeling("Нетерпение", funColor200, CardState.First),
    Feeling("Увлечение", funColor200, CardState.First),
    Feeling("Изумление", funColor200, CardState.First),
    Feeling("Благость", funColor200, CardState.First),
    Feeling("Волнение", funColor200, CardState.First),
    Feeling("Забота", funColor200, CardState.First),
    Feeling("Симпатия", funColor200, CardState.First),
    Feeling("Оживление", funColor200, CardState.First),
    Feeling("Принятие", funColor200, CardState.First),
    Feeling("Восторг", funColor200, CardState.First),
    Feeling("Счастье", funColor200, CardState.First),
    Feeling("Ликование", funColor200, CardState.First),
    Feeling("Вера", funColor200, CardState.First),
)
val loveFeelingsList = listOf<Feeling>(
    Feeling("Благодарность", loveColor200, CardState.First),
    Feeling("Искренность", loveColor200, CardState.First),
    Feeling("Дружелюбие", loveColor200, CardState.First),
    Feeling("Вдохновение", loveColor200, CardState.First),
    Feeling("Гордость", loveColor200, CardState.First),
    Feeling("Симпатия", loveColor200, CardState.First),
    Feeling("Нежность", loveColor200, CardState.First),
    Feeling("Блаженство", loveColor200, CardState.First),
    Feeling("Безопасность", loveColor200, CardState.First),
    Feeling("Доверие", loveColor200, CardState.First),
    Feeling("Теплота", loveColor200, CardState.First),
    Feeling("Доброта", loveColor200, CardState.First),
    Feeling("Восхищение", loveColor200, CardState.First),
    Feeling("Очарование", loveColor200, CardState.First),
)
