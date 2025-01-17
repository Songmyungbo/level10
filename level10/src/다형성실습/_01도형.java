package 다형성실습;

import java.util.Random;

abstract class Shape{
	String name;
	String color;
	double size;
	
	public Shape(String name, String color, int size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}
	abstract void draw(); //어떤 도형인지 모르니깐
}

class Line extends Shape{

	public Line(String name, String color, int size) {
		super(name, color,size);
	}
	@Override
	void draw() {
		System.out.println("선을 긋는다");
		System.out.printf("%s %s (%.2f)\n",color,name,size);
	}
}

class Point extends Shape{

	public Point(String name, String color,int size) {
		super(name, color,size);
	}
	@Override
	void draw() {
		System.out.println("점을 찍는다");
		System.out.printf("%s %s (%.2f)\n",color,name,size);
	}
	
}

class Circle extends Shape{

	public Circle(String name, String color,int size) {
		super(name, color,size);
	}

	@Override
	void draw() {
		double circleSize = 3.14 * size * size;
		System.out.println("원을 그린다");
		System.out.printf("%s %s (%.2f)\n",color,name,circleSize);
	}
}
class Rect extends Shape{
	
	int height;
	int width;
	public Rect(String name, String color,int size) {
		super(name, color,size);
	}

	@Override
	void draw() {
		height = (int) size;
		width = (int)size;
		double rectSize = (height+width)*2;
		System.out.println("사각형을 그린다");
		System.out.printf("%s %s (%.2f)\n",color,name,rectSize);
	}
}
class Triangle extends Shape{

	public Triangle(String name, String color,int size) {
		super(name, color,size);
	}
	int height;
	int width;
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
		height = (int) size;
		width = (int)size;
		double triangleSize = (height*width)/ 2.0;
		System.out.printf("%s %s (%.2f)\n",color,name,triangleSize);
	}
}

public class _01도형 {
	public static void main(String[] args) {
		//모양도 랜덤하게 색깔 사이즈 랜덤하게 도형 10개를 출력하세요
		// 점 , 선 기존 size 출력
		// 원 , 네모, 세모 => size 넓이를 계산해서 출력
		
		String[] colors = {"파란색", "빨간색", "보라색","분홍색","노란색"};
		
		Shape[] list = new Shape[10];
		
		//[문제1] 10 랜덤하게 생성해서 출력하기 , 사이즈는 랜덤 1~10까지로 설정
		Random rd = new Random();
		
		for(int i = 0; i < list.length; i++) {
			int size = rd.nextInt(10)+1;
			String color = colors[rd.nextInt(colors.length)];
			int rdShape = rd.nextInt(5);
			
			if(rdShape == 0) {
				list[i] = new Line("직선",color,size);
			}else if(rdShape == 1) {
				list[i] = new Point("점",color,size);
			}else if(rdShape == 2) {
				list[i] = new Circle("원",color,size);
			}else if(rdShape == 3) {
				list[i] = new Rect("네모",color,size);
			}else if(rdShape == 4) {
				list[i] = new Triangle("삼각", color, size);
			}
		}
		System.out.println("[문제1]");
		for(Shape shape : list) {
			shape.draw();
		}
		//[문제2]
		System.out.println("[문제2]");
		for(Shape shape : list) {
			if(shape instanceof Circle) {
				shape.draw();
			}
		}
	}
}
