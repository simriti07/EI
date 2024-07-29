/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artifacts;

import visitors.ArtifactVisitor;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class HistoricalArtifact extends Artifact {
    public HistoricalArtifact(Map<String, String> details) {
        super(details);
    }

    public String getDetail(String language, String detailType) {
        return details.get(language + "_" + detailType);
    }

    @Override
    public void accept(ArtifactVisitor visitor, String language) {
        visitor.visit(this, language);
    }
}

