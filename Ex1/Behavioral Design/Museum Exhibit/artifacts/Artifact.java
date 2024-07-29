package artifacts;

import visitors.ArtifactVisitor;
import java.util.Map;

/**
 *
 * @author DELL
 */
public abstract class Artifact {
    protected Map<String, String> details;

    public Artifact(Map<String, String> details) {
        this.details = details;
    }

    public String getName(String language) {
        return details.get(language + "_name");
    }

    public abstract void accept(ArtifactVisitor visitor, String language);
}

