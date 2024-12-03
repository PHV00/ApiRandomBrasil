package com.example.api.classes;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;


//Database é um singleton
public class DataBases {
    private static DataBases db;
    @Getter
    @Setter
    public static List<Name> dbNames = new ArrayList<>();
    @Getter
    @Setter
    public static List<Surname> dbSurnames = new ArrayList<>();

    public static DataBases getInstance(){
        if(db ==null){
            db=new DataBases();
        }
        return db;
    }

    public DataBases(){
        insertDbNames();
        insertDbSurnames();
    }

    public static void insertDbNames(){
        //Nomes masculinos
        dbNames.add(new Name(1,"Antonio",1));
        dbNames.add(new Name(1, "Almeida", 1));
        dbNames.add(new Name(2, "Antônio", 1));
        dbNames.add(new Name(3, "Arthur", 1));
        dbNames.add(new Name(4, "Barbosa", 1));
        dbNames.add(new Name(5, "Bernardo", 1));
        dbNames.add(new Name(6, "Benjamin", 1));
        dbNames.add(new Name(7, "Carlos", 1));
        dbNames.add(new Name(8, "Caio", 1));
        dbNames.add(new Name(9, "Cristiano", 1));
        dbNames.add(new Name(10, "Daniel", 1));
        dbNames.add(new Name(11, "Diego", 1));
        dbNames.add(new Name(12, "Davi", 1));
        dbNames.add(new Name(13, "Eduardo", 1));
        dbNames.add(new Name(14, "Elias", 1));
        dbNames.add(new Name(15, "Erick", 1));
        dbNames.add(new Name(16, "Felipe", 1));
        dbNames.add(new Name(17, "Fernando", 1));
        dbNames.add(new Name(18, "Francisco", 1));
        dbNames.add(new Name(19, "Gabriel", 1));
        dbNames.add(new Name(20, "Gustavo", 1));
        dbNames.add(new Name(21, "Guilherme", 1));
        dbNames.add(new Name(22, "Henrique", 1));
        dbNames.add(new Name(23, "Heitor", 1));
        dbNames.add(new Name(24, "Hugo", 1));
        dbNames.add(new Name(25, "Igor", 1));
        dbNames.add(new Name(26, "Isaías", 1));
        dbNames.add(new Name(27, "Ivan", 1));
        dbNames.add(new Name(28, "João", 1));
        dbNames.add(new Name(29, "José", 1));
        dbNames.add(new Name(30, "Júlio", 1));
        dbNames.add(new Name(31, "Kaio", 1));
        dbNames.add(new Name(32, "Kevin", 1));
        dbNames.add(new Name(33, "Kauã", 1));
        dbNames.add(new Name(34, "Leonardo", 1));
        dbNames.add(new Name(35, "Lucas", 1));
        dbNames.add(new Name(36, "Luís", 1));
        dbNames.add(new Name(37, "Marcos", 1));
        dbNames.add(new Name(38, "Matheus", 1));
        dbNames.add(new Name(39, "Miguel", 1));
        dbNames.add(new Name(40, "Natanael", 1));
        dbNames.add(new Name(41, "Nelson", 1));
        dbNames.add(new Name(42, "Nicolas", 1));
        dbNames.add(new Name(43, "Orlando", 1));
        dbNames.add(new Name(44, "Otávio", 1));
        dbNames.add(new Name(45, "Osmar", 1));
        dbNames.add(new Name(46, "Paulo", 1));
        dbNames.add(new Name(47, "Patrick", 1));
        dbNames.add(new Name(48, "Pedro", 1));
        dbNames.add(new Name(49, "Quentin", 1));
        dbNames.add(new Name(50, "Quirino", 1));
        dbNames.add(new Name(51, "Quinto", 1));
        dbNames.add(new Name(52, "Rafael", 1));
        dbNames.add(new Name(53, "Ricardo", 1));
        dbNames.add(new Name(54, "Rodrigo", 1));
        dbNames.add(new Name(55, "Samuel", 1));
        dbNames.add(new Name(56, "Sebastião", 1));
        dbNames.add(new Name(57, "Sérgio", 1));
        dbNames.add(new Name(58, "Tiago", 1));
        dbNames.add(new Name(59, "Tomás", 1));
        dbNames.add(new Name(60, "Túlio", 1));
        dbNames.add(new Name(61, "Urias", 1));
        dbNames.add(new Name(62, "Ulisses", 1));
        dbNames.add(new Name(63, "Uriel", 1));
        dbNames.add(new Name(64, "Vicente", 1));
        dbNames.add(new Name(65, "Victor", 1));
        dbNames.add(new Name(66, "Vinícius", 1));
        dbNames.add(new Name(67, "Wagner", 1));
        dbNames.add(new Name(68, "Wallace", 1));
        dbNames.add(new Name(69, "William", 1));
        dbNames.add(new Name(70, "Xavier", 1));
        dbNames.add(new Name(71, "Xisto", 1));
        dbNames.add(new Name(72, "Xerxes", 1));
        dbNames.add(new Name(73, "Yago", 1));
        dbNames.add(new Name(74, "Yan", 1));
        dbNames.add(new Name(75, "Yuri", 1));
        dbNames.add(new Name(76, "Zacarias", 1));
        dbNames.add(new Name(77, "Zair", 1));
        dbNames.add(new Name(78, "Zeca", 1));
        dbNames.add(new Name(79, "Zaqueu", 1));
        dbNames.add(new Name(80, "Zeno", 1));
        //Nomes femininos
        dbNames.add(new Name(81,"Alicia",0));
        dbNames.add(new Name(82,"Amanda",0));
        dbNames.add(new Name(83,"Ana",0));
        dbNames.add(new Name(84,"Beatriz",0));
        dbNames.add(new Name(85,"Bianca",0));
        dbNames.add(new Name(86,"Bruna",0));
        dbNames.add(new Name(87,"Camila",0));
        dbNames.add(new Name(88,"Carla",0));
        dbNames.add(new Name(89,"Caroline",0));
        dbNames.add(new Name(90,"Catarina",0));
        dbNames.add(new Name(91,"Cláudia",0));
        dbNames.add(new Name(92,"Daniele",0));
        dbNames.add(new Name(93,"Debora",0));
        dbNames.add(new Name(94,"Eduarda",0));
        dbNames.add(new Name(95,"Elisa",0));
        dbNames.add(new Name(96,"Fernanda",0));
        dbNames.add(new Name(97,"Flávia",0));
        dbNames.add(new Name(98,"Gabriela",0));
        dbNames.add(new Name(99,"Giovanna",0));
        dbNames.add(new Name(100,"Helena",0));
        dbNames.add(new Name(101,"Isabela",0));
        dbNames.add(new Name(102,"Jéssica",0));
        dbNames.add(new Name(103,"Juliana",0));
        dbNames.add(new Name(104,"Karla",0));
        dbNames.add(new Name(105,"Larissa",0));
        dbNames.add(new Name(106,"Letícia",0));
        dbNames.add(new Name(107,"Lúcia",0));
        dbNames.add(new Name(108,"Luana",0));
        dbNames.add(new Name(109,"Luiza",0));
        dbNames.add(new Name(110,"Manuela",0));
        dbNames.add(new Name(111,"Mariana",0));
        dbNames.add(new Name(112,"Martha",0));
        dbNames.add(new Name(113,"Micaela",0));
        dbNames.add(new Name(114,"Natália",0));
        dbNames.add(new Name(115,"Nicole",0));
        dbNames.add(new Name(116,"Patrícia",0));
        dbNames.add(new Name(117,"Rafaela",0));
        dbNames.add(new Name(118,"Renata",0));
        dbNames.add(new Name(119,"Roberta",0));
        dbNames.add(new Name(120,"Sandra",0));
        dbNames.add(new Name(121,"Sara",0));
        dbNames.add(new Name(122,"Sofia",0));
        dbNames.add(new Name(123,"Tatiane",0));
        dbNames.add(new Name(124,"Thais",0));
        dbNames.add(new Name(125,"Valentina",0));
        dbNames.add(new Name(126,"Vanessa",0));
        dbNames.add(new Name(127,"Vera",0));
        dbNames.add(new Name(128,"Vitória",0));
        dbNames.add(new Name(129,"Yasmin",0));
        dbNames.add(new Name(130,"Zélia",0));
                
    }

