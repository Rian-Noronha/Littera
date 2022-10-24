package com.rntec.littera.util;

import com.rntec.littera.model.Autor;

import java.util.ArrayList;
import java.util.List;

public class UtilAutor {

    private Autor autor = new Autor();
    private List<String> obras = new ArrayList<String>();

    public Autor retornarAutor(int posicaoAutor) {
        switch (posicaoAutor) {
            case 0:
                autor.setDescricao("Pero Vaz de Caminha, textos de caráter informativo e de caráter pedagógico no contexto do Quinhentismo(1500 - 1601).");
                obras.add("Carta de Pero Vaz de Caminha a el-rei D. Manuel");
                autor.setObras(obras);
                break;
            case 1:
                autor.setDescricao("Gândavo, textos de caráter informativo e de caráter pedagógico no contexto do Quinhentismo(1500 - 1601).");
                obras.add("Tratado da Terra do Brasil");
                autor.setObras(obras);
                break;
            case 2:
                autor.setDescricao("José de Anchieta, textos de caráter informativo e de caráter pedagógico no contexto do Quinhentismo(1500 - 1601).");
                obras.add("Poema à Virgem");
                autor.setObras(obras);
                break;
            case 3:
                autor.setDescricao("Gregório de Matos, caracteriza-se pelos detalhes, pelo exagero e pelo rebuscamento. Nele destaca-se o cultismo e o conceptismo no Barroco\n" +
                        "(1601 - 1768).");
                obras.add("Triste Bahia");
                autor.setObras(obras);
                break;
            case 4:
                autor.setDescricao("Bento Teixeira, caracteriza-se pelos detalhes, pelo exagero e pelo rebuscamento. Nele destaca-se o cultismo e o conceptismo no Barroco\n" +
                        "(1601 - 1768).");
                obras.add("Prosopopeia");
                autor.setObras(obras);
                break;
            case 5:
                autor.setDescricao("Botelho de Oliveira, caracteriza-se pelos detalhes, pelo exagero e pelo rebuscamento. Nele destaca-se o cultismo e o conceptismo no Barroco\n" +
                        "(1601 - 1768).");
                obras.add("Música do Parnaso");
                autor.setObras(obras);
                break;
            case 6:
                autor.setDescricao("Cláudio Manuel da Costa, exaltação da natureza e linguagem simples. Este período literário é marcado principalmente pela simplicidade dos temas abordados no contexto do Arcadismo\n" +
                        "(1768 - 1808). ");
                obras.add("Obras Poéticas");
                autor.setObras(obras);
                break;
            case 7:
                autor.setDescricao("Santa Rita Durão, exaltação da natureza e linguagem simples. Este período literário é marcado principalmente pela simplicidade dos temas abordados no contexto do Arcadismo\n" +
                        "(1768 - 1808). ");
                obras.add("Caramuru");
                autor.setObras(obras);
                break;
            case 8:
                autor.setDescricao("Tomás Antônio Gonzaga, exaltação da natureza e linguagem simples. Este período literário é marcado principalmente pela simplicidade dos temas abordados no contexto do Arcadismo\n" +
                        "(1768 - 1808). ");
                obras.add("Marília de Dirceu");
                autor.setObras(obras);
                break;
            case 9:
                autor.setDescricao("Gonçalves Dias, primeira fase do Romantismo (1836 - 1881). Caráter voltado ao nacionalismo e indianismo.");
                obras.add("Canção do Exílio");
                autor.setObras(obras);
                break;
            case 10:
                autor.setDescricao("Álvares de Azevedo, segunda fase do Romantismo (1836 - 1881). Caráter voltado ao egocentrismo e pessimismo.");
                obras.add("Lira dos Vinte Anos");
                autor.setObras(obras);
                break;
            case 11:
                autor.setDescricao("Castro Alves, terceira fase do Romantismo (1836 - 1881). Caráter voltado à liberdade.");
                obras.add("Navio Negreiro");
                autor.setObras(obras);
                break;
            case 12:
                autor.setDescricao("Machado de Assis, caráter de objetividade, temática social, linguagem objetiva  no Realismo(1881 - 1893).");
                obras.add("Memórias Póstumas de Brás Cubas");
                obras.add("Dom Casmurro");
                obras.add("A Mão e a Luva");
                obras.add("Helena");
                obras.add("Quincas Borba");
                obras.add("Iaiá Garcia");
                obras.add("Ressureição");
                obras.add("Memorial de Aires");
                obras.add("Esaú e Jacó");
                obras.add("Casa Velha");
                autor.setObras(obras);
                break;
            case 13:
                autor.setDescricao("Aluísio de Azevedo, caráter de uma linguagem mais próxima da coloquial, temática polêmica no Naturalismo(1881 - 1893).");
                obras.add("O Mulato");
                obras.add("Uma Lágrima de Mulher");
                obras.add("Mistério da Tijuca ou Girândola de Amores");
                obras.add("O Cortiço");
                obras.add("Touro Negro");
                obras.add("Flor de Lis");
                obras.add("A Mortalha de Alzira");
                autor.setObras(obras);
                break;
            case 14:
                autor.setDescricao("Olavo Bilac, caráter de arte pela arte, culto à forma no Parnasianismo\n" +
                        "(1881 - 1893).");
                obras.add("Tratado de Versificação");
                obras.add("Poesias(1888");
                obras.add("Crônicas e Novelas(1894)");
                obras.add("Sagres(1899)");
                obras.add("Crítica e Fantasia(1904)");
                autor.setObras(obras);
                break;
            case 15:
                autor.setDescricao("Cruz e Sousa, subjetivismo, espiritualidade e misticismo no contexto do Simbolismo\n" +
                        "(1893 - 1910).");
                obras.add("Tropos e Fantasias");
                autor.setObras(obras);
                break;
            case 16:
                autor.setDescricao("Alphonsus de Guimarães, subjetivismo, espiritualidade e misticismo no contexto do Simbolismo\n" +
                        "(1893 - 1910).");
                obras.add("Kyriale");
                autor.setObras(obras);
                break;
            case 17:
                autor.setDescricao("Augusto dos Anjos, subjetivismo, espiritualidade e misticismo no contexto do Simbolismo\n" +
                        "(1893 - 1910).");
                obras.add("Eu");
                autor.setObras(obras);
                break;
            case 18:
                autor.setDescricao("Euclides da Cunha, rompimento com o academicismo, além do que é marcado pela marginalidade das suas personagens no contexto do Pré-Modernismo\n" +
                        "(1910 - 1922).");
                obras.add("A guerra no sertão (1899)");
                obras.add("As secas do Norte (1900)");
                obras.add("O Brasil no século XIX (1901)");
                obras.add("Os Sertões (1902)");
                obras.add("Civilização (1904)");
                obras.add("Contrastes e Confrontos (1906)");
                obras.add("Peru Versus Bolívia (1907)");
                obras.add("Castro Alves e o Seu Tempo (1908)");
                obras.add("A Margem da História (1909)");
                autor.setObras(obras);
                break;
            case 19:
                autor.setDescricao("Lima Barreto, rompimento com o academicismo, além do que é marcado pela marginalidade das suas personagens no contexto do Pré-Modernismo (1910 - 1922).");
                obras.add("Recordações do escrivão Isaías Caminha (1909)");
                obras.add("Triste fim de Policarpo Quaresma (1911)");
                obras.add("Numa e ninfa (1915)");
                obras.add("Vida e Morte de M. J. Gonzaga de Sá (1919)");
                obras.add("Os bruzundangas (1923)");
                obras.add("Clara dos Anjos (1948)");
                obras.add("Diário Íntimo (1953)");
                obras.add("Cemitério dos Vivos (1956)");
                autor.setObras(obras);
                break;
            case 20:
                autor.setDescricao("Graça Aranha, rompimento com o academicismo, além do que é marcado pela marginalidade das suas personagens no contexto do Pré-Modernismo (1910 - 1922).");
                obras.add("Canaã (1902)");
                obras.add("Malazarte (1914)");
                obras.add("A Estética da Vida (1921)");
                obras.add("Correspondência de Machado de Assis e Joaquim Nabuco (1923)");
                obras.add("Espírito Moderno (1925)");
                obras.add("A Viagem Maravilhosa (1929)");
                obras.add("O Meu Próprio Romance (1931)");
                obras.add("O Manifesto dos Mundos Sociais (1935)");
                autor.setObras(obras);
                break;
            case 21:
                autor.setDescricao("Manuel Bandeira, caráter de renovação estética, radicalismo na primeira fase do Modernismo\n" +
                        "(1922 - 1950) .");
                obras.add("A Cinza das Horas (1917)");
                obras.add("Carnaval (1919)");
                obras.add("Libertinagem (1930)");
                obras.add("Estrela da Manhã (1936)");
                obras.add("Lira dos Cinquent'anos (1940)");
                obras.add("Crônica da Província do Brasil (1936)");
                obras.add("Guia de Ouro Preto, Rio de Janeiro (1938)");
                obras.add("Noções de História das Literaturas (1940)");
                obras.add("Autoria das Cartas Chilenas (1940)");
                autor.setObras(obras);
                break;
            case 22:
                autor.setDescricao("Graciliano Ramos, caráter através de temáticas nacionalistas na segunda fase do Modernismo\n" +
                        "(1922 - 1950) .");
                obras.add("Caetés (1933)");
                obras.add("Vidas Secas (1938)");
                obras.add("São Bernardo (1934)");
                obras.add("Angústia (1936)");
                obras.add("A Terra dos Meninos Pelados (1939)");
                obras.add("Brandão Entre o Mar e o Amor (1942)");
                obras.add("Histórias de Alexandre (1944)");

                autor.setObras(obras);
                break;
            case 23:
                autor.setDescricao("Clarice Lispector, caráter com inovações linguísticas e experimentações artísticas na terceira fase do Modernismo\n" +
                        "(1922 - 1950) .");
                obras.add("Perto do coração selvagem (1942)");
                obras.add("O Lustre (1946)");
                obras.add("A Cidade Sitiada (1949)");
                obras.add("Laços de Família (1960)");
                obras.add("A Maçã no Escuro (1961)");
                obras.add("A Legião Estrangeira (1964)");
                obras.add("A Paixão Segundo G. H (1964)");
                obras.add("O Mistério do Coelho Pensante (1967)");
                autor.setObras(obras);
                break;

            case 24:
                autor.setDescricao("Ariano Suassuna, espontaneidade, liberdade artística, multiplicidade de estilos e combinação de tendências são as principais marcas do Pós-Modernismo\n" +
                        "(1950 - até hoje).");
                obras.add("Uma Mulher Vestida de Sol (1947)");
                obras.add("Cantam as Harpas de Sião ou O Desertor de Princesa (1948)");
                obras.add("Os Homens de Barro (1949)");
                obras.add("Auto de João da Cruz (1950)");
                obras.add("Torturas de um Coração (1951)");
                obras.add("O Castigo da Soberba (1953)");
                obras.add("O Rico Avarento (1954)");
                obras.add("Auto da Compadecida (1955)");
                obras.add("O Casamento Suspeitoso (1957)");
                obras.add("O Santo e a Porca (1957)");
                obras.add("O Homem da Vaca e o Poder da Fortuna (1958)");
                obras.add("A Pena e a Lei (1959)");
                obras.add("Farsa da Boa Preguiça (1960)");
                obras.add("A Caseira e a Catarina (1961)");
                obras.add("O Romance d'A Pedra do Reino e o Príncipe do Sangue do Vai-e-Volta (1971)");
                autor.setObras(obras);

                break;

            case 25:
                autor.setDescricao("Millôr Fernandes , espontaneidade, liberdade artística, multiplicidade de estilos e combinação de tendências são as principais marcas do Pós-Modernismo\n" +
                        "(1950 - até hoje).");
                obras.add("- Millôr Definitivo: A Bíblia do Caos");

                autor.setObras(obras);

                break;

            case 26:
                autor.setDescricao("Paulo Leminski, espontaneidade, liberdade artística, multiplicidade de estilos e combinação de tendências são as principais marcas do Pós-Modernismo\n" +
                        "(1950 - até hoje).");
                obras.add("Agora é que são Elas");
                autor.setObras(obras);

                break;



        }


        return autor;


    }


}
