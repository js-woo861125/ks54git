package ksmybatis.admin.vendor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmybatis.admin.vendor.domain.Vendor;

@Mapper
public interface VendorMapper {
	
	// 거래처별 상품 현황 조회
	List<Vendor> getProductListByVendor();
	

	// 담당자 아이디로 거래처 삭제
	int removeVendorBysellerId(String sellerId);
	
	
	// 거래처 목록 조회
	
	List<Vendor> getVendorList();
	
	
	
}
