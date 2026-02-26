package universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions;

/**
 * Levée lorsque le chargement du fichier échoue malgré les droits corrects.
 * Correspond au cas : "Fichier chargé avec succès ? → Non"
 */
public class FileNotLoadedException extends QuestionnaireException {

    public FileNotLoadedException(String filePath) {
        super("Le fichier n'a pas pu être chargé : " + filePath);
    }

    public FileNotLoadedException(String filePath, Throwable cause) {
        super("Le fichier n'a pas pu être chargé : " + filePath, cause);
    }
}
