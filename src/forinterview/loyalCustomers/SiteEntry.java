package forinterview.loyalCustomers;

public class SiteEntry {

    String timestamp;
    Integer pageId;
    Integer customerId;

    public SiteEntry(String timestamp, Integer pageId, Integer customerId) {
        this.timestamp = timestamp;
        this.pageId = pageId;
        this.customerId = customerId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
