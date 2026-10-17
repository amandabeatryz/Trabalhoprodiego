package Update;

import TV.TV;
import Server.Server;

public class UpdateManager {

    public void verificarAtualizacao(TV tv, Server server) {
        String versaoTV = tv.getVersao();
        String versaoServidor = server.getVersaoDisponivel();

        if (versaoTV.equals(versaoServidor)) {
            System.out.println("A TV já está atualizada.");
        } else {
            System.out.println("Nova versão disponível!");
            System.out.println("Baixando atualização...");

            tv.atualizarVersao(versaoServidor);

            System.out.println("Atualização concluída!");
            System.out.println("Versão atual: " + tv.getVersao());
        }
    }
}