package es.asoiaf.tournament.enums;

public enum ScenoRules {

    FORTIFICADO("fort", "Lore Ipsum");

    private String code;
    private String ruleText;

    ScenoRules(String code, String ruleText) {
        this.code = code;
        this.ruleText = ruleText;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRuleText() {
        return ruleText;
    }

    public void setRuleText(String ruleText) {
        this.ruleText = ruleText;
    }
}
