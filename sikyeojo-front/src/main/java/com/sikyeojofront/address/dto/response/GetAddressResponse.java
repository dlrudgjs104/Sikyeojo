package com.sikyeojofront.address.dto.response;

public record GetAddressResponse(
	Long id,
	String postCode,
	String baseAddress,
	String detailAddress,
	String alias,
	boolean isDefault
) {
}
