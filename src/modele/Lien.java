package modele;

import javafx.scene.image.Image;


public enum Lien {

    /**************************************************************************/
    // VARIABLES MEMBRES
    /**************************************************************************/
    
    VERTICAL("/ressources/vertical.png"),
    VERTICAL_VALIDE("/ressources/vertical_valide.png"),
    HORIZONTAL("/ressources/horizontal.png"),
    HORIZONTAL_VALIDE("/ressources/horizontal_valide.png"),
    COUDE_HAUT_DROIT("/ressources/coude_haut_droit.png"),
    COUDE_HAUT_DROIT_VALIDE("/ressources/coude_haut_droit_valide.png"),
    COUDE_HAUT_GAUCHE("/ressources/coude_haut_gauche.png"),
    COUDE_HAUT_GAUCHE_VALIDE("/ressources/coude_haut_gauche_valide.png"),
    COUDE_BAS_DROIT("/ressources/coude_bas_droit.png"),
    COUDE_BAS_DROIT_VALIDE("/ressources/coude_bas_droit_valide.png"),
    COUDE_BAS_GAUCHE("/ressources/coude_bas_gauche.png"),
    COUDE_BAS_GAUCHE_VALIDE("/ressources/coude_bas_gauche_valide.png"),
    VIDE("/ressources/vide.png"),
    VIDE_INVALIDE("/ressources/vide_invalide.png");

    private final Image image;

    /**************************************************************************/
    // FONCTIONS MEMBRES
    /**************************************************************************/
    
    /**************************************************************************/
    // CONSTRUCTEURS
    /**************************************************************************/
    
    /**
     * Initialise les paramètres avec des valeurs
     * 
     * @param chemin Le chemin actuel
     */
    private Lien(String chemin) {

        this.image = new Image(Lien.class.getResourceAsStream(chemin));

    }

    /**************************************************************************/
    // ACCESSEURS & MUTATEURS
    /**************************************************************************/
    
    /**
     * Lit la variable image
     * 
     * @return La variable membre image
     */
    public Image getImage() {

        return this.image;

    }

    /**
     * Renvoie le lien (lien en fond blanc)
     *
     * @param lien Un Lien
     * 
     * @return Le lien
     */
    public static Lien getLienValide(Lien lien) {

        Lien l = VIDE;

        switch (lien) {

            case VERTICAL:

                l = VERTICAL_VALIDE;

                break;

            case HORIZONTAL:

                l = HORIZONTAL_VALIDE;

                break;

            case COUDE_HAUT_DROIT:

                l = COUDE_HAUT_DROIT_VALIDE;

                break;

            case COUDE_HAUT_GAUCHE:

                l = COUDE_HAUT_GAUCHE_VALIDE;

                break;

            case COUDE_BAS_DROIT:

                l = COUDE_BAS_DROIT_VALIDE;

                break;

            case COUDE_BAS_GAUCHE:

                l = COUDE_BAS_GAUCHE_VALIDE;

                break;

            case VIDE_INVALIDE:

                l = VIDE;

                break;

            default:
                
                l = lien;

                break;

        }

        return l;

    }
    
    /**
     * Renvoie l'opposé du lien (lien en fond vert)
     *
     * @param lien Un Lien
     * 
     * @return L'opposé du lien
     */
    public static Lien getLienInvalide(Lien lien) {
        
        Lien l = VIDE;

        switch (lien) {

            case VERTICAL_VALIDE:

                l = VERTICAL;

                break;

            case HORIZONTAL_VALIDE:

                l = HORIZONTAL;

                break;

            case COUDE_HAUT_DROIT_VALIDE:

                l = COUDE_HAUT_DROIT;

                break;

            case COUDE_HAUT_GAUCHE_VALIDE:

                l = COUDE_HAUT_GAUCHE;

                break;

            case COUDE_BAS_DROIT_VALIDE:

                l = COUDE_BAS_DROIT;

                break;
                
            case COUDE_BAS_GAUCHE_VALIDE:

                l = COUDE_BAS_GAUCHE;

                break;

            case VIDE:

                l = VIDE_INVALIDE;

                break;

            default:

                l = lien;
                
                break;

        }

        return l;

        
    }

}
