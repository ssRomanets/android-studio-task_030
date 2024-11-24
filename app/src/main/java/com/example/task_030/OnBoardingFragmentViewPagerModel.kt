package com.example.task_030

import java.io.Serializable

class OnBoardingFragmentViewPagerModel (
    val authorNames: String,
    val pictureName: String,
    val imageView: Int
): Serializable {
    companion object {
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewPagerModel(
                "И.К. Айвазовский",
                "Спокойное море.",
                (R.drawable.picture1)
            ),
            OnBoardingFragmentViewPagerModel(
                "И.К. Айвазовский",
                "Кораблекрушение.",
                (R.drawable.picture2)
            ),
            OnBoardingFragmentViewPagerModel(
                "И.К. Айвазовский",
                "Вечер в Крыму.",
                (R.drawable.picture3)
            ),
            OnBoardingFragmentViewPagerModel(
                "И.К. Айвазовский",
                "Волна.",
                (R.drawable.picture4)
            ),
            OnBoardingFragmentViewPagerModel(
                "И.К. Айвазовский",
                "Радуга.",
                (R.drawable.picture5)
            ),
            OnBoardingFragmentViewPagerModel(
                "Клод Моне",
                "Прогулка по скалам.",
                (R.drawable.picture6)
            ),
            OnBoardingFragmentViewPagerModel(
                "Клод Моне",
                "Сад.",
                (R.drawable.picture7)
            ),
            OnBoardingFragmentViewPagerModel(
                "Клод Моне",
                "Водяные Лилии.",
                (R.drawable.picture8)
            ),
            OnBoardingFragmentViewPagerModel(
                "Клод Моне",
                "Мост на пруду.",
                (R.drawable.picture9)
            ),
            OnBoardingFragmentViewPagerModel(
                "Клод Моне",
                "Поля.",
                (R.drawable.picture10)
            ),
        )
    }
}