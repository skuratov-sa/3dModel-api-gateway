package com.shop.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import ru.itone.cur.gateway.api.account.v1.TrashApi;
import ru.itone.cur.gateway.api.account.v1.json.FindTrashRequest;

import java.util.UUID;

public class TrashController implements TrashApi {
    @Override
    public Mono<ResponseEntity<Void>> createTrash(UUID productId, ServerWebExchange exchange) {
        return TrashApi.super.createTrash(productId, exchange);
    }

    @Override
    public Mono<ResponseEntity<FindTrashRequest>> getTrash(ServerWebExchange exchange) {
        return TrashApi.super.getTrash(exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> productId(UUID productId, ServerWebExchange exchange) {
        return TrashApi.super.productId(productId, exchange);
    }
}
