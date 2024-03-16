package com.shop.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import ru.itone.cur.gateway.api.account.v1.FavoriteApi;
import ru.itone.cur.gateway.api.account.v1.FavoritesApi;
import ru.itone.cur.gateway.api.account.v1.json.FindFavoritesRequest;

import java.util.UUID;

public class FavoriteController implements FavoriteApi, FavoritesApi {
    @Override
    public Mono<ResponseEntity<Void>> createFavorite(UUID productId, ServerWebExchange exchange) {
        return FavoriteApi.super.createFavorite(productId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> deleteFavorite(UUID productId, ServerWebExchange exchange) {
        return FavoriteApi.super.deleteFavorite(productId, exchange);
    }

    @Override
    public Mono<ResponseEntity<FindFavoritesRequest>> getFavorites(ServerWebExchange exchange) {
        return FavoritesApi.super.getFavorites(exchange);
    }
}
