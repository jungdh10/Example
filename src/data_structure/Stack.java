package data_structure;

import java.util.Scanner;

public class Stack {
	//push 작업:1, pop 작업:2, stack 출력 작업: 그 외
	//j: push, pop 작업 선택 변수
	
	static int[] stack = new int[5];
	static int top = -1;
	
	
	static int push(int a) {
		top++;
		if(top >= 5) {
			System.out.print("Overflow\n");
			top--;
			return -1;
		}
		stack[top] = a;
		return 0;
	}
	
	
	
	static int pop() {
		int b;
		if(top < 0) {
			System.out.print("Underflow\n");
			return -1;
		}
		b = stack[top];
		top--;
		return b;
	}
	
	

	public static void main(String[] args) {
		
		while(true) {
			int i, j, k;
			Scanner sc1 = new Scanner(System.in);
			System.out.print("작업을 선택하세요.");
			j = sc1.nextInt();
			if(j == 1) {
				Scanner sc2 = new Scanner(System.in);
				System.out.print("삽입할 숫자를 입력하세요.");
				k = sc2.nextInt();
				i = push(k);
				if(i == -1) {
					break;
				}
				
			}else if(j == 2) {
				i = pop();
				if(i == -1) {
					break;
				}else {
					System.out.printf("제거한 자료는 %d 입니다.\n", i);
				}
				
			}else {
				break;
			}	
		}
		
		
		if(top < 0) {
			System.out.print("스택에 자료가 없습니다.");
		}else {
			System.out.print("스택 자료 출력: ");
			for(int p = top; p >= 0; p--) {
				System.out.printf("%d\t", stack[p]);
			}
		}
		

	}

}
