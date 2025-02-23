package apc.appcradle.kotlinjc_feelingdiary_app.data

import apc.appcradle.kotlinjc_feelingdiary_app.domain.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.domain.Feel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.angerColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.fearColor200


val mainFeelingsLists = listOf<Feel.Main>(
    Feel.Main("Гнев", angerColor200, CardState.ListAnger),
    Feel.Main("Страх", fearColor200, CardState.ListFear),
//    Feeling.Main("Стыд", shameColor200, CardState.ListShame),
//    Feeling.Main("Грусть", sadnessColor200, CardState.ListSad),
//    Feeling.Main("Радость", funColor200, CardState.ListFun),
//    Feeling.Main("Любовь", loveColor200, CardState.ListLove),
)

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
//    Feel.Side(
//        "Боязнь",
//        fearColor200,
//        CardState.OneFeelDescribing("Боязнь", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Подозрение",
//        fearColor200,
//        CardState.OneFeelDescribing("Подозрение", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Опасение",
//        fearColor200,
//        CardState.OneFeelDescribing("Опасение", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Тревога",
//        fearColor200,
//        CardState.OneFeelDescribing("Тревога", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Оцепенение",
//        fearColor200,
//        CardState.OneFeelDescribing("Оцепенение", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Испуг",
//        fearColor200,
//        CardState.OneFeelDescribing("Испуг", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Отчаяние",
//        fearColor200,
//        CardState.OneFeelDescribing("Отчаяние", fearColor200),
//        mainFeelingsLists[1]
//    ),
//    Feel.Side(
//        "Ужас",
//        fearColor200,
//        CardState.OneFeelDescribing("Ужас", fearColor200),
//        mainFeelingsLists[1]
//    ),
)
//endregion


//val shameFeelingsLists = listOf<SideFeeling>(
//    SideFeeling(
//        "Неловкость",
//        shameColor200,
//        CardState.OneFeelDescribing("Неловкость", shameColor200)
//    ),
//    SideFeeling(
//        "Стеснение",
//        shameColor200,
//        CardState.OneFeelDescribing("Стеснение", shameColor200)
//    ),
//    SideFeeling(
//        "Дискомфорт",
//        shameColor200,
//        CardState.OneFeelDescribing("Дискомфорт", shameColor200)
//    ),
//    SideFeeling("Растерянность", shameColor200, CardState.First),
//    SideFeeling("Нерешительность", shameColor200, CardState.First),
//    SideFeeling("Никчемность", shameColor200, CardState.First),
//    SideFeeling("Угнетенность", shameColor200, CardState.First),
//    SideFeeling("Замкнутость", shameColor200, CardState.First),
//    SideFeeling("Позор", shameColor200, CardState.First),
//    SideFeeling("Вина", shameColor200, CardState.First),
//    SideFeeling("Унижение", shameColor200, CardState.First),
//    SideFeeling("Раскаяние", shameColor200, CardState.First),
//)

//val sadFeelingsLists = listOf<SideFeeling>(
//    SideFeeling("Лень", sadnessColor200, CardState.First),
//    SideFeeling("Жалость", sadnessColor200, CardState.First),
//    SideFeeling("Беспомощность", sadnessColor200, CardState.First),
//    SideFeeling("Отчужденность", sadnessColor200, CardState.First),
//    SideFeeling("Сожаление", sadnessColor200, CardState.First),
//    SideFeeling("Печать", sadnessColor200, CardState.First),
//    SideFeeling("Безысходность", sadnessColor200, CardState.First),
//    SideFeeling("Загнанность", sadnessColor200, CardState.First),
//    SideFeeling("Разочарование", sadnessColor200, CardState.First),
//    SideFeeling("Одиночество", sadnessColor200, CardState.First),
//    SideFeeling("Отчаяние", sadnessColor200, CardState.First),
//    SideFeeling("Безнадежность", sadnessColor200, CardState.First),
//    SideFeeling("Душевная боль", sadnessColor200, CardState.First),
//    SideFeeling("Тоска", sadnessColor200, CardState.First),
//    SideFeeling("Горечь", sadnessColor200, CardState.First),
//)
//val funFeelingsLists = listOf<SideFeeling>(
//    SideFeeling("Умиротворенность", funColor200, CardState.First),
//    SideFeeling("Спокойствие", funColor200, CardState.First),
//    SideFeeling("Любопытство", funColor200, CardState.First),
//    SideFeeling("Ожидание", funColor200, CardState.First),
//    SideFeeling("Предвкушение", funColor200, CardState.First),
//    SideFeeling("Нетерпение", funColor200, CardState.First),
//    SideFeeling("Увлечение", funColor200, CardState.First),
//    SideFeeling("Изумление", funColor200, CardState.First),
//    SideFeeling("Благость", funColor200, CardState.First),
//    SideFeeling("Волнение", funColor200, CardState.First),
//    SideFeeling("Забота", funColor200, CardState.First),
//    SideFeeling("Симпатия", funColor200, CardState.First),
//    SideFeeling("Оживление", funColor200, CardState.First),
//    SideFeeling("Принятие", funColor200, CardState.First),
//    SideFeeling("Восторг", funColor200, CardState.First),
//    SideFeeling("Счастье", funColor200, CardState.First),
//    SideFeeling("Ликование", funColor200, CardState.First),
//    SideFeeling("Вера", funColor200, CardState.First),
//)
//val loveFeelingsLists = listOf<SideFeeling>(
//    SideFeeling("Благодарность", loveColor200, CardState.First),
//    SideFeeling("Искренность", loveColor200, CardState.First),
//    SideFeeling("Дружелюбие", loveColor200, CardState.First),
//    SideFeeling("Вдохновение", loveColor200, CardState.First),
//    SideFeeling("Гордость", loveColor200, CardState.First),
//    SideFeeling("Симпатия", loveColor200, CardState.First),
//    SideFeeling("Нежность", loveColor200, CardState.First),
//    SideFeeling("Блаженство", loveColor200, CardState.First),
//    SideFeeling("Безопасность", loveColor200, CardState.First),
//    SideFeeling("Доверие", loveColor200, CardState.First),
//    SideFeeling("Теплота", loveColor200, CardState.First),
//    SideFeeling("Доброта", loveColor200, CardState.First),
//    SideFeeling("Восхищение", loveColor200, CardState.First),
//    SideFeeling("Очарование", loveColor200, CardState.First),
//)
