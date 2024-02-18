package com.shop.gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
import ru.itone.cur.gateway.api.account.v1.UserApi;
import ru.itone.cur.gateway.api.account.v1.json.UserInfo;

import java.util.UUID;

@Controller
public class UserController implements UserApi {
    @Override
    public Mono<ResponseEntity<UserInfo>> createUser(Mono<UserInfo> userInfo, ServerWebExchange exchange) {
        return UserApi.super.createUser(userInfo, exchange);
    }

    @Override
    public Mono<ResponseEntity<UserInfo>> getUser(UUID userId, ServerWebExchange exchange) {
        return UserApi.super.getUser(userId, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> updateUser(UUID userId, Mono<UserInfo> userInfo, ServerWebExchange exchange) {
        return UserApi.super.updateUser(userId, userInfo, exchange);
    }
}
