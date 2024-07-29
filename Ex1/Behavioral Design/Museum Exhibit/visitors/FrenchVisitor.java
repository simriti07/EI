/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitors;

import artifacts.HistoricalArtifact;
import artifacts.ScientificArtifact;
import artifacts.CulturalArtifact;

/**
 *
 * @author DELL
 */
public class FrenchVisitor implements ArtifactVisitor {
    @Override
    public void visit(HistoricalArtifact artifact, String language) {
        System.out.println("Nom: " + artifact.getName(language));
        System.out.println("Époque: " + artifact.getDetail(language, "era"));
        System.out.println("Signification Historique: " + artifact.getDetail(language, "historicalSignificance"));
    }

    @Override
    public void visit(ScientificArtifact artifact, String language) {
        System.out.println("Nom: " + artifact.getName(language));
        System.out.println("Matériau: " + artifact.getDetail(language, "material"));
        System.out.println("Découverte: " + artifact.getDetail(language, "discovery"));
    }

    @Override
    public void visit(CulturalArtifact artifact, String language) {
        System.out.println("Nom: " + artifact.getName(language));
        System.out.println("Origine: " + artifact.getDetail(language, "origin"));
        System.out.println("Impact Culturel: " + artifact.getDetail(language, "culturalImpact"));
    }
}

