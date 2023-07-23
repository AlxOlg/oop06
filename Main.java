
public class Main {

    public static void main(String[] args) {

        Document doc1 = new Document();
        Document doc2 = new Document();
        Document doc3 = new Document();
        
        ReportType reportJSON = new ReportJSON();
        String fileJSON = reportJSON.create(doc1).getFile();
        System.out.println(fileJSON);

        ReportType reportPDF = new ReportPDF();
        String filePDF = reportPDF.create(doc2).getFile();
        System.out.println(filePDF);
        
        ReportType reportXML = new ReportXML();
        String fileXML = reportXML.create(doc3).getFile();
        System.out.println(fileXML);
    }
}
