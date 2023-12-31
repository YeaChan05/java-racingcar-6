## 기능 목록 정리

~~1. 시행 횟수 입력.~~

- ~~시행 횟수는 숫자만 입력 가능.~~

2. ~~사용자 이름 입력.~~
   - ~~사용자는 여러명 입력 가능.~~
   - ~~,를 기준으로 사용자 여러명 입력.~~
   - ~~사용자의 이름은 5자 이하.~~
3. ~~각각의 사용자는 시행 횟수만큼 행위를 진행.~~
   - ~~행위는 전진 또는 정지만 가능.~~
   - ~~최종 결과는 전진 횟수가 가장 많은 사용자가 우승.~~
     - ~~우승자는 한명보다 많을 수 있음.~~
     - ~~시행이 종료되면 최종 우승자를 출력.~~
   - ~~행위가 진행 될 때마다 각 사용자가 진행한 횟수만큼 -가 출력됨.~~

## 도메인 분리

- ~~Stadium: 경주를 진행할 장소 → 1~~
  - ~~경주 횟수~~
  - ~~User: 경주를 진행하는 사용자 → n~~
    - ~~사용자 이름~~
    - ~~전진 횟수~~

### 유틸리티

- ~~InputManager~~
  - ~~입력 처리 담당.~~
  - ~~UsernameInputManager~~
    - ~~사용자 이름 입력 처리.~~
    - ~~글자수 및 빈 문자 예외 처리.~~
  - ~~GameCountInputManager~~
    - ~~게임 횟수 입력 처리.~~
    - ~~입력값이 숫자인지 확인.~~
    - ~~부적절한 입력인 경우 예외 처리.~~
- ~~OutputManager~~
  - ~~출력 처리 담당.~~
  - ~~SystemOutputManager~~
    - ~~시스템 사용자에게 필요한 출력 메세지 처리.~~
  - ~~RacingOutputManager~~
    - ~~경주 진행시 사용자의 전진 정도 출력 처리.~~
    - ~~경주 결과 출력 처리.~~
- ~~RandomNumberGenerator~~
  - ~~Randoms.pickNumberInRange()의 의존관계를 낮추기 위한 추상 클래스.~~
  - ~~SingleDigitNumberGenerator~~
    - ~~실제 User에서 사용할 랜덤값 호출 담당~~
