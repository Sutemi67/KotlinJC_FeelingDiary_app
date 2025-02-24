package apc.appcradle.kotlinjc_feelingdiary_app.data

import apc.appcradle.kotlinjc_feelingdiary_app.domain.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.domain.Feel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.angerColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.fearColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.loveColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.sadnessColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.shameColor200

//region MAIN FEELS
val mainFeelingsLists = listOf<Feel.Main>(
    Feel.Main("Гнев", angerColor200, CardState.ListAnger),
    Feel.Main("Страх", fearColor200, CardState.ListFear),
    Feel.Main("Стыд", shameColor200, CardState.ListShame),
    Feel.Main("Грусть", sadnessColor200, CardState.ListSad),
    Feel.Main("Радость", funColor200, CardState.ListFun),
    Feel.Main("Любовь", loveColor200, CardState.ListLove),
)
//endregion
//region ANGER
val angerFeelingsLists = listOf<Feel.Side>(
    Feel.Side(
        "Ирония",
        angerColor200,
        CardState.OneFeelDescribing("Ирония", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Недовольство",
        angerColor200,
        CardState.OneFeelDescribing("Недовольство", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Возмущение",
        angerColor200,
        CardState.OneFeelDescribing("Возмущение", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Досада",
        angerColor200,
        CardState.OneFeelDescribing("Досада", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Раздражение",
        angerColor200,
        CardState.OneFeelDescribing("Раздражение", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Обида",
        angerColor200,
        CardState.OneFeelDescribing("Обида", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Уязвленность",
        angerColor200,
        CardState.OneFeelDescribing("Уязвленность", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Зависть",
        angerColor200,
        CardState.OneFeelDescribing("Зависть", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Ревность",
        angerColor200,
        CardState.OneFeelDescribing("Ревность", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Униженность",
        angerColor200,
        CardState.OneFeelDescribing("Униженность", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Негодование",
        angerColor200,
        CardState.OneFeelDescribing("Негодование", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Презрение",
        angerColor200,
        CardState.OneFeelDescribing("Презрение", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Злость",
        angerColor200,
        CardState.OneFeelDescribing("Злость", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Ненависть",
        angerColor200,
        CardState.OneFeelDescribing("Ненависть", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Ярость",
        angerColor200,
        CardState.OneFeelDescribing("Ярость", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Бешенство",
        angerColor200,
        CardState.OneFeelDescribing("Бешенство", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
    Feel.Side(
        "Истерия",
        angerColor200,
        CardState.OneFeelDescribing("Истерия", angerColor200, "Гнев"),
        mainFeelingsLists[0]
    ),
)

//endregion
//region FEAR
val fearFeelingsLists = listOf<Feel>(
    Feel.Side(
        "Застенчивость",
        fearColor200,
        CardState.OneFeelDescribing("Застенчивость", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Смущение",
        fearColor200,
        CardState.OneFeelDescribing("Смущение", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Боязнь",
        fearColor200,
        CardState.OneFeelDescribing("Боязнь", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Подозрение",
        fearColor200,
        CardState.OneFeelDescribing("Подозрение", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Опасение",
        fearColor200,
        CardState.OneFeelDescribing("Опасение", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Тревога",
        fearColor200,
        CardState.OneFeelDescribing("Тревога", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Оцепенение",
        fearColor200,
        CardState.OneFeelDescribing("Оцепенение", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Испуг",
        fearColor200,
        CardState.OneFeelDescribing("Испуг", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Отчаяние",
        fearColor200,
        CardState.OneFeelDescribing("Отчаяние", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
    Feel.Side(
        "Ужас",
        fearColor200,
        CardState.OneFeelDescribing("Ужас", fearColor200, "Страх"),
        mainFeelingsLists[1]
    ),
)
//endregion
//region SHAME
val shameFeelingsLists = listOf<Feel>(
    Feel.Side(
        "Неловкость",
        shameColor200,
        CardState.OneFeelDescribing("Неловкость", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Стеснение",
        shameColor200,
        CardState.OneFeelDescribing("Стеснение", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Дискомфорт",
        shameColor200,
        CardState.OneFeelDescribing("Дискомфорт", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Растерянность",
        shameColor200,
        CardState.OneFeelDescribing("Растерянность", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Нерешительность",
        shameColor200,
        CardState.OneFeelDescribing("Нерешительность", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Никчемность",
        shameColor200,
        CardState.OneFeelDescribing("Никчемность", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Угнетенность",
        shameColor200,
        CardState.OneFeelDescribing("Угнетенность", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Замкнутость",
        shameColor200,
        CardState.OneFeelDescribing("Замкнутость", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Позор", shameColor200, CardState.OneFeelDescribing("Позор", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Вина", shameColor200, CardState.OneFeelDescribing("Вина", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Унижение", shameColor200, CardState.OneFeelDescribing("Унижение", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
    Feel.Side(
        "Раскаяние", shameColor200, CardState.OneFeelDescribing("Раскаяние", shameColor200, "Стыд"),
        mainFeelingsLists[2]
    ),
)
//endregion
//region SADNESS
val sadFeelingsLists = listOf<Feel>(
    Feel.Side(
        "Лень",
        sadnessColor200,
        CardState.OneFeelDescribing("Лень", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Жалость", sadnessColor200, CardState.OneFeelDescribing("Жалость", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Беспомощность",
        sadnessColor200,
        CardState.OneFeelDescribing("Беспомощность", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Отчужденность",
        sadnessColor200,
        CardState.OneFeelDescribing("Отчужденность", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Сожаление",
        sadnessColor200,
        CardState.OneFeelDescribing("Сожаление", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Печать", sadnessColor200, CardState.OneFeelDescribing("Печать", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Безысходность",
        sadnessColor200,
        CardState.OneFeelDescribing("Безысходность", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Загнанность",
        sadnessColor200,
        CardState.OneFeelDescribing("Загнанность", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Разочарование",
        sadnessColor200,
        CardState.OneFeelDescribing("Разочарование", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Одиночество",
        sadnessColor200,
        CardState.OneFeelDescribing("Одиночество", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Отчаяние", sadnessColor200, CardState.OneFeelDescribing("Отчаяние", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Безнадежность",
        sadnessColor200,
        CardState.OneFeelDescribing("Безнадежность", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Душевная боль",
        sadnessColor200,
        CardState.OneFeelDescribing("Душевная боль", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Тоска", sadnessColor200, CardState.OneFeelDescribing("Тоска", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
    Feel.Side(
        "Горечь", sadnessColor200, CardState.OneFeelDescribing("Горечь", sadnessColor200, "Грусть"),
        mainFeelingsLists[3]
    ),
)
//endregion
//region FUN
val funFeelingsLists = listOf<Feel>(
    Feel.Side(
        "Умиротворенность",
        funColor200,
        CardState.OneFeelDescribing("Умиротворенность", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Спокойствие",
        funColor200,
        CardState.OneFeelDescribing("Спокойствие", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Любопытство",
        funColor200,
        CardState.OneFeelDescribing("Любопытство", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Ожидание",
        funColor200,
        CardState.OneFeelDescribing("Ожидание", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Предвкушение",
        funColor200,
        CardState.OneFeelDescribing("Предвкушение", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Нетерпение",
        funColor200,
        CardState.OneFeelDescribing("Нетерпение", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Увлечение",
        funColor200,
        CardState.OneFeelDescribing("Увлечение", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Изумление",
        funColor200,
        CardState.OneFeelDescribing("Изумление", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Благость",
        funColor200,
        CardState.OneFeelDescribing("Благость", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Волнение",
        funColor200,
        CardState.OneFeelDescribing("Волнение", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Забота",
        funColor200,
        CardState.OneFeelDescribing("Забота", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Симпатия",
        funColor200,
        CardState.OneFeelDescribing("Симпатия", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Оживление",
        funColor200,
        CardState.OneFeelDescribing("Оживление", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Принятие",
        funColor200,
        CardState.OneFeelDescribing("Принятие", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Восторг",
        funColor200,
        CardState.OneFeelDescribing("Восторг", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Счастье",
        funColor200,
        CardState.OneFeelDescribing("Счастье", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Ликование",
        funColor200,
        CardState.OneFeelDescribing("Ликование", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
    Feel.Side(
        "Вера",
        funColor200,
        CardState.OneFeelDescribing("Вера", funColor200, "Радость"),
        mainFeelingsLists[4]
    ),
)

//endregion
//region LOVE
val loveFeelingsLists = listOf<Feel>(
    Feel.Side(
        "Благодарность",
        loveColor200,
        CardState.OneFeelDescribing("Благодарность", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Искренность",
        loveColor200,
        CardState.OneFeelDescribing("Искренность", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Дружелюбие",
        loveColor200,
        CardState.OneFeelDescribing("Дружелюбие", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Вдохновение",
        loveColor200,
        CardState.OneFeelDescribing("Вдохновение", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Гордость",
        loveColor200,
        CardState.OneFeelDescribing("Гордость", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Симпатия",
        loveColor200,
        CardState.OneFeelDescribing("Симпатия", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Нежность",
        loveColor200,
        CardState.OneFeelDescribing("Нежность", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Блаженство",
        loveColor200,
        CardState.OneFeelDescribing("Блаженство", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Безопасность",
        loveColor200,
        CardState.OneFeelDescribing("Безопасность", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Доверие",
        loveColor200,
        CardState.OneFeelDescribing("Доверие", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Теплота",
        loveColor200,
        CardState.OneFeelDescribing("Теплота", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Доброта",
        loveColor200,
        CardState.OneFeelDescribing("Доброта", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Восхищение",
        loveColor200,
        CardState.OneFeelDescribing("Восхищение", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),
    Feel.Side(
        "Очарование",
        loveColor200,
        CardState.OneFeelDescribing("Очарование", loveColor200, "Любовь"),
        mainFeelingsLists[5]
    ),

)
//endregion
