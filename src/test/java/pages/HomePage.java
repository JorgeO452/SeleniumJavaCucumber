package pages;

public class HomePage extends BasePage {

    public HomePage() {
        super(driver);
    }

    //Método para navegar a la URL
    public void navigateToURL() {
        navigateTo("https://www.bstackdemo.com/");
    }
}
