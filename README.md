# JUnitTest

Spring Boot와 JUnit 테스트를 연습하는 프로젝트입니다. 저장소 루트가 하나의 Gradle 프로젝트이며, Java 17을 사용합니다.

## IntelliJ에서 열기

1. `JUnitTest` 루트 폴더를 프로젝트로 엽니다.
2. Gradle 프로젝트를 불러오고 Project SDK와 Gradle JVM을 JDK 17로 설정합니다.
3. Gradle 배포판은 프로젝트에 포함된 Wrapper를 사용합니다.

## 테스트 실행

Windows 터미널에서 저장소 루트를 기준으로 실행합니다.

```powershell
.\gradlew.bat test
```

macOS 또는 Linux에서는 `./gradlew test`를 실행합니다. 최초 실행 시 Gradle과 의존성을 다운로드할 수 있습니다.

IntelliJ에서는 테스트 클래스 또는 메서드 왼쪽의 실행 버튼을 눌러도 됩니다.

## 연습할 파일

- `src/main/java/com/example/Calculator.java`: 계산기 로직
- `src/test/java/com/example/CalculatorTest.java`: Spring을 띄우지 않는 단위 테스트. 결과와 예외를 검증합니다.
- `src/main/java/com/example/demo/DemoApplication.java`: Spring Boot 시작점
- `src/test/java/com/example/demo/DemoApplicationTests.java`: `@SpringBootTest`로 Spring 컨텍스트 기동을 검증합니다.

직접 테스트를 추가하며 `given / when / then`, `assertEquals`, `assertThrows`를 연습할 수 있습니다.

## 애플리케이션 실행

```powershell
.\gradlew.bat bootRun
```

현재는 기본 Spring Boot Starter만 사용합니다. 웹 서버나 HTTP API는 아직 추가하지 않았습니다.
