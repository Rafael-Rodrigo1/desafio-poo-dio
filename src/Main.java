import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição Curso JAVA");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rafael:" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalXp());

        System.out.println("==============================");

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rodrigo:" + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rodrigo:" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP:" + devRodrigo.calcularTotalXp());
    }
}
