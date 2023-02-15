//Her er del 1 av 3 av Oblig 2


//Her er Episode klassen:
public class Episode extends Produksjon
{
   private int episodeNr;
   private int sesongNr;

    public Episode(String tittel, int episodeNr, int sesongNr, int spilletid) {
        super(tittel, spilletid);
        this.episodeNr = episodeNr;
        this.sesongNr = sesongNr;



    }

    public Episode(String tittel, int episodeNr, int sesongNr) {
        super(tittel);
        this.episodeNr = episodeNr;
        this.sesongNr = sesongNr;

    }


    //Her vil vil en utskrift bli printet ut med de forskjellige episode objektene:
    @Override
    public String toString(){
        return getTittel()  + "" + " den er i sesong: " + "" + getSesongNr() + ", og den varer: " + "" + getSpilletid() + "" + " minuter";

    }


    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getEpisodeNr() {
        return episodeNr;
    }

    public void setEpisodeNr(int episodeNr) {
        this.episodeNr = episodeNr;
    }

    public int getSesongNr() {
        return sesongNr;
    }

    public void setSesongNr(int sesongNr) {
        this.sesongNr = sesongNr;
    }
}
