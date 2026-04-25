public class Chat {
    public static void main(String[] args) {
        String input = System.getenv("USER_MSG");
        if (input == null) return;

        String msg = input.toLowerCase();

        // Lógica de Limites e Personalidade do SFload
        if (msg.contains("xingamento") || msg.contains("assedio")) {
            // O print manda o comando de fechar e a explicação
            System.out.println("BOT_ACTION:CLOSE");
            System.out.println("BOT_TEXT:O SFload preza pela alegria! 🌟 Como as regras de convivência foram quebradas, encerrarei o chat agora. Tchau! 🛑");
        } else {
            // O print manda o comando de continuar e a frase feliz
            System.out.println("BOT_ACTION:KEEP");
            System.out.println("BOT_TEXT:Oie! ✨ Que coisa boa ler isso! O SFload está muito feliz em conversar com você! 🚀🌟");
        }
    }
}
