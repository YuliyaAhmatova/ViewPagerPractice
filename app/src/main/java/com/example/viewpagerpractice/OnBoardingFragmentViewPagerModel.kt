package com.example.viewpagerpractice

import java.io.Serializable

class OnBoardingFragmentViewPagerModel(
    val title: String?,
    val imageView: Int?,
    val checkButton: Boolean?,
) : Serializable {

    companion object {
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewPagerModel(
                "Вас приветсвует Х-банк!\n" +
                        "\nИнновационные финансовые решения: Наш банк предлагает широкий спектр " +
                        "современных услуг, включая удобные мобильные приложения, онлайн-банкинг и " +
                        "персонализированные кредитные продукты, чтобы удовлетворить потребности " +
                        "каждого клиента.",
                R.drawable.one,
                true
            ),
            OnBoardingFragmentViewPagerModel(
                "Безопасность и доверие: Мы используем передовые технологии защиты данных и " +
                        "шифрования, чтобы гарантировать безопасность ваших финансов. Наша команда " +
                        "профессионалов всегда готова предоставить прозрачную информацию и поддержку.",
                R.drawable.two,
                true
            ),
            OnBoardingFragmentViewPagerModel(
                "Социальная ответственность: Мы стремимся быть активными участниками местных сообществ," +
                        " поддерживая благотворительные инициативы и программы финансовой грамотности," +
                        " чтобы помочь людям лучше управлять своими финансами.",
                R.drawable.three,
                false
            ),
        )
    }
}