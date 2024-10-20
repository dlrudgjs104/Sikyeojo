package com.sikyeojogateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

	@Bean
	public RouteLocator prodRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
			// .route("bookstore-back", r -> r.path("/api/**")
			//         .uri("lb://book-store-back") // 로드밸런싱 활성화
			// )
			.route("sikyeojo-back", r -> r.path("/api/**")
				.uri("http://localhost:8083")
			)
			.route("sikyeojo-authentication", r -> r.path("/auth/**")
				.uri("http://localhost:8070")
			)
			.build();
	}

}
