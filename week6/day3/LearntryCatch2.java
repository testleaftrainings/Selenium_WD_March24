package sample;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearntryCatch2 {
	public static void main(String[] args)  {

		int a=10;
		int[] num= {1,2,3,4,5,6};

		try {
			System.out.println(num[7]);
		} finally {
			// TODO: handle finally clause
			System.out.println("Program execute successfully");
		}
		
	}
}
