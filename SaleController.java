// 파일명: SaleController.java
package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sales") // 브라우저 주소창에 /api/sales를 입력하면 이쪽으로 연결됩니다.
public class SaleController {

    private final SaleRepository saleRepository;

    // 생성자를 통해 Repository(창고)를 관리소장(Controller)에게 전달합니다.
    public SaleController(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    // 1. Create (매출 등록)
    @PostMapping
    public Sale createSale(@RequestBody Sale sale) {
        return saleRepository.save(sale);
    }

    // 2. Read (전체 매출 내역 조회)
    @GetMapping
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    // 3. Delete (매출 기록 삭제)
    @DeleteMapping("/{id}")
    public void deleteSale(@PathVariable Long id) {
        saleRepository.deleteById(id);
    }
}