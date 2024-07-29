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
public class JapaneseVisitor implements ArtifactVisitor {
    @Override
    public void visit(HistoricalArtifact artifact, String language) {
        System.out.println("名前: " + artifact.getName(language));
        System.out.println("時代: " + artifact.getDetail(language, "era"));
        System.out.println("歴史的意義: " + artifact.getDetail(language, "historicalSignificance"));
    }

    @Override
    public void visit(ScientificArtifact artifact, String language) {
        System.out.println("名前: " + artifact.getName(language));
        System.out.println("材料: " + artifact.getDetail(language, "material"));
        System.out.println("発見: " + artifact.getDetail(language, "discovery"));
    }

    @Override
    public void visit(CulturalArtifact artifact, String language) {
        System.out.println("名前: " + artifact.getName(language));
        System.out.println("起源: " + artifact.getDetail(language, "origin"));
        System.out.println("文化的影響: " + artifact.getDetail(language, "culturalImpact"));
    }
}

