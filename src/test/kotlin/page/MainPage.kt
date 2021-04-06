package page

import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement

class MainPage {
    val listOpenSourceProjects: SelenideElement = Selenide.element(byXpath("//*[text()=\"Open-source projects\"]"))
}