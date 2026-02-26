package universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions;

/**
 * Levée lorsque le fichier de questionnaires est introuvable.
 * Correspond au cas : "Le fichier existe-t-il ? → Non"
 */
public class FileNotFoundException extends QuestionnaireException {

    public FileNotFoundException(String filePath) {
        super("Le fichier est introuvable : " + filePath);
    }

    public FileNotFoundException(String filePath, Throwable cause) {
        super("Le fichier est introuvable : " + filePath, cause);
    }
}
