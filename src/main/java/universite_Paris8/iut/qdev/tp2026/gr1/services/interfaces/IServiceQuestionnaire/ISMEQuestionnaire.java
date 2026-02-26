package universite_Paris8.iut.qdev.tp2026.gr1.services.interfaces.IServiceQuestionnaire;

import universite_Paris8.iut.qdev.tp2026.gr1.commons.dtos.QuestionDTO;
import universite_Paris8.iut.qdev.tp2026.gr1.commons.dtos.QuestionnaireDTO;

import java.util.List;

import universite_Paris8.iut.qdev.tp2026.gr1.utils.exceptions.*;

/**
 * Interface du Système Métier Questionnaire (SME Questionnaire).
 * Regroupe l'ensemble des services exposés par la couche questionnaire.
 */
public interface ISMEQuestionnaire {

    /**
     * Fournit la liste de tous les questionnaires disponibles.
     *
     * @return une liste de {@link QuestionnaireDTO} non vide
     * @throws ListEmptyException      si la liste récupérée est vide
     * @throws ListNotCreatedException si la liste n'a pas pu être construite
     */
    List<QuestionnaireDTO> fournirListeQuestionnaires()
            throws ListEmptyException, ListNotCreatedException;

    /**
     * Charge le fichier questionsQuizz_Vx.csv et construit la liste des questionnaires.
     *
     * @param cheminFichier le chemin vers le fichier CSV à charger
     * @return une liste de {@link QuestionnaireDTO} construite depuis le fichier
     * @throws FileNotFoundException    si le fichier est introuvable
     * @throws FileNotReadableException si le fichier n'est pas lisible
     * @throws FileNotLoadedException   si le chargement du fichier échoue
     * @throws ListNotCreatedException  si la liste DTO n'a pas pu être créée
     * @throws ListEmptyException       si la liste créée est vide
     */
    List<QuestionnaireDTO> chargerFichier(String cheminFichier)
            throws FileNotFoundException,
                   FileNotReadableException,
                   FileNotLoadedException,
                   ListNotCreatedException,
                   ListEmptyException;

    /**
     * Fournit un questionnaire selon son identifiant.
     *
     * @param idQuestionnaire l'identifiant du questionnaire recherché
     * @return le {@link QuestionnaireDTO} correspondant
     * @throws ListEmptyException     si aucun questionnaire n'est disponible
     * @throws QuestionnaireException si le questionnaire demandé est introuvable
     */
    QuestionnaireDTO fournirUnQuestionnaire(int idQuestionnaire)
            throws ListEmptyException, QuestionnaireException;

    /**
     * Met à jour les statistiques d'une question après qu'elle a été jouée.
     *
     * @param idQuestionnaire l'identifiant du questionnaire contenant la question
     * @param idQuestion      l'identifiant de la question à mettre à jour
     * @param reponseCorrecte true si le joueur a donné la bonne réponse, false sinon
     * @throws QuestionnaireException si la question ou le questionnaire est introuvable
     */
    void majStatQuestions(int idQuestionnaire, int idQuestion, boolean reponseCorrecte) // à revoir, sur ce que l'on entend de "stat"
            throws QuestionnaireException;

    /**
     * Fournit les statistiques de toutes les questions d'un questionnaire.
     *
     * @param idQuestionnaire l'identifiant du questionnaire dont on veut les stats
     * @return une liste de {@link QuestionDTO} enrichie des statistiques
     * @throws ListEmptyException     si aucune question n'est disponible
     * @throws QuestionnaireException si le questionnaire est introuvable
     */
    List<QuestionDTO> fournirStatsQuestions(int idQuestionnaire) // à revoir aussi
            throws ListEmptyException, QuestionnaireException;
}
