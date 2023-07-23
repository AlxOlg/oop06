import java.util.UUID;
import java.util.Date;

public class Document {

    protected static int defauNumber;
    static {
        defauNumber = 1;
    }

    private final UUID id;
    private final int number;
    private final Date data;
    private final String author;

    //*конструктор с дефолтными значениями полей */
    public Document() {
        this.id = UUID.randomUUID();
        this.number = defauNumber++;
        this.data = new Date();
        this.author = "defaultAutor";
    }

    //*геттер всех (для упрощения) полей*/
    public String getAll() {
        return "ID: " + id.toString() + ", number: " + number + ", data: " + data.toString() + ", autor: " + author;
    }
}
