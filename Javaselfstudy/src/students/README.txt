1. String형의 학과와 정수형의 학번을 필드로 선언
	Student클래스의 main메소드에서 Student객체를 생성하여 학과와 학번 필드에 적단한 값을 입력 후 출력
	
2. 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성
	- 필드를 모두 private로 하고, getter와 setter를 구현
	- Student 클래스의 main 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
	
[접근 제한자]
1. public
   - 적용대상: 클래스, 필드, 생성자, 메소드
   - 접근제한: 없음
   
2. protected
   - 적용대상: 필드, 생성자, 메소드, 클래스(x)
   - 접근제한: 
     -> 자식 클래스에서는 접근 가능
     -> 다른 패키지에 소속된 클래스에서는 제한(자식이 아닌 클래스)
   
3. default : 접근 제한자를 명시하지 않으면 디폴트
   - 적용대상: 클래스, 필드, 생성자, 메소드
   - 접근제한:
     -> 자신이 속한 패키지에서만 접근 가능 
     -> 다른 패키지에 소속된 클래스
   
4. private
   - 적용대상: 필드, 생성자, 메소드
   - 접근제한: 
     -> 자신이 속한 클래스에서만 접근 가능
     -> 모든 외부 클래스
     