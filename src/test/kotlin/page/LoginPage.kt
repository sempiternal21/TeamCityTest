package page

import com.codeborne.selenide.Condition.exist
import com.codeborne.selenide.Selectors.byXpath
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideElement

class LoginPage {
    private val urlPage: String = "https://teamcity.jetbrains.com/"
    private val buttonLogin: SelenideElement = Selenide.element(byXpath("/html/body/div[2]/div[1]/div/div[4]/a/span/ng-transclude/span"))
    private val mainPage: MainPage = MainPage()

    fun openLoginPage(){
        Selenide.open(urlPage)
    }

    fun clickButtonLogin(){
        buttonLogin.click()
    }

    fun checkSuccessfulLogin(){
        mainPage.listOpenSourceProjects.shouldBe(exist)
    }
}