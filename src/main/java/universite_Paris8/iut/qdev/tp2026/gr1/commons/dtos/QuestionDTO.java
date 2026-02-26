package universite_Paris8.iut.qdev.tp2026.gr1.commons.dtos;

import universite_Paris8.iut.qdev.tp2026.gr1.utils.enums.ThemeQuestion;

import java.util.Objects;

/**
 * DTO représentant une Question dans le SME Questionnaire.
 */
public class QuestionDTO {

    private int idQuestionnaire;
    private int idQuestion;
    private String intitule;
    private String bonneReponse;
    private int valeur;
    private ThemeQuestion theme;
    private String explication;
    private String langue;

    // ── Constructeurs ────────────────────────────────────────────────────────

    public QuestionDTO() {}

    public QuestionDTO(int idQuestionnaire, int idQuestion, String intitule,
                       String bonneReponse, int valeur, ThemeQuestion theme,
                       String explication, String langue) {
        this.idQuestionnaire = idQuestionnaire;
        this.idQuestion      = idQuestion;
        this.intitule        = intitule;
        this.bonneReponse    = bonneReponse;
        this.valeur          = valeur;
        this.theme           = theme;
        this.explication     = explication;
        this.langue          = langue;
    }

    // ── Getters & Setters ────────────────────────────────────────────────────

    public int getIdQuestionnaire() { return idQuestionnaire; }
    public void setIdQuestionnaire(int idQuestionnaire) { this.idQuestionnaire = idQuestionnaire; }

    public int getIdQuestion() { return idQuestion; }
    public void setIdQuestion(int idQuestion) { this.idQuestion = idQuestion; }

    public String getIntitule() { return intitule; }
    public void setIntitule(String intitule) { this.intitule = intitule; }

    public String getBonneReponse() { return bonneReponse; }
    public void setBonneReponse(String bonneReponse) { this.bonneReponse = bonneReponse; }

    public int getValeur() { return valeur; }
    public void setValeur(int valeur) { this.valeur = valeur; }

    public ThemeQuestion getTheme() { return theme; }
    public void setTheme(ThemeQuestion theme) { this.theme = theme; }

    public String getExplication() { return explication; }
    public void setExplication(String explication) { this.explication = explication; }

    public String getLangue() { return langue; }
    public void setLangue(String langue) { this.langue = langue; }

    // ── toString ─────────────────────────────────────────────────────────────

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", idQuestion=" + idQuestion +
                ", intitule='" + intitule + '\'' +
                ", bonneReponse='" + bonneReponse + '\'' +
                ", valeur=" + valeur +
                ", theme=" + theme +
                ", explication='" + explication + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDTO that = (QuestionDTO) o;
        return Objects.equals(getIntitule(), that.getIntitule()) && Objects.equals(getLangue(), that.getLangue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIntitule(), getLangue());
    }
}
