public class Video extends ContainerFolder{
    private String watchingTimeStamp;
    private int qualityVideo;
    private double speedVideo;

    Video(String name, String path, String typeVideo, int sizeVideo,
          String watchingTimeStamp, int qualityVideo, double speedVideo) {
        super(name, path, typeVideo, sizeVideo);
        this.qualityVideo = qualityVideo;
        this.speedVideo = speedVideo;
        this.watchingTimeStamp = watchingTimeStamp;
    }


    @Override
    public void deleteContainer() {

    }

    @Override
    public void moveContainer(String path) {

    }

    public double getSpeedVideo() {
        return speedVideo;
    }

    public int getQualityVideo() {
        return qualityVideo;
    }

    public String getWatchingTimeStamp() {
        return watchingTimeStamp;
    }

    public void setQualityVideo(int qualityVideo) {
        this.qualityVideo = qualityVideo;
    }

    public void setSpeedVideo(double speedVideo) {
        this.speedVideo = speedVideo;
    }

    public void setWatchingTimeStamp(String watchingTimeStamp) {
        this.watchingTimeStamp = watchingTimeStamp;
    }
}
