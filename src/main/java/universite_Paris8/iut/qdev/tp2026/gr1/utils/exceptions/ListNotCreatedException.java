package universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions;


/**
 * Levée lorsque la création de la liste de questionnaires DTO échoue.
 * Correspond au cas : "Création réussie ? → Non"
 */
public class ListNotCreatedException extends QuestionnaireException {

    public ListNotCreatedException() {
        super("La liste de questionnaires DTO n'a pas pu être créée.");
    }

    public ListNotCreatedException(Throwable cause) {
        super("La liste de questionnaires DTO n'a pas pu être créée.", cause);
    }
}
