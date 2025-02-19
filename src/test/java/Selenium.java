import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
    @Test
    void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Automatically downloads correct driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://seang454.github.io/exercise-tailwind/");

        System.out.println("Page Title: " + driver.getTitle());// Print title for validation
        Thread.sleep(5000);

        driver.quit(); // Ensure browser closes
    }
}
