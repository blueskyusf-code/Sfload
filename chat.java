public class Chat {
    public static void main(String[] args) {
        String input = System.getenv("USER_MSG");
        if (input == null || input.isEmpty()) return;

        String msg = input.toLowerCase();

        // LÓGICA DE CONSCIÊNCIA
        if (msg.contains("insulto") || msg.contains("ofensa")) {
            System.out.println("STATUS:OFF");
            System.out.println("RESPOSTA:O SFload preza pelo respeito! 🌟 Infelizmente, não posso continuar essa conversa. Chat encerrado. 🛑");
        } else {
            System.out.println("STATUS:ON");
            System.out.println("RESPOSTA:Oie! ✨ O SFload recebeu sua mensagem e está radiante! Vamos brilhar juntos! 🚀🌟");
        }
    }
}
