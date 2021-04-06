import org.junit.Test
import page.LoginPage

class LoginAsGuestTest {
    var loginPage = LoginPage()
    @Test
    fun loginAsGuest(){
        loginPage.openLoginPage()
        loginPage.clickButtonLogin()
        loginPage.checkSuccessfulLogin()
    }
}