//package pages;
//
//
//import com.microsoft.playwright.Browser;
//import com.microsoft.playwright.BrowserType;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.Playwright;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class Set_UP{
//  Playwright playwright;
//  Browser browser;
//  Page page;
//  @BeforeMethod
//  public void setup(){
//     playwright= Playwright.create();
//     browser =playwright.chromium().launch(new BrowserType.LaunchOptions()
//              .setHeadless(false));   // ← ye line add karo, browser dikhega
//
//     page= browser.newPage();
//  }
//  @Test
//  public  void  login() throws InterruptedException {
//      page.navigate("https://www.saucedemo.com/");
//      page.locator("#user-name").fill("standard_user");
//
//
//      page.locator("#password").fill("secret_sauce");
//      page.click("#login-button");
//      Thread.sleep(50000);
//  }
//  @AfterMethod
//    public void teardown(){
//      browser.close();
//      playwright.close();
//      System.out.println("hello world");
//  }
//
//
//
//
//}