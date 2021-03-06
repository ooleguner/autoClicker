package clicker.helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class PageKeeper {

    Map<String, String> pages = new HashMap<String, String>();

    private PageKeeper() {
    }

    private static PageKeeper instance;

    public static synchronized PageKeeper getInstance() {
        if (instance == null) {
            instance = new PageKeeper();
        }
        return instance;
    }

    public Map<String, String> getPages() {
        return pages;
    }

    public void addPageToMap(String name, String title) {
        pages.put(name, title);
    }

    public void remotePageFromMap(String name, String title) {
        pages.remove(name);
    }

    public void openNewTab(WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("window.open()");
    }

    //temp
    public boolean flag = true;

}
