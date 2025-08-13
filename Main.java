public class Main {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\hp\\github\\Projet_JAVA_UA3\\donnees_brutes.csv";
        String outputPath = "C:\\Users\\hp\\github\\Projet_JAVA_UA3\\donnees_nettoyees.csv";

        // On injecte les dépendances (SOLID, DIP)
        ICsvReader reader = new CsvFileReader();
        ICsvWriter writer = new CsvFileWriter();
        IRowCleaner rowCleaner = new BasicRowCleaner();

        CsvCleaner cleaner = new CsvCleaner(reader, writer, rowCleaner);
        cleaner.cleanCsv(inputPath, outputPath);

        System.out.println("Nettoyage terminé. Fichier sauvegardé sous : " + outputPath);
    }
}