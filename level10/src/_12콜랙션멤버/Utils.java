package _12콜랙션멤버;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	private Utils() {};
	private static Utils instance;
	
	public static Utils getInstance() {
		if(instance == null) instance = new Utils();
		return instance;
	}
	private final String CUR_PATH = System.getProperty("user.dir") + "\\src\\" + Utils.class.getPackageName() + "\\";
	
	
	
	private Scanner sc = new Scanner(System.in);

	public int getValues(String msg, int start, int end) {
		int num = 0;
		while(true) {
			try {
				System.out.println(msg);
				num = sc.nextInt();
				if(num < start || num > end) {
					System.out.println("메뉴 선택오류 다시 선택하세요");
					continue;
				}
				return num;
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요!");
				sc.nextLine();
				continue;
			}
		}
	}

	public String getStringValue(String msg) {
		String str;
		System.out.println(msg);
		str = sc.next();
		sc.nextLine();
		return str;
	}

	public void saveDataToFile(String fileName, String data) {
		String filePath = CUR_PATH + fileName;
		 try(FileWriter fw = new FileWriter(filePath)){
			 fw.write(data);
			 System.out.println(filePath + "저장성공!");
		 }catch(Exception e){
			 System.out.println(filePath + "저장실패!");
			 e.printStackTrace();
		 }
	}

	public String loadDataToFile(String fileName) {
		String filePath = CUR_PATH + fileName;
		String result = "";
		try(FileReader fd = new FileReader(filePath); BufferedReader br = new BufferedReader(fd)){
			while(true) {
				String data = br.readLine();
				if(data == null) {
					break;
				}
				result += data+"\n";
			}
			return result;
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다");
		}catch(IOException e) {
			System.out.println("파일 읽기 실패");
		}
		return null;
	}
	
	
	
	
	
	
}
