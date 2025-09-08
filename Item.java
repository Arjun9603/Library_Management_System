public interface Item {
    int getId();
    String getTitle();
    boolean isIssued();
    void issue();
    void returnItem();
}
