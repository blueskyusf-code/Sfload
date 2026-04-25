import java.util.*;

public class chat {
    public static void main(String[] args) {
        if (args.length == 0) return;

        String input = String.join(" ", args).toLowerCase();
        String firstWord = args[0].replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(input).reverse().toString();

        // Quebra-cabeça de frases expandido
        String[] intros = {
            "Interessante sua abordagem sobre '" + firstWord + "'...",
            "Processando o núcleo da ideia: '" + firstWord + "'...",
            "Iniciando protocolo de análise para '" + firstWord + "'...",
            "Vejo que você começou com '" + firstWord + "', uma escolha sólida."
        };

        String[] analises = {
            "O reflexo inverso dessa lógica resulta em: " + reversed,
            "Na simetria dos dados, o reverso é: " + reversed,
            "Desconstruindo a frase, temos o espelho: " + reversed
        };

        String[] conclusoes = {
            "Isso sugere uma nova camada de processamento. 🚀",
            "A estrutura parece resiliente às falhas. ✅",
            "Os parâmetros estão dentro da normalidade operacional. 🤖",
            "Aguardando a próxima peça deste quebra-cabeça."
        };

        // Lógica de "Pensamento" baseada em palavras-chave
        String reflexao;
        if (input.contains("erro") || input.contains("bug")) {
            reflexao = "⚠️ Detectei uma instabilidade no que você disse. Recomendo depuração.";
        } else if (input.length() > 50) {
            reflexao = "📚 Essa é uma entrada complexa. Minha capacidade de processamento está em 100%.";
        } else if (input.contains("ajuda") || input.contains("help")) {
            reflexao = "🆘 Protocolo de suporte ativado. Como posso facilitar sua navegação?";
        } else {
            reflexao = "🧩 O quebra-cabeça se encaixa. A lógica flui perfeitamente.";
        }

        Random r = new Random();
        System.out.println("### 🧠 RELATÓRIO DO PROCESSADOR JAVA");
        System.out.println(intros[r.nextInt(intros.length)]);
        System.out.println("\n**[ESPELHAMENTO]**");
        System.out.println(analises[r.nextInt(analises.length)]);
        System.out.println("\n**[CONCLUSÃO]**");
        System.out.println(conclusoes[r.nextInt(conclusoes.length)]);
        System.out.println("\n> **REFLEXÃO:** " + reflexao);
    }
    }
