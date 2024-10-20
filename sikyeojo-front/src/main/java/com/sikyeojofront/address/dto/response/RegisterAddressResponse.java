package com.sikyeojofront.address.dto.response;

public record RegisterAddressResponse(
	Long id,
	Long userId,
	String postCode,
	String baseAddress,
	String detailAddress,
	String alias
) {
}

