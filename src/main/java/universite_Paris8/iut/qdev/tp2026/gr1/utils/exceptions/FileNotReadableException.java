package universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions;

/**
 * Levée lorsque le fichier existe mais ne peut pas être lu (droits insuffisants).
 * Correspond au cas : "Peut-on lire le fichier ? → Non"
 */
public class FileNotReadableException extends QuestionnaireException {

    public FileNotReadableException(String filePath) {
        super("Le fichier n'est pas lisible (droits insuffisants) : " + filePath);
    }

    public FileNotReadableException(String filePath, Throwable cause) {
        super("Le fichier n'est pas lisible (droits insuffisants) : " + filePath, cause);
    }
}
