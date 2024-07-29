package museumexhibitt;

import artifacts.*;
import visitors.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {
    private Artifact[] artifacts;
    private ArtifactVisitor englishVisitor;
    private ArtifactVisitor frenchVisitor;
    private ArtifactVisitor spanishVisitor;
    private ArtifactVisitor germanVisitor;
    private ArtifactVisitor chineseVisitor;
    private ArtifactVisitor japaneseVisitor;
    private ArtifactVisitor koreanVisitor;

    public Menu() {
        // Define artifact data in different languages
        Map<String, String> rosettaStoneDetails = new HashMap<>();
        rosettaStoneDetails.put("en_name", "Rosetta Stone");
        rosettaStoneDetails.put("en_era", "Ptolemaic Period");
        rosettaStoneDetails.put("en_historicalSignificance", "Key to understanding Egyptian hieroglyphs.");
        rosettaStoneDetails.put("fr_name", "Pierre de Rosette");
        rosettaStoneDetails.put("fr_era", "Période ptolémaïque");
        rosettaStoneDetails.put("fr_historicalSignificance", "Clé pour comprendre les hiéroglyphes égyptiens.");
        rosettaStoneDetails.put("es_name", "Piedra de Rosetta");
        rosettaStoneDetails.put("es_era", "Periodo Ptolemaico");
        rosettaStoneDetails.put("es_historicalSignificance", "Clave para entender los jeroglíficos egipcios.");
        rosettaStoneDetails.put("de_name", "Rosetta-Stein");
        rosettaStoneDetails.put("de_era", "Ptolemäische Periode");
        rosettaStoneDetails.put("de_historicalSignificance", "Schlüssel zum Verständnis der ägyptischen Hieroglyphen.");
        rosettaStoneDetails.put("zh_name", "罗塞塔石碑");
        rosettaStoneDetails.put("zh_era", "托勒密时期");
        rosettaStoneDetails.put("zh_historicalSignificance", "理解埃及象形文字的关键。");
        rosettaStoneDetails.put("ja_name", "ロゼッタストーン");
        rosettaStoneDetails.put("ja_era", "プトレマイオス朝時代");
        rosettaStoneDetails.put("ja_historicalSignificance", "エジプトのヒエログリフを理解するための鍵。");
        rosettaStoneDetails.put("ko_name", "로제타 석판");
        rosettaStoneDetails.put("ko_era", "프톨레마이오스 시대");
        rosettaStoneDetails.put("ko_historicalSignificance", "이집트 상형 문자를 이해하는 열쇠.");

        Map<String, String> higgsBosonDetails = new HashMap<>();
        higgsBosonDetails.put("en_name", "Higgs Boson");
        higgsBosonDetails.put("en_material", "Particle Physics");
        higgsBosonDetails.put("en_discovery", "Confirmed the existence of the Higgs field.");
        higgsBosonDetails.put("fr_name", "Boson de Higgs");
        higgsBosonDetails.put("fr_material", "Physique des particules");
        higgsBosonDetails.put("fr_discovery", "A confirmé l'existence du champ de Higgs.");
        higgsBosonDetails.put("es_name", "Bosón de Higgs");
        higgsBosonDetails.put("es_material", "Física de partículas");
        higgsBosonDetails.put("es_discovery", "Confirmó la existencia del campo de Higgs.");
        higgsBosonDetails.put("de_name", "Higgs-Boson");
        higgsBosonDetails.put("de_material", "Teilchenphysik");
        higgsBosonDetails.put("de_discovery", "Bestätigte die Existenz des Higgs-Feldes.");
        higgsBosonDetails.put("zh_name", "希格斯玻色子");
        higgsBosonDetails.put("zh_material", "粒子物理学");
        higgsBosonDetails.put("zh_discovery", "确认了希格斯场的存在。");
        higgsBosonDetails.put("ja_name", "ヒッグス粒子");
        higgsBosonDetails.put("ja_material", "素粒子物理学");
        higgsBosonDetails.put("ja_discovery", "ヒッグス場の存在を確認しました。");
        higgsBosonDetails.put("ko_name", "힉스 입자");
        higgsBosonDetails.put("ko_material", "입자 물리학");
        higgsBosonDetails.put("ko_discovery", "힉스 장의 존재를 확인했습니다.");

        Map<String, String> greatWaveDetails = new HashMap<>();
        greatWaveDetails.put("en_name", "The Great Wave off Kanagawa");
        greatWaveDetails.put("en_origin", "Japan");
        greatWaveDetails.put("en_culturalImpact", "Icon of Japanese culture and art.");
        greatWaveDetails.put("fr_name", "La Grande Vague de Kanagawa");
        greatWaveDetails.put("fr_origin", "Japon");
        greatWaveDetails.put("fr_culturalImpact", "Icône de la culture et de l'art japonais.");
        greatWaveDetails.put("es_name", "La Gran Ola de Kanagawa");
        greatWaveDetails.put("es_origin", "Japón");
        greatWaveDetails.put("es_culturalImpact", "Ícono de la cultura y el arte japonés.");
        greatWaveDetails.put("de_name", "Die Große Welle vor Kanagawa");
        greatWaveDetails.put("de_origin", "Japan");
        greatWaveDetails.put("de_culturalImpact", "Ikone der japanischen Kultur und Kunst.");
        greatWaveDetails.put("zh_name", "神奈川沖浪裏");
        greatWaveDetails.put("zh_origin", "日本");
        greatWaveDetails.put("zh_culturalImpact", "日本文化和艺术的象征。");
        greatWaveDetails.put("ja_name", "神奈川沖浪裏");
        greatWaveDetails.put("ja_origin", "日本");
        greatWaveDetails.put("ja_culturalImpact", "日本文化と芸術の象徴。");
        greatWaveDetails.put("ko_name", "가나가와의 큰 파도");
        greatWaveDetails.put("ko_origin", "일본");
        greatWaveDetails.put("ko_culturalImpact", "일본 문화와 예술의 상징.");

        artifacts = new Artifact[]{
            new HistoricalArtifact(rosettaStoneDetails),
            new ScientificArtifact(higgsBosonDetails),
            new CulturalArtifact(greatWaveDetails)
        };

        englishVisitor = new EnglishVisitor();
        frenchVisitor = new FrenchVisitor();
        spanishVisitor = new SpanishVisitor();
        germanVisitor = new GermanVisitor();
        chineseVisitor = new ChineseVisitor();
        japaneseVisitor = new JapaneseVisitor();
        koreanVisitor = new KoreanVisitor();
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Interactive Museum Exhibit!");
            System.out.println("Please select your language:");
            System.out.println("1. English");
            System.out.println("2. Français");
            System.out.println("3. Español");
            System.out.println("4. Deutsch");
            System.out.println("5. 中文 (Chinese)");
            System.out.println("6. 日本語 (Japanese)");
            System.out.println("7. 한국어 (Korean)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            String language = getLanguageCode(choice);

            if (language == null) {
                if (choice == 8) {
                    System.out.println("Thank you for visiting!");
                    break;
                }
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            ArtifactVisitor visitor = getVisitor(language);
            if (visitor == null) {
                System.out.println("No visitor found for this language.");
                continue;
            }

            for (Artifact artifact : artifacts) {
                artifact.accept(visitor, language);
                System.out.println();
            }
        }
    }

    private String getLanguageCode(int choice) {
        switch (choice) {
            case 1: return "en";
            case 2: return "fr";
            case 3: return "es";
            case 4: return "de";
            case 5: return "zh";
            case 6: return "ja";
            case 7: return "ko";
            default: return null;
        }
    }

    private ArtifactVisitor getVisitor(String language) {
        switch (language) {
            case "en": return englishVisitor;
            case "fr": return frenchVisitor;
            case "es": return spanishVisitor;
            case "de": return germanVisitor;
            case "zh": return chineseVisitor;
            case "ja": return japaneseVisitor;
            case "ko": return koreanVisitor;
            default: return null;
        }
    }
}
