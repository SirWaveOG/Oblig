package Oblig_2;//Her er del 3 av 3 av Oblig 2

import java.util.ArrayList;
import java.util.Random;

//Her er Main klassen:
public class Main {
    public static void main(String[] args) {




        //Her en en TVSerie som jeg har valgt:
        TVSerie walking_dead = new TVSerie("The Walking Dead", "The Walking Dead is an American post-apocalyptic horror drama television series", 2010);
        Film The_great_gatsby = new Film("The_great_gatsby", 120, 2010, "It's a good movie");
        Person regissør = new Person("bob", "bobson", 1980, "Regisørr");
        Person regissør2 = new Person("Knut", "Knutson", 1990, "Regisørr");

        Rolle skuspiller = new Rolle("Konrad", "Konradson", new Person("Jon", "jonson", 1820, "Skuspiller"));
        Rolle skuspiller2 = new Rolle("Kasper", "Mikalsen", new Person("Jesper", "Jasper", 1234, "Skuspiller"));
        Rolle skuspiller3 = new Rolle("Jan", "Mikelsen", new Person("Sven", "Svenson", 1750, "Skuspiller"));
        Rolle skuspiller4 = new Rolle("Harrald", "Hårfagre", new Person("Sven", "Svenson den tredje", 1350, "Skuspiller"));
        Rolle skuspiller5 = new Rolle("Ola", "Nordman", new Person("Sverige", "Sverigeson", 1450, "Skuspiller"));


        ArrayList<Rolle> roller = new ArrayList<>();
        roller.add(skuspiller2);
        roller.add(skuspiller3);
        roller.add(skuspiller4);
        roller.add(skuspiller5);




        //Her vil det bli generert en tilfeldig episode spilletid til hver episode. Tiden vill være mellom 20 til 30 minuter:
        Random rand = new Random();
        int min = 20;
        int max = 30;

        //Her er episoder:
            for (int j = 1; j <= 5; j = j + 1){

                for (int i = 1; i <= 20; i = i + 1){
                    walking_dead.leggTilEpisode(new Episode("Episode " + i , i, j, rand.nextInt(max - min + 1) + min));



                }





        }
        System.out.println(The_great_gatsby.getTittel());
        //Her vil det bli skrevet antall sesonger i Terminalen.
        System.out.println(walking_dead.getAntallSesonger());

        //Her er en Episode med feil sesong-nummer, dette vil da få meldingen "feil" til å bli skrevet ut i terminalen.
        walking_dead.leggTilEpisode(new Episode("Episode 5 s4", 5, 10, rand.nextInt(max - min + 1) + min));

        for (Episode enEpisode : walking_dead.getEpisoder()) {
            enEpisode.setRoller(roller);
        }


        String l = "\n";

        for(Episode k : walking_dead.getEpisoder()){
            l += k.toString()+"\n";

        }

        System.out.println(walking_dead.getTittel() + walking_dead.getBeskrivelse() + walking_dead.getUtgivelsesdato() + l);
        System.out.println(walking_dead.getEpisoder().get(0).toString());

        for (Episode enEpisode : walking_dead.getEpisoder()) {
            //Valgte å sette regissør får walking dead in her:
            enEpisode.setRegissor(regissør2);
            for(Rolle b : enEpisode.getRoller()){
                l += b.toString()+"\n";

            }

        }


        //Her vil alle episodene i sesong 3 bli hentet ut og skrevet i terminalen.
        for (Episode e : walking_dead.hentEpisoderISesong(3)){
            System.out.println(e.getTittel());
        }
        System.out.println("Gjennomsnits tiden får alle episodene er: " + "" + walking_dead.getGjennomsnittligSpilletid());

        The_great_gatsby.setRegissor(regissør);





        //Regissor
      // System.out.println(The_great_gatsby.getRegissor());
        The_great_gatsby.leggTilEnRolle(skuspiller);

        //Skuspiller
     //    System.out.println(The_great_gatsby.getRoller().get(0));
        The_great_gatsby.leggTilMangeRoller(roller);

        System.out.println("\n");

        System.out.println(The_great_gatsby.getTittel());
        System.out.println("\n");


        //Roller for The Great Gatsby film
        System.out.println("***********Roller får Film***********");
        System.out.println(The_great_gatsby.getRoller());
        System.out.println("\n");


        System.out.println("*****************Roller får TVserie*****************");
        System.out.println(walking_dead.hentRollebesetning());
        System.out.println("\n");


        //Regissoren til The grat Gatsby
        System.out.println("*********Regissør får The Great Gatsby***********");
        System.out.println(The_great_gatsby.getRegissor());


    }







}
