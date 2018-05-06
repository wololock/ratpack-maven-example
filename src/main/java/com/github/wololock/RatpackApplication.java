package com.github.wololock;

import ratpack.server.RatpackServer;

public final class RatpackApplication {

    public static void main(String[] args) throws Exception {
        RatpackServer.start(server -> server.handlers(chain -> chain.get(ctx -> ctx.render("Hello, world!"))));
    }
}
