/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitors;

import artifacts.CulturalArtifact;
import artifacts.HistoricalArtifact;
import artifacts.ScientificArtifact;

/**
 *
 * @author DELL
 */
public class EnglishVisitor implements ArtifactVisitor {
    @Override
    public void visit(HistoricalArtifact artifact, String language) {
        System.out.println("Name: " + artifact.getName(language));
        System.out.println("Era: " + artifact.getDetail(language, "era"));
        System.out.println("Historical Significance: " + artifact.getDetail(language, "historicalSignificance"));
    }

    @Override
    public void visit(ScientificArtifact artifact, String language) {
        System.out.println("Name: " + artifact.getName(language));
        System.out.println("Material: " + artifact.getDetail(language, "material"));
        System.out.println("Discovery: " + artifact.getDetail(language, "discovery"));
    }

    @Override
    public void visit(CulturalArtifact artifact, String language) {
        System.out.println("Name: " + artifact.getName(language));
        System.out.println("Origin: " + artifact.getDetail(language, "origin"));
        System.out.println("Cultural Impact: " + artifact.getDetail(language, "culturalImpact"));
    }
}

