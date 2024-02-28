package com.shop.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.itone.cur.gateway.api.account.v1.CategoriesApi;
import ru.itone.cur.gateway.api.account.v1.CategoryApi;
import ru.itone.cur.gateway.api.account.v1.json.Category;

public class CategoryController implements CategoriesApi, CategoryApi {
    @Override
    public Mono<ResponseEntity<Flux<Category>>> getCategories(ServerWebExchange exchange) {
        return CategoriesApi.super.getCategories(exchange);
    }

    @Override
    public Mono<ResponseEntity<Category>> createUser(Mono<Category> category, ServerWebExchange exchange) {
        return CategoryApi.super.createUser(category, exchange);
    }
}
