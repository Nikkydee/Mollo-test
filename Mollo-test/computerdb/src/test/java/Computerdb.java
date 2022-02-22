
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static java.lang.Thread.*;
import java.lang.Thread;



public class Computerdb {

        public static void main(String[] args) {
            // declaration and instantiation of objects/variables
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\adenike.olapetan\\Documents\\computerdb\\driver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            String baseUrl = "https://computer-database.herokuapp.com/computers";

            // launch Fire fox and direct it to the Base URL
            driver.get(baseUrl);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Create a new computer
            driver.findElement(By.xpath("//a[@id='add']")).click();

            

            driver.findElement(By.xpath("\"//input[@id='name']\"")).sendKeys("ASCII");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//select[@id='company']")).sendKeys("IBM");
            driver.findElement(By.xpath("//input[@value='Create this computer']")).click();
            //close Fire fox
                driver.close();

            }
        }

