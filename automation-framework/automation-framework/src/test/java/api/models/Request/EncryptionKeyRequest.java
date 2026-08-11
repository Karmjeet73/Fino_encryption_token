package api.models.Request;

public class EncryptionKeyRequest {

    private String requestID;
    private String enrollmentID;
    private int requestType;

    public EncryptionKeyRequest() {
    }

    public EncryptionKeyRequest(
            String requestID,
            String enrollmentID,
            int requestType) {

        this.requestID = requestID;
        this.enrollmentID = enrollmentID;
        this.requestType = requestType;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(String enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }
}