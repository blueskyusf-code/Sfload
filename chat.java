public class chat {
    public static void main(String[] args) {
        if (args.length == 0) return;
        String msg = args[0].toLowerCase().trim();

        // Se a mensagem contiver "alerta", o comando será CREATE_ISSUE
        if (msg.contains("alerta")) {
            System.out.println("ACTION:CREATE_ISSUE|Alerta de Sistema|Um usuário enviou um alerta pelo App!");
        } 
        // Se for uma mensagem normal
        else if (msg.contains("oi")) {
            System.out.println("ACTION:COMMENT|Olá! Eu sou o SFload, como posso ajudar?");
        }
        else {
            System.out.println("ACTION:COMMENT|Comando não reconhecido, mas recebi sua mensagem!");
        }
    }
}
