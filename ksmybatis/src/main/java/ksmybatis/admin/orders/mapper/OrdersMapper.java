package ksmybatis.admin.orders.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper {
	// 주문이력 삭제(상품코드)
	int revoceOrderItemsByProductCode(String productCode);
	
	// 주문이력 삭제(회원아이디)
	int removeOrdersByCustomerId(String customerId);
	
	// 주문 상세이력 삭제
	int removeOrderItemByNum(List<String> ordersNumList);
	
	// 구매이력 번호 조회
	List<String> getOrdersNumByCustomerId(String customerId);
	
	// 판매자가 등록한 상품을 구매한 이력 삭제
	int removerOrderItemsBySellerId(String sellerId);
}
