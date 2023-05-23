public class Main {

    public static void main(String[] args) {
        File file1 = new File("fileName1");
        File file2 = new File("fileName2");

        YouTubeVideoService youTubeVideoService = new YouTubeVideoService();
        youTubeVideoService.processVideo(file1.getFileName(), "mp4");
        youTubeVideoService.processVideo(file2.getFileName(), "mp5");
    }

}
