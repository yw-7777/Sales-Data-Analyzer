// 파일명: SaleRepository.java
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// SQL을 직접 짜지 않아도 JpaRepository가 save(), findAll(), deleteById() 등을 자동으로 생성합니다.
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    // 여기에 아무것도 안 적어도 기본적인 CRUD 기능이 모두 포함됩니다!
}