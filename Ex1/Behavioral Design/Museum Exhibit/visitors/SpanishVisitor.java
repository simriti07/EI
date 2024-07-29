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
public class SpanishVisitor implements ArtifactVisitor {
    @Override
    public void visit(HistoricalArtifact artifact, String language) {
        System.out.println("Nombre: " + artifact.getName(language));
        System.out.println("Época: " + artifact.getDetail(language, "era"));
        System.out.println("Significado Histórico: " + artifact.getDetail(language, "historicalSignificance"));
    }

    @Override
    public void visit(ScientificArtifact artifact, String language) {
        System.out.println("Nombre: " + artifact.getName(language));
        System.out.println("Material: " + artifact.getDetail(language, "material"));
        System.out.println("Descubrimiento: " + artifact.getDetail(language, "discovery"));
    }

    @Override
    public void visit(CulturalArtifact artifact, String language) {
        System.out.println("Nombre: " + artifact.getName(language));
        System.out.println("Origen: " + artifact.getDetail(language, "origin"));
        System.out.println("Impacto Cultural: " + artifact.getDetail(language, "culturalImpact"));
    }
}

