package model;
public class  Note{
    private int id = 0;
    private String header;
    private String text;

    public Note(int id, String header, String text) {
        this.id = id;
        this.header = header;
        this.text = text;
    }
    public Note(String header, String text) {
        this.header = header;
        this.text = text;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }
    public String getHeader() {
        return header;
    }
    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return String.format("%d. \"%s\": %s", this.id, this.header, this.text);
    }
    public void setId(int id) {
        this.id = id;
    }

}
