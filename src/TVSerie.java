//Her er del 2 av 3 av Oblig 2

import java.util.ArrayList;


//Her er TVSerie klassen:
public class TVSerie {
    private String tittel;
    private String beskrivelse;
    private int utgivelsesdato;
    private ArrayList<Episode> episoder;
    private float gjennomsnittligSpilletid;
    private int antallSesonger;




    public TVSerie(String tittel, String beskrivelse, int utgivelsesdato) {

        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
        this.episoder = new ArrayList<Episode>();
    }



    public TVSerie(String tittel, String beskrivelse, int utgivelsesdato, ArrayList <Episode> episoder, float gjennomsnittligSpilletid, int antallSesonger) {

        this.tittel = tittel;
        this.beskrivelse = beskrivelse;
        this.utgivelsesdato = utgivelsesdato;
        this.episoder = episoder;
        this.antallSesonger = antallSesonger;
        this.gjennomsnittligSpilletid = gjennomsnittligSpilletid;
    }


    @Override
     public String toString(){
        return ("TVserien: " + tittel + "Den: " + beskrivelse + " Den ble utgitt: " + utgivelsesdato + ". " + "Her er alle episodene: " + episoder + ". " + "Gjennomsnitstiden er: " + gjennomsnittligSpilletid + "Og den har så mange sesonger: " + antallSesonger);
    }

    //Her metoden for å legge til en episode:
    public void leggTilEpisode(Episode episoden){

        if (episoden.getSesongNr() <= antallSesonger) {
            this.episoder.add(episoden);
        }

        else if (episoden.getSesongNr() == (antallSesonger + 1)){
            this.episoder.add(episoden);
            antallSesonger++;

        }

        else {
             System.out.println("\nFeil\n");
        }



        oppdaterGjennomsnittligSpilletid();



    }


    //Her skal den Gjennomsnittlige spilletiden for alle episodene bli hentet ut. Den skal regen ut gjennomsnittlig spilletid og oppdatere den:
    private void oppdaterGjennomsnittligSpilletid(){
        float gjennomsnitt = 0;
        for (Episode e : this.episoder){
            gjennomsnitt += e.getSpilletid();
        }
        gjennomsnitt /= episoder.size();
        this.gjennomsnittligSpilletid = gjennomsnitt;

    }


    public ArrayList<Rolle> hentRollebesetning() {

        ArrayList<Rolle> rollebesetning = new ArrayList<>();


        for (Episode enEpisode : episoder) {
           // System.out.println(enEpisode.getRoller().size());

            for (Rolle enRolle : enEpisode.getRoller()) {
                    rollebesetning.add(enRolle);
            }
        }

        return rollebesetning;
    }




    //Her skal alle episodene i en sesong bli hentet ut:
    public ArrayList<Episode> hentEpisoderISesong(int sesong){
      ArrayList<Episode> returnList = new ArrayList<Episode>();
      for (Episode e : this.episoder){
          if (sesong == e.getSesongNr()){
              returnList.add(e);
          }
      }
      return returnList;
    }


    public float getGjennomsnittligSpilletid() {
        return gjennomsnittligSpilletid;
    }

    public String getTittel() {
        return tittel;
    }

    public int getAntallSesonger() {
        return antallSesonger;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public int getUtgivelsesdato() {
        return utgivelsesdato;
    }

    public void setUtgivelsesdato(int utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public ArrayList <Episode> getEpisoder() {
        return episoder;
    }

    public void setEpisoder(ArrayList <Episode> episoder) {
        this.episoder = episoder;
    }


}
