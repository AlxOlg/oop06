public class ReportPDF implements ReportType {

    @Override
    public Report create(Document document) {
        String file = "PDF отчет: " + document.getAll(); // формируется "файл"
        return new Report(file);
    }
}
