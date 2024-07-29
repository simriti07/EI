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
public class KoreanVisitor implements ArtifactVisitor {
    @Override
    public void visit(HistoricalArtifact artifact, String language) {
        System.out.println("이름: " + artifact.getName(language));
        System.out.println("시대: " + artifact.getDetail(language, "era"));
        System.out.println("역사적 의미: " + artifact.getDetail(language, "historicalSignificance"));
    }

    @Override
    public void visit(ScientificArtifact artifact, String language) {
        System.out.println("이름: " + artifact.getName(language));
        System.out.println("재료: " + artifact.getDetail(language, "material"));
        System.out.println("발견: " + artifact.getDetail(language, "discovery"));
    }

    @Override
    public void visit(CulturalArtifact artifact, String language) {
        System.out.println("이름: " + artifact.getName(language));
        System.out.println("원산지: " + artifact.getDetail(language, "origin"));
        System.out.println("문화적 영향: " + artifact.getDetail(language, "culturalImpact"));
    }
}

