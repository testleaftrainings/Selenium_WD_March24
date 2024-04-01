package week3.day1;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Open incognito mode");
	}
	public void clearCache() {
		System.out.println("Clear the cookies");
	}
	public static void main(String[] args) {
		Chrome chromeBrowser=new Chrome();
		chromeBrowser.openIncognito();
		chromeBrowser.clearCache();
		chromeBrowser.navigateBack();
		chromeBrowser.openURL();
		chromeBrowser.closeBrowser();
		System.out.println(chromeBrowser.browserName);
		System.out.println(chromeBrowser.browserVerion);
	}
}
