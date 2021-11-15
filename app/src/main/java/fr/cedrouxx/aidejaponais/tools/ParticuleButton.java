package fr.cedrouxx.aidejaponais.tools;

public class ParticuleButton {

    private String name;
    private String text;

    public ParticuleButton(String name, String text){
        this.name = name;
        this.text = text;
    }

    public String getName(){return name;}

    public String getText(){return text;}
}
