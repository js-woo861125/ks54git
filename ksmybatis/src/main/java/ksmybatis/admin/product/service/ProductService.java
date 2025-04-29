package ksmybatis.admin.product.service;

import java.util.List;

import ksmybatis.admin.product.domain.Product;

public interface ProductService {
	
	
	
	// 판매자가 등록한 상품 삭제
	
	boolean removeProductByProductCode(String productCode);
	
	
	//상품정보 수정
	void modifyProduct(Product product);
	
	// 상품정보 조회
	Product getProductInfoCode(String productCode);
	
	// 상품등록
	void addProduct(Product product);
	
	
	// 상품목록조회
	List<Product> getProductList();
	
	
}
