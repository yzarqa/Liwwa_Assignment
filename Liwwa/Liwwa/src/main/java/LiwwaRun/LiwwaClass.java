package LiwwaRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class LiwwaClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://github.com/join");
		driver.manage().window().maximize();
		
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("python/cpython");
		searchbox.submit();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@href='/python/cpython']")).click();
		 
		 
		 String pageSource = driver.getPageSource();
		 
		 boolean build = pageSource.contains("https://camo.githubusercontent.com/75ac97a307bc08bbbed22ade5edd7c41c89f12ad27002b4741bcf8dba707c1a8/68747470733a2f2f7472617669732d63692e636f6d2f707974686f6e2f63707974686f6e2e7376673f6272616e63683d6d6173746572");
	     System.out.println(" build passing:"+build);
		 
         boolean tests = pageSource.contains("https://github.com/python/cpython/workflows/Tests/badge.svg");
	     System.out.println(" Tests passing:"+tests);
	     
	     boolean pipelines = pageSource.contains("https://camo.githubusercontent.com/b168353bcd03a1db405192782cbda10b13aff19c2739fbd0a6b1fb1339f6f554/68747470733a2f2f6465762e617a7572652e636f6d2f707974686f6e2f63707974686f6e2f5f617069732f6275696c642f7374617475732f417a757265253230506970656c696e657325323043493f6272616e63684e616d653d6d6173746572");
	     System.out.println(" Azure Pipelines:"+pipelines);
	     
	     boolean codecov = pageSource.contains("https://camo.githubusercontent.com/b3cb7b6b6065dc28ba30666b884e8e2f672874263a0bd55de6c80cea22e2494a/68747470733a2f2f636f6465636f762e696f2f67682f707974686f6e2f63707974686f6e2f6272616e63682f6d61737465722f67726170682f62616467652e737667");
	     System.out.println(" codecov:"+codecov);
	     
	     boolean discourse = pageSource.contains("https://camo.githubusercontent.com/267218e698bef93d9e82f3c6aa1f9b70ad640bc3e8a73eb64feda3ff1afd1926/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f646973636f757273652d6a6f696e5f636861742d627269676874677265656e2e737667");
	     System.out.println(" discourse:"+discourse);
	     
	     driver.close();
	}

	private static void navigateTo(String string) {
		// TODO Auto-generated method stub
		
	}

}
