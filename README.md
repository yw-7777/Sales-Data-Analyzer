# 📊 Sales Data Analyzer
**경영 데이터의 체계적 관리를 위한 Spring Boot 기반 CRUD 프로젝트**

## 🖥️ Project Overview
본 프로젝트는 경영학 전공자로서 비즈니스 현장의 데이터를 단순한 문서 관리가 아닌, 객체 지향 프로그래밍(Java)과 데이터베이스 매핑 기술(JPA)을 통해 효율적으로 관리하는 메커니즘을 이해하기 위해 구축되었습니다.

## 🛠️ Tech Stack
- **Language**: Java 17
- **Framework**: Spring Boot 3.x
- **ORM**: Spring Data JPA
- **Database**: H2 (In-Memory Database)

## 🏗️ Architecture (Spring CRUD)
본 프로젝트는 **MVC 패턴**을 기반으로 데이터의 흐름을 제어합니다.
1. **Entity (`Sale.java`)**: 매출 데이터(상품명, 단가, 수량 등)를 정의하고 비즈니스 로직(총액 계산)을 포함합니다.
2. **Repository (`SaleRepository.java`)**: 복잡한 SQL 작성 없이 데이터베이스와 상호작용하여 데이터의 영속성을 보장합니다.
3. **Controller (`SaleController.java`)**: 외부 HTTP 요청을 받아 CRUD(생성, 조회, 삭제) 기능을 수행하는 인터페이스 역할을 합니다.

## 📈 Key Insights
- **데이터 무결성**: 수동 입력 시 발생할 수 있는 오류를 Java 메서드(`getTotalPrice`)를 통해 자동화하여 계산의 정확성을 높였습니다.
- **확장성**: JPA를 활용함으로써 추후 다양한 데이터베이스(MySQL, Oracle 등)로의 전환이 용이하도록 설계했습니다.
