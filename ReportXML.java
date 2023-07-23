public class ReportXML implements ReportType {

    @Override
    public Report create(Document document) {
        String file = "XML отчет: " + document.getAll(); // формируется "файл"
        return new Report(file);
    }
}
