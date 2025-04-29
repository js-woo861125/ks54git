package ksmybatis.admin.product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.product.domain.Product;

@Mapper
public interface ProductMapper {
	// 상품삭제(상품코드)
	int removeProductByCode(String productCode);
	
	// 판매자가 등록한 상품 삭제
	int removeProductBySellerId(String sellerId);
	
	
	//상품정보수정
	int modifyProduct(Product product);
	
	//상품정보조회
	Product getProductInfoCode(String productCode);
	
	//상품등록
	int addProduct(Product product);
	
	//상품목록 조회
	List<Product> getProductList();
}
