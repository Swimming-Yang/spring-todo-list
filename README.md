# 📝 Spring Todo List

Spring Boot를 학습하며 만든 간단한 할 일 목록 웹 애플리케이션입니다.  
Spring MVC의 흐름과 Thymeleaf 템플릿 엔진, JPA 기초를 익히는 데 목적이 있습니다.

---

## 🚀 프로젝트 개요

- Spring Boot 기반 웹 프로젝트
- 기본적인 웹 흐름: Controller → View 구조 체험
- 추후 할 일 등록/삭제/목록 기능 추가 예정

---123

## 🛠 사용 기술 스택

| 구분        | 기술                       |
|-------------|----------------------------|
| Language    | Java 17                    |
| Framework   | Spring Boot 3.5.x          |
| Template    | Thymeleaf                  |
| ORM         | Spring Data JPA            |
| DB          | H2 (in-memory)             |
| Build Tool  | Gradle (Kotlin DSL)        |
| IDE         | IntelliJ IDEA              |

---

## 🗓 프로젝트 이력 및 버전

| 날짜         | 버전     | 주요 업데이트 내용                                            |
|--------------|----------|---------------------------------------------------------------|
| 2025-07-12   | v0.1.0   | 프로젝트 생성, 기본 구조 설정, `/` 요청 시 "Hello Spring!" 출력 |
| 예정          | v0.2.0   | Todo 엔티티 생성, 목록 출력 기능 추가 예정                     |
| 2025-07-13   | v0.3.0   | 등록 및 삭제 기능 구현                                 |
| 예정          | v1.0.0   | CRUD 완성(07-13 구현) UI 개선, 코드 리팩토링                            |
---

## 📂 프로젝트 실행 방법

```bash
# 프로젝트 클론
git clone https://github.com/Swimming-Yang/spring-todo-list.git

# IntelliJ에서 build.gradle.kts 열기 → 프로젝트 import

# 실행 (터미널 또는 IntelliJ)
./gradlew bootRun