    public static void insertDbSurnames(){
        dbSurnames.add(new Surname(1, "Abreu"));
        dbSurnames.add(new Surname(2, "Albuquerque"));
        dbSurnames.add(new Surname(3, "Almeida"));
        dbSurnames.add(new Surname(4, "Andrade"));
        dbSurnames.add(new Surname(5, "Araujo"));
        dbSurnames.add(new Surname(6, "Barros"));
        dbSurnames.add(new Surname(7, "Bastos"));
        dbSurnames.add(new Surname(8, "Barbosa"));
        dbSurnames.add(new Surname(9, "Campos"));
        dbSurnames.add(new Surname(10, "Carvalho"));
        dbSurnames.add(new Surname(11, "Castro"));
        dbSurnames.add(new Surname(12, "Cavalcanti"));
        dbSurnames.add(new Surname(13, "Costa"));
        dbSurnames.add(new Surname(14, "Cunha"));
        dbSurnames.add(new Surname(15, "Dias"));
        dbSurnames.add(new Surname(16, "Ferreira"));
        dbSurnames.add(new Surname(17, "Freitas"));
        dbSurnames.add(new Surname(18, "Gomes"));
        dbSurnames.add(new Surname(19, "Guimarães"));
        dbSurnames.add(new Surname(20, "Henrique"));
        dbSurnames.add(new Surname(21, "Lima"));
        dbSurnames.add(new Surname(22, "Lopes"));
        dbSurnames.add(new Surname(23, "Machado"));
        dbSurnames.add(new Surname(24, "Martins"));
        dbSurnames.add(new Surname(25, "Medeiros"));
        dbSurnames.add(new Surname(26, "Miranda"));
        dbSurnames.add(new Surname(27, "Monteiro"));
        dbSurnames.add(new Surname(28, "Morais"));
        dbSurnames.add(new Surname(29, "Nascimento"));
        dbSurnames.add(new Surname(30, "Oliveira"));
        dbSurnames.add(new Surname(31, "Pereira"));
        dbSurnames.add(new Surname(32, "Pinho"));
        dbSurnames.add(new Surname(33, "Ribeiro"));
        dbSurnames.add(new Surname(34, "Rocha"));
        dbSurnames.add(new Surname(35, "Silva"));
        dbSurnames.add(new Surname(36, "Santos"));
        dbSurnames.add(new Surname(37, "Souza"));
        dbSurnames.add(new Surname(38, "Teixeira"));
        dbSurnames.add(new Surname(39, "Torres"));
        dbSurnames.add(new Surname(40, "Vasconcelos"));
        dbSurnames.add(new Surname(41, "Vieira"));
        dbSurnames.add(new Surname(42, "Ximenes"));
        dbSurnames.add(new Surname(43, "Zanetti"));
        dbSurnames.add(new Surname(44, "Zito"));
        dbSurnames.add(new Surname(45, "Zouza"));
        dbSurnames.add(new Surname(46, "Zé"));
        dbSurnames.add(new Surname(47, "Zito"));
        dbSurnames.add(new Surname(48, "Zambrano"));
        dbSurnames.add(new Surname(49, "Zanetti"));
        dbSurnames.add(new Surname(50, "Zarate"));
    }

}