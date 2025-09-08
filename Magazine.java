public class Magazine implements Item {
    private int id;
    private String title;
    private boolean issued;

    public Magazine(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isIssued() {
        return issued;
    }

    @Override
    public void issue() {
        issued = true;
    }

    @Override
    public void returnItem() {
        issued = false;
    }

    @Override
    public String toString() {
        return "Magazine → ID: " + id + ", Title: " + title + ", Issued: " + issued;
    }
}
