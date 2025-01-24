package _17쓰레드;

import java.util.Scanner;

class SingASong implements Runnable{

	int max;
	public SingASong(int max) {
		this.max = max;
	}
	
	@Override
	public void run() {
		String somg = "%s : %d + %d는 귀요미";
		for(int i = 1; i <= max; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("내 노래는 좋아~");
				return;
			}
			System.out.printf("%s \n", 
					String.format(somg, Thread.currentThread().getName(),i,i));
		}
	}
	
}

public class _04쓰레드이론04 {

	public static void main(String[] args) {
		
		Thread mySongThread = new Thread(new SingASong(10));
		mySongThread.setName("귀요미송");
		
		mySongThread.start();
		
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String input = sc.nextLine();
				
				if(input.equals("끝")) {
					System.out.println("노래가 끝났니?");
					System.out.println(mySongThread.isAlive() ? "아니" : "응 끝났어");
				}
				if(input.equals("멈춰")) {
					System.out.println("노래가 시끄럽니?");
//					mySongThread.stop();
//					mySongThread.suspend();
					mySongThread.interrupt();
					break;
				}
				if(input.equals("같이")) {
					System.out.println("나도 같이 껴줘");
					try {
						mySongThread.join(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("---------");
					break;
				}
			}
		}
	}
}
