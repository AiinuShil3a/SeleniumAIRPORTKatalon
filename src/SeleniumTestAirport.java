import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;


class SeleniumTestAirport {
	
	WebDriver driver = null;
	
	@Test
	void testAir01() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		//Home
		driver.get("https://www.thaiairways.com/th_TH/rop/index.page");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//*[@id=\"1439966213483\"]/div[2]/div/div/div/div[1]/div[3]/div[2]/span/a")).click();
		String result1 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/article/h1")).getText();
		//Register-p1
		assertEquals("สมัครสมาชิก", result1);
		driver.findElement(By.xpath("//*[@id=\"cb_accept\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p2
		String result2 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div")).getText();
		assertEquals("ข้อมูลส่วนตัว", result2);
		driver.findElement(By.xpath("//*[@id=\"salutation\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"salutation\"]")).sendKeys("Mstr.");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Supphalak");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Maneepanpanit");
		driver.findElement(By.xpath("//*[@id=\"birth_day\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_day\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"birth_month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_year\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_year\"]")).sendKeys("2002");
		driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).sendKeys("JP");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).sendKeys("TH");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p3
		String result3 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]")).getText();
		assertEquals("ข้อมูลติดต่อ", result3);
		String result4 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[2]")).getText();
		assertEquals("ข้อมูลอีเมล", result4);
		String result5 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[3]")).getText();
		assertEquals("หมายเลขโทรศัพท์และโทรสาร", result5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"add_business\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_home\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("2514");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Santor");
		driver.findElement(By.xpath("//*[@id=\"address3\"]")).sendKeys("Thamaka");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[225]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/option[23]")).click();
		driver.findElement(By.xpath("//*[@id=\"post_code\"]")).sendKeys("71120");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Shil3aiinu@outlook.com");
		driver.findElement(By.xpath("//*[@id=\"confirm_email\"]")).sendKeys("Shil3aiinu@outlook.com");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"email_info_form\"]/div[2]/div[3]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email_info_form\"]/div[2]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"phone1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"phone1\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"country_code1\"]")).sendKeys("66");
		driver.findElement(By.xpath("//*[@id=\"area_code1\"]")).sendKeys("66");
		driver.findElement(By.xpath("//*[@id=\"phone_number1\"]")).sendKeys("087");
		driver.findElement(By.xpath("//*[@id=\"extension1\"]")).sendKeys("8546541");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p4
		String result6 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]")).getText();
		assertEquals("ความประสงค์ของท่านกับบริการบนเครื่อง", result6);
		String result7 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[2]")).getText();
		assertEquals("ความประสงค์ในการรับข้อมูลข่าวสาร", result7);
		String result8 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[3]")).getText();
		assertEquals("รายละเอียดการล็อคอิน", result8);
		String result9 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[4]")).getText();
		assertEquals("ผู้แนะนำ", result9);
		driver.findElement(By.xpath("//*[@id=\"seat_pref\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"seat_pref\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"meal_pref\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"meal_pref\"]/option[14]")).click();
		driver.findElement(By.xpath("//*[@id=\"language_pref\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"language_pref\"]/option[2]")).click();
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("C2373809");
		driver.findElement(By.xpath("//*[@id=\"confirm_pin\"]")).sendKeys("C2373809");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p5
		String result10 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]")).getText();
		assertEquals("ข้อมูลส่วนตัว", result10);
		String result11 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]")).getText();
		assertEquals("รายละเอียดการล็อคอิน", result11);
		String result12 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[2]")).getText();
		assertEquals("ข้อมูลติดต่อ", result12);
		String result13 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[3]")).getText();
		assertEquals("ข้อมูลอีเมล", result13);
		String result14 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[4]")).getText();
		assertEquals("หมายเลขโทรศัพท์และโทรสาร", result14);
		String result15 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[5]/div/div[1]")).getText();
		assertEquals("ความประสงค์ของท่านกับบริการบนเครื่อง", result15);
		String result16 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[5]/div/div[2]")).getText();
		assertEquals("ความประสงค์ในการรับข้อมูลข่าวสาร", result16);   
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(SrcFile, new File(".//Screenshot/screen.png"));
		Thread.sleep(3000);
		driver.close();
		
	}
	
	
	@Disabled
	void testAir02Error() throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		//Home
		driver.get("https://www.thaiairways.com/th_TH/rop/index.page");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"1439966213483\"]/div[2]/div/div/div/div[1]/div[3]/div[2]/span/a")).click();
		String result1 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/article/h1")).getText();
		//Register-p1
		assertEquals("สมัครสมาชิก", result1);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		String resultError1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/p/div/div/div[2]/form/div/div/b")).getText();
		assertEquals("Please accept all Royal Orchid Plus Terms and Conditions and Privacy Notice before continuing enrolment.", resultError1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"cb_accept\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p2
		String result2 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div")).getText();
		assertEquals("ข้อมูลส่วนตัว", result2);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		String resultError2 = driver.findElement(By.xpath("//*[@id=\"parsley-id-6\"]/li")).getText();
		assertEquals("This value is required.", resultError2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"salutation\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"salutation\"]")).sendKeys("Mstr.");
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Supphalak");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Maneepanpanit");
		driver.findElement(By.xpath("//*[@id=\"birth_day\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_day\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"birth_month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_year\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"birth_year\"]")).sendKeys("2002");
		driver.findElement(By.xpath("//*[@id=\"female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).sendKeys("JP");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nationality\"]")).sendKeys("TH");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p3
		String result3 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]")).getText();
		assertEquals("ข้อมูลติดต่อ", result3);
		String result4 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[2]")).getText();
		assertEquals("ข้อมูลอีเมล", result4);
		String result5 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[3]")).getText();
		assertEquals("หมายเลขโทรศัพท์และโทรสาร", result5);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		String resultError3 = driver.findElement(By.xpath("//*[@id=\"parsley-id-15\"]/li")).getText();
		assertEquals("This value is required.", resultError3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"add_business\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"add_home\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("2514");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Santor");
		driver.findElement(By.xpath("//*[@id=\"address3\"]")).sendKeys("Thamaka");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]/option[225]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/option[23]")).click();
		driver.findElement(By.xpath("//*[@id=\"post_code\"]")).sendKeys("71120");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Shil3aiinu@outlook.com");
		driver.findElement(By.xpath("//*[@id=\"confirm_email\"]")).sendKeys("Shil3aiinu1234@outlook.com");
		driver.findElement(By.xpath("//*[@id=\"email_info_form\"]/div[2]/div[3]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email_info_form\"]/div[2]/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"phone1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"phone1\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"country_code1\"]")).sendKeys("66");
		driver.findElement(By.xpath("//*[@id=\"area_code1\"]")).sendKeys("66");
		driver.findElement(By.xpath("//*[@id=\"phone_number1\"]")).sendKeys("087");
		driver.findElement(By.xpath("//*[@id=\"extension1\"]")).sendKeys("8546541");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		String resultError4 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/p/div/div/div[2]/form/div/div/b")).getText();
		assertEquals("อีเมลที่ท่านใส่ไม่เหมือนกัน กรุณาลองใหม่อีกครั้ง", resultError4);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"confirm_email\"]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Shil3aiinu@outlook.com");
		driver.findElement(By.xpath("//*[@id=\"confirm_email\"]")).sendKeys("Shil3aiinu@outlook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p4
		String result6 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]")).getText();
		assertEquals("ความประสงค์ของท่านกับบริการบนเครื่อง", result6);
		String result7 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[2]")).getText();
		assertEquals("ความประสงค์ในการรับข้อมูลข่าวสาร", result7);
		String result8 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[3]")).getText();
		assertEquals("รายละเอียดการล็อคอิน", result8);
		String result9 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[4]")).getText();
		assertEquals("ผู้แนะนำ", result9);
		driver.findElement(By.xpath("//*[@id=\"seat_pref\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"seat_pref\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"meal_pref\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"meal_pref\"]/option[14]")).click();
		driver.findElement(By.xpath("//*[@id=\"language_pref\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"language_pref\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("C2373809");
		driver.findElement(By.xpath("//*[@id=\"confirm_pin\"]")).sendKeys("C2373809C1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		String resultError5 = driver.findElement(By.xpath("/html/body/div[5]/div[2]/p/div/div/div[2]/form/div/div/b")).getText();
		assertEquals("กรุณาใส่ ยืนยันรหัสประจำตัว ให้ตรงกับ รหัสประจำตัว", resultError5);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pin\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"confirm_pin\"]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pin\"]")).sendKeys("C2373809");
		driver.findElement(By.xpath("//*[@id=\"confirm_pin\"]")).sendKeys("C2373809");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"btn_next\"]")).click();
		//Register-p5
		String result10 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]/div/div[1]")).getText();
		assertEquals("ข้อมูลส่วนตัว", result10);
		String result11 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]")).getText();
		assertEquals("รายละเอียดการล็อคอิน", result11);
		String result12 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[2]")).getText();
		assertEquals("ข้อมูลติดต่อ", result12);
		String result13 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[3]")).getText();
		assertEquals("ข้อมูลอีเมล", result13);
		String result14 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[4]")).getText();
		assertEquals("หมายเลขโทรศัพท์และโทรสาร", result14);
		String result15 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[5]/div/div[1]")).getText();
		assertEquals("ความประสงค์ของท่านกับบริการบนเครื่อง", result15);
		String result16 = driver.findElement(By.xpath("//*[@id=\"rop-app\"]/div/div/div[1]/div[2]/div/div/div[5]/div/div[2]")).getText();
		assertEquals("ความประสงค์ในการรับข้อมูลข่าวสาร", result16);
		Thread.sleep(3000);
		driver.close();

	}
}
