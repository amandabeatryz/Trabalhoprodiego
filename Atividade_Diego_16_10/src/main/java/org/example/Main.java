package org.example;

import TV.TV; import Server.Server; import Update.UpdateManager;

public class Main { public static void main(String[] args) {
    TV tv = new TV("v1");
    Server server = new Server("v2");

    UpdateManager manager = new UpdateManager();

    manager.verificarAtualizacao(tv, server);
   }
}