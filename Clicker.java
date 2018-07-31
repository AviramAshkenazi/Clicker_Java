import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicker {
    private static java.awt.Robot robot = null;

    public static void main (String[] args){
        {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		}
        WebDriver wddriver = new ChromeDriver();
        
        try {
            robot = new Robot ();
        } catch (AWTException e){
            e.printStackTrace();
        }

        click(150 , 300);
    }

    public static void click (int x, int y){
        robot.mouseMove(x, y);
        robot.delay(5);
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }

 
}