## 피드백 정리

1. 커밋 계정이 이상함
2. 파일의 끝에 newline이 추가되지 않음
    * POSIX 표준에 맞지 않고 변경이 없어도 File Change로 잡힐 수 있음.
3. 문자열 계산기임을 잘 명시할 수 있는 클래스 명으로 고치기
4. String 타입의 배열이므로 parsedInputs 등으로 고치기
5. if 조건을 2개로 나열하던 것을 || 연산자로 묶는 방법도 고려해보기
6. throw한 exception의 message를 추가해주기.
7. ArithmeticException 등은 0으로 나누는 시점에서 발생하기 때문에 굳이 throw 처리를 할 필요가 없다
8. 양이 적은 OpertatorService 인터페이스를 없애고 람다식으로 더 간결하게.
    *  BiFunction 
9. 불필요한 명시적 형변환에 특별한 이유가 있는지?
10. 취향차이이긴 하나 assertEquals말고 assertThat을 이용해보는 방법.
11. 전반적으로 유닛 테스트들의 가독성이 떨어지는 것 같음.
    * @MethodSource 등 다른 방법을 고려
12. 변수명은 조금 길어지더라도 풀어쓰기.
13. 지금은 연습 단계이기 때문에 간단한 int형도 Number 등으로 포장하는 연습을 해도 괜찮아보임.
    * 실무에서는 원시타입을 전부 포장해버리면 클래스 개수가 늘어나는 문제.    