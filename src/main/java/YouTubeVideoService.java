public class YouTubeVideoService {

    public void processVideo(String fileName, String format) {
        File file = new File(fileName);
        CodecFactory codecFactory = new CodecFactory();
        codecFactory.extract(file);
        if (format.equals("mp4")) {
            MPEG4CompressionCodec mpeg4CompressionCodec = new MPEG4CompressionCodec();
            mpeg4CompressionCodec.processFile(file);
        } else {
            OggCompressionCodec oggCompressionCodec = new OggCompressionCodec();
            oggCompressionCodec.processFile(file);
        }
        KeyLibrary keyLibrary = new KeyLibrary();
        String key = keyLibrary.getApiKey();
        YouTubeLoader youTubeLoader = new YouTubeLoader(file, key);
        youTubeLoader.load(file, key);
    }

}
