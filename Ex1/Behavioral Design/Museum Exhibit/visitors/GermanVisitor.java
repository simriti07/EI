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
public class GermanVisitor implements ArtifactVisitor {
    @Override
    public void visit(HistoricalArtifact artifact, String language) {
        System.out.println("Name: " + artifact.getName(language));
        System.out.println("Zeitraum: " + artifact.getDetail(language, "era"));
        System.out.println("Historische Bedeutung: " + artifact.getDetail(language, "historicalSignificance"));
    }

    @Override
    public void visit(ScientificArtifact artifact, String language) {
        System.out.println("Name: " + artifact.getName(language));
        System.out.println("Material: " + artifact.getDetail(language, "material"));
        System.out.println("Entdeckung: " + artifact.getDetail(language, "discovery"));
    }

    @Override
    public void visit(CulturalArtifact artifact, String language) {
        System.out.println("Name: " + artifact.getName(language));
        System.out.println("Herkunft: " + artifact.getDetail(language, "origin"));
        System.out.println("Kultureller Einfluss: " + artifact.getDetail(language, "culturalImpact"));
    }
}

