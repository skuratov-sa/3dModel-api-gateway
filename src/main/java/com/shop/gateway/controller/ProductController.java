package com.shop.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import ru.itone.cur.gateway.api.account.v1.ProductApi;
import ru.itone.cur.gateway.api.account.v1.ProductsApi;
import ru.itone.cur.gateway.api.account.v1.json.FindProductsRequest;
import ru.itone.cur.gateway.api.account.v1.json.Product;

import java.util.UUID;

@Controller
public class ProductController implements ProductApi, ProductsApi {
    @Override
    public Mono<ResponseEntity<Product>> createProduct(Mono<Product> product, ServerWebExchange exchange) {
        return ProductApi.super.createProduct(product, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteProduct(UUID productId, ServerWebExchange exchange) {
        return ProductApi.super.deleteProduct(productId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Product>> getProduct(UUID productId, ServerWebExchange exchange) {
        return ProductApi.super.getProduct(productId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> updateProduct(UUID productId, Mono<Product> product, ServerWebExchange exchange) {
        return ProductApi.super.updateProduct(productId, product, exchange);
    }

    @Override
    public Mono<ResponseEntity<FindProductsRequest>> getProducts(ServerWebExchange exchange) {
        return ProductsApi.super.getProducts(exchange);
    }
}
