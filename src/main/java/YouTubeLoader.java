public class YouTubeLoader {

    private final File file;
    private final String apiKey;

    public YouTubeLoader(File file, String apiKey) {
        this.file = file;
        this.apiKey = apiKey;
    }

    public File getFile() {
        return file;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void load(File file, String apiKey) {
        System.out.println("Loading file: " + file.getFileName() + " with key: " + apiKey);
    }

}
