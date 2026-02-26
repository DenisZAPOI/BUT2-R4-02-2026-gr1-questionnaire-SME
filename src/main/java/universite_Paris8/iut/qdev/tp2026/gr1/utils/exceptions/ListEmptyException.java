package universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions;

/**
 * Levée lorsque la liste de questionnaires a été créée mais est vide.
 * Correspond au cas : "La liste est-elle remplie ? → Non"
 */
public class ListEmptyException extends QuestionnaireException {

    public ListEmptyException() {
        super("La liste de questionnaires est vide.");
    }

    public ListEmptyException(Throwable cause) {
        super("La liste de questionnaires est vide.", cause);
    }
}
