package questions;
import java.util.Scanner;
abstract class Shape{
	public abstract void draw();
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class Q6 {
	static Scanner input = new Scanner(System.in);
	public static int whatToDo() {
		System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
		int toDo = input.nextInt();
		return toDo;
	}
	public static void main(String[] args) {
		Line l = new Line();
		Rect r = new Rect();
		Circle c = new Circle();
		int drawing[] = new int[100];
		int count = 0;
		for(boolean checkEnd = false; checkEnd == false;) {
			int toDo = whatToDo();
			switch(toDo) {
			case 1:
				System.out.print("���� ���� Line(1), Rect(2), Circle(3)>>");
				switch(input.nextInt()) {
				case 1:
					drawing[count] = 1;
					count++;
					break;
				case 2:
					drawing[count] = 2;
					count++;
					break;
				case 3:
					drawing[count] = 3;
					count++;
					break;
				default:
					System.out.println("�߸� �ԷµǾ����ϴ�.");
					break;
				}
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
				int delete = input.nextInt() - 1;
				if(delete<count) {
					for(int i=delete;i<count;i++) {
						drawing[delete] = drawing[delete + 1];
					}
					drawing[count] = 0;
					count--;
				}
				else System.out.println("������ �� �����ϴ�.");
				break;
			case 3:
				for(int i=0;i<count;i++) {
					switch(drawing[i]) {
					case 1:
						l.draw();
						break;
					case 2:
						r.draw();
						break;
					case 3:
						c.draw();
						break;
					default:
						System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
						break;
					}
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�...");
				checkEnd = true;
				break;
			default:
				System.out.println("�߸� �ԷµǾ����ϴ�.");
				break;
			}
		}
	}
}
