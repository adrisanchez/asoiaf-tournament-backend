package es.asoiaf.tournament.enums;

public enum Map {

    GAME_OF_THRONES("thronnes", "Juego de Tronos");

    private String code;
    private String name;

    Map(String code, String text) {
        this.code = code;
        this.name = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return name;
    }

    public void setText(String text) {
        this.name = text;
    }
}
