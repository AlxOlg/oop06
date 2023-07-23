public class ReportJSON implements ReportType {

    @Override
    public Report create(Document document) {
        String file = "JSON отчет: " + document.getAll(); // формируется "файл"
        return new Report(file);
    }
}
