
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BaseClass {
	public static WebDriver driver;
	String data;
	
	public void fileStore(String sheetname , int rownum, int cellnum,String data) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Test\\Excel\\HotelData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream f = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\Test\\Excel\\HotelData.xlsx");
		workbook.write(f);
		}
	
	public String fileData(String sheetname , int rownum, int cellnum) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Test\\Excel\\HotelData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
		if (cellType==1) {
		data = cell.getStringCellValue();	
			
			
		}
		if (cellType==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				data = format.format(dateCellValue);
			}
			else{
				double value = cell.getNumericCellValue();
				long l = (long) value;
				data = String.valueOf(l);
				
			}
			
		}
		
		return data;

	}
	public static void getDriverChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void getDriverFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	public static void getDriverEgde() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}

	
	public static void loadUrl(String url) {
		driver.get(url);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public void type(WebElement element,String data ) {
		element.sendKeys(data);

	}
	public void click(WebElement element) {
		element.click();

	}
	public WebElement findElementById(String data) {
		WebElement element = driver.findElement(By.id(data));
		return element;

	}
	public WebElement findElementByName(String data) {
		WebElement element = driver.findElement(By.name(data));
		return element;


	}
	public WebElement findElementByClassName(String data) {
		WebElement element = driver.findElement(By.className(data));
		return element;


	}
    public WebElement findElementByXpath(String data) {
    	WebElement element = driver.findElement(By.xpath(data));
    	return element;

	}
	public String getEnteredUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}
	public String getAttribute(WebElement element) {
		String data = element.getAttribute("value");
		return data;

	}
	public String getAttribute(WebElement element,String attributeName) {
		String data = element.getAttribute(attributeName);
		return data;

	}
	public void selectOptionByText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);

	}
	public void selectOptionByIndex(WebElement element, int data) {
		Select select = new Select(element);
		select.selectByIndex(data);

	}
	public void tuppeJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value','"+data+"')", element);
		
	}
	public void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0],click()", element);
		
	}
	public static void quitBrowser() {
	
		driver.quit();
	}
	
	public void clear(WebElement element) {
		element.clear();
		
	}
	
	public void alertSwtichToAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public void alertSwtichToDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	
	public void sleep(long misec) throws InterruptedException {
		Thread.sleep(misec);

	}
	
	public void dragAndDrop(WebElement org, WebElement dst ) {
		Actions actions = new  Actions(driver);
		actions.dragAndDrop(org, dst).perform();
	}
	
	public void mouseOver(WebElement element) {
		Actions actions = new  Actions(driver);
		actions.moveToElement(element);
				
	}
	
	public void windowHandels() {
		String parentWindow = driver.getWindowHandle();
		Set<String> childwindow = driver.getWindowHandles();
		for (String x : childwindow) {
			if (!parentWindow.equals(x)) {
				driver.switchTo().window(x);
    }
			
			
		}

	}
	

}
