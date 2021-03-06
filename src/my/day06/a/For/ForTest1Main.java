package my.day06.a.For;

/*
 **** 반복문(loop) ==> for 문 ****
  
          ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
               ▣ 순서
    1) 초기화;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/

public class ForTest1Main {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println( (i+1)+".반복문");
		} // end of for------------------------------- 
		/*
		 1.반복문
		2.반복문
		3.반복문
		4.반복문
		5.반복문
		6.반복문
		7.반복문
		8.반복문
		9.반복문
		10.반복문
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
				
		for(int i=0; i<10; i+=1) {
			System.out.println( (i+1)+".반복문2");
		} // end of for------------------------------- 
		/*
		 1.반복문2
		2.반복문2
		3.반복문2
		4.반복문2
		5.반복문2
		6.반복문2
		7.반복문2
		8.반복문2
		9.반복문2
		10.반복문2
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i++) {
			System.out.println( i++ +".짝수 출력");	// i=0, 
		} // end of for-------------------------------
		/*
		 i++ 
		 0.짝수 출력
		2.짝수 출력
		4.짝수 출력
		6.짝수 출력
		8.짝수 출력
		 
		 ++i
		 1.안녕 이클립스
		3.안녕 이클립스
		5.안녕 이클립스
		7.안녕 이클립스
		9.안녕 이클립스		 
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");

		for(int i=0; i<10; i+=2) { 
			System.out.println( (i+1) +".홀수 출력");	// i=0, 
		} // end of for-------------------------------
		
		/*
		1.홀수 출력
		3.홀수 출력
		5.홀수 출력
		7.홀수 출력
		9.홀수 출력
		 
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");

		for(int i=0,j=0; i<10; i++,j+=2) {
			System.out.println((j+1)+".10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)");			
		}
		
		/* 10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		1.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		3.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		5.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		7.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		9.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		11.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		13.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		15.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		17.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		19.10번 반복하면서(i<10) 홀수만 출력하고 싶을 때(j+=2)
		 
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) {
			System.out.println(i+".숫자가 1씩 감소하는 반복문");
		}
		/*
		 10.숫자가 감소하는 반복문
		9.숫자가 감소하는 반복문
		8.숫자가 감소하는 반복문
		7.숫자가 감소하는 반복문
		6.숫자가 감소하는 반복문
		5.숫자가 감소하는 반복문
		4.숫자가 감소하는 반복문
		3.숫자가 감소하는 반복문
		2.숫자가 감소하는 반복문
		1.숫자가 감소하는 반복문 
			
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-=1) {
			System.out.println(i+".숫자가 1씩 감소하는 반복문2");
		}
		/*
		 10.숫자가 1씩 감소하는 반복문2
		9.숫자가 1씩 감소하는 반복문2
		8.숫자가 1씩 감소하는 반복문2
		7.숫자가 1씩 감소하는 반복문2
		6.숫자가 1씩 감소하는 반복문2
		5.숫자가 1씩 감소하는 반복문2
		4.숫자가 1씩 감소하는 반복문2
		3.숫자가 1씩 감소하는 반복문2
		2.숫자가 1씩 감소하는 반복문2
		1.숫자가 1씩 감소하는 반복문2
		 */
				
		
		
		System.out.println("\n~~~~~~ 호호 ~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) {
			if(i%2 != 0) {//i를 2로 나누었을때의 나머지
				System.out.println(i+".반복횟수가 10번이되 홀수만 출력하기");
			}
		}
		
		/*
		 9.
		 
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i-=2) {
			System.out.println((i-1)+".5번 반복하며 출력하되 홀수만 출력하기");
		}
		/*
		 9.5번 반복하며 출력하되 홀수만 출력하기
		7.5번 반복하며 출력하되 홀수만 출력하기
		5.5번 반복하며 출력하되 홀수만 출력하기
		3.5번 반복하며 출력하되 홀수만 출력하기
		1.5번 반복하며 출력하되 홀수만 출력하기
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) {
			System.out.println((i-1)+".5번 반복하며 출력하되 홀수만 출력하기");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=10; i>0; i--) {
			System.out.println(--i+".5번 반복하며 출력하되 홀수만 출력하기2"); //먼저 1 감소시키고 출력문 출력
		}
		/*
		 9.5번 반복하며 출력하되 홀수만 출력하기2
		7.5번 반복하며 출력하되 홀수만 출력하기2
		5.5번 반복하며 출력하되 홀수만 출력하기2
		3.5번 반복하며 출력하되 홀수만 출력하기2
		1.5번 반복하며 출력하되 홀수만 출력하기2
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");

		for(int i=0,j=9; i<5; ++i, j-=2) {
			System.out.println(j+".5번 반복하며 홀수만 출력하기3");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~");
		
		int n=0;
		
		for(; n<5; n++) {
			System.out.println((n+1)+".정재현");
		}
		
		System.out.println("for문 밖에서 변수 초기화를 하는 경우" + "\n"
						+ "n => " +n);	//5
		
		System.out.println("\n======프로그램 종료======");
		
		
		
	}

}
