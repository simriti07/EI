package visitors;

import artifacts.CulturalArtifact;
import artifacts.HistoricalArtifact;
import artifacts.ScientificArtifact;

/**
 *
 * @author DELL
 */
public interface ArtifactVisitor {
    void visit(HistoricalArtifact artifact, String language);
    void visit(ScientificArtifact artifact, String language);
    void visit(CulturalArtifact artifact, String language);

}
