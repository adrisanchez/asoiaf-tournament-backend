package es.asoiaf.tournament.enums;

public enum Sceno {
    FOREST("forest", "Bosque");

    private String code;
    private String name;

    Sceno(String code, String text) {
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
