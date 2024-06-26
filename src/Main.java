import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Curso, Mentoria e Bootcamp
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Exemplo de descrição do curso Java");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Exemplo de descrição da mentoria de Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Exemplo de descrição do Bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        // Criando instâncias de Dev
        Dev dev1 = new Dev();
        dev1.setNome("Herbert");

        Dev dev2 = new Dev();
        dev2.setNome("Larissa");

        // Inscrevendo Devs no Bootcamp
        dev1.inscreverBootcamp(bootcampJava);
        dev2.inscreverBootcamp(bootcampJava);

        // Exemplo de progressão no curso para dev1
        Conteudo primeiroConteudoDeDev1 = dev1.getConteudosInscritos().iterator().next();
        dev1.progredir(primeiroConteudoDeDev1);

        // Exemplo de progressão na mentoria para dev2
        Conteudo primeiroConteudoDeDev2 = dev2.getConteudosInscritos().iterator().next();
        dev2.progredir(primeiroConteudoDeDev2);

        // Exibindo informações sobre os Devs
        exibirInformacoesDevs(dev1);
        exibirInformacoesDevs(dev2);
    }

    // Método auxiliar para exibir informações sobre um Dev
    private static void exibirInformacoesDevs(Dev dev) {
        System.out.println("Nome do Dev: " + dev.getNome());
        System.out.println("Conteúdos Inscritos: ");
        exibirConteudos(dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: ");
        exibirConteudos(dev.getConteudosConcluidos());
        System.out.println("XP Total: " + dev.calcularTotalXp());
        System.out.println("---------------------");
    }

    // Método auxiliar para exibir conteúdos inscritos ou concluídos
    private static void exibirConteudos(Set<Conteudo> conteudos) {
        for (Conteudo conteudo : conteudos) {
            System.out.println("- " + conteudo.getTitulo());
        }
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo.");
        }
        System.out.println();
    }
}
