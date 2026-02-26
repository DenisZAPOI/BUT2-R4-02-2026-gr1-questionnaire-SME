package universite_Paris8.iut.qdev.tp2026.gr1.commons.dtos;

import java.util.List;
import java.util.Objects;

/**
 * DTO représentant un Questionnaire dans le SME Questionnaire.
 * La liste de questions ne doit pas être vide.
 */
public class QuestionnaireDTO {

    private int idQuestionnaire;
    private String libelle;
    private List<QuestionDTO> questions;

    // ── Constructeurs ────────────────────────────────────────────────────────

    public QuestionnaireDTO() {}

    public QuestionnaireDTO(int idQuestionnaire, String libelle, List<QuestionDTO> questions) {
        this.idQuestionnaire = idQuestionnaire;
        this.libelle         = libelle;
        this.questions       = questions;
    }

    // ── Getters & Setters ────────────────────────────────────────────────────

    public int getIdQuestionnaire() { return idQuestionnaire; }
    public void setIdQuestionnaire(int idQuestionnaire) { this.idQuestionnaire = idQuestionnaire; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public List<QuestionDTO> getQuestions() { return questions; }
    public void setQuestions(List<QuestionDTO> questions) { this.questions = questions; }

    // ── Méthode utilitaire ───────────────────────────────────────────────────

    /**
     * Vérifie que la liste de questions n'est pas nulle et non vide.
     */
    public boolean hasQuestions() {
        return questions != null && !questions.isEmpty();
    }

    // ── toString ─────────────────────────────────────────────────────────────

    @Override
    public String toString() {
        return "QuestionnaireDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", libelle='" + libelle + '\'' +
                ", questions=" + questions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionnaireDTO that = (QuestionnaireDTO) o;
        return Objects.equals(getLibelle(), that.getLibelle());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLibelle());
    }
}
