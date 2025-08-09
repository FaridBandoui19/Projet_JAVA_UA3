public class BasicRowCleaner implements IRowCleaner {
    @Override
    public String[] clean(String[] row) {
        String[] result = new String[row.length];
        for (int i = 0; i < row.length; i++) {
            String val = row[i];
            if (val == null || val.trim().isEmpty() || val.equalsIgnoreCase("N/A")) {
                result[i] = "INCONNU";
            } else {
                result[i] = val.toUpperCase(); // Standardise en majuscules
            }
        }
        return result;
    }
}