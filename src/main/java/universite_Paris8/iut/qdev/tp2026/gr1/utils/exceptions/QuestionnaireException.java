package universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions;

/**
 * Exception de base pour le SME Questionnaire.
 * Toutes les exceptions métier héritent de cette classe.
 */
public class QuestionnaireException extends Exception {

    public QuestionnaireException(String message) {
        super(message);
    }

    public QuestionnaireException(String message, Throwable cause) {
        super(message, cause);
    }
}
