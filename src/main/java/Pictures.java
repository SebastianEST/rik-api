public class Pictures {
    private String fileType;
    private String fileName;
    private String fileDescription;
    private String fileUrl;

    public Pictures(String fileType, String fileName, String fileDescription, String fileUrl) {
        this.fileType = fileType;
        this.fileName = fileName;
        this.fileDescription = fileDescription;
        this.fileUrl = fileUrl;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "Pictures{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
