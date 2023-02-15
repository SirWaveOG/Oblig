package Oblig_2;

import java.util.ArrayList;

public class Produksjon {
    public String tittel;

    //Måtte gjøre om spilletid til public istedet får private. Det er noen som skjer som får programmet til å ikke akseptere det.
    public int spilletid;

    private int utgivelsesdato;
    private String beskrivelse;
    private Person regissor;
    private ArrayList<Rolle> roller = new ArrayList<>();

    //TVSERIE
    public Produksjon(String tittel, String beskrivelse, int utgivelsesdato) {
        this.tittel = tittel;
        this.utgivelsesdato = utgivelsesdato;
        this.beskrivelse = beskrivelse;

    }

    public void leggTilMangeRoller(ArrayList<Rolle> flereRoller){
        for ( Rolle r : flereRoller){
            this.roller.add(r);
        }
    }




    public void leggTilEnRolle(Rolle enRolle){
        this.roller.add(enRolle);
    }


    public ArrayList<Rolle> getRoller() {
        return roller;
    }

    public void setRoller(ArrayList<Rolle> roller) {
        this.roller = roller;
    }

    public int getUtgivelsesdato() {
        return utgivelsesdato;
    }



    public void setUtgivelsesdato(int utgivelsesdato) {
        this.utgivelsesdato = utgivelsesdato;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getSpilletid() {
        return spilletid;
    }

    public void setSpilletid(int spilletid) {
        this.spilletid = spilletid;
    }

    public Person getRegissor() {
        return regissor;
    }

    public void setRegissor(Person regissor) {
        this.regissor = regissor;
    }

    //
    public Produksjon(String tittel, int spilletid, int utgivelsesdato, String beskrivelse) {
        this.tittel = tittel;
        this.spilletid = spilletid;
        this.utgivelsesdato = utgivelsesdato;
        this.beskrivelse = beskrivelse;

    }
    //Episode
    public Produksjon(String tittel, int spilletid) {
        this.tittel = tittel;
        this.spilletid = spilletid;
    }

    public Produksjon(String tittel) {
        this.tittel = tittel;
    }
}
