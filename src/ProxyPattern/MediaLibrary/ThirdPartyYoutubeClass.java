package ProxyPattern.MediaLibrary;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com");
        return getRandomVideos();
    }

    public Video getVideo(String videoId) {
        connectToServer("http://www.youtube.com" + videoId);
        return getSomeVideo(videoId);
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkingLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.println("Connecting to " + server + "...");
        experienceNetworkingLatency();
        System.out.println("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populers...");
        experienceNetworkingLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catssssss", new Video("awdwadiai", "cats.avi"));
        hmap.put("ijjiejfse", new Video("sjfnesnfesk", "Dog play with ball.mp4"));
        hmap.put("senfksnk", new Video("sfssenfjesn", "Dancing video.mpq"));
        hmap.put("sfnsen", new Video("sifesi", "Barcelona vs RealM.mov"));
        hmap.put("sndeesf", new Video("sejnfjsnfse", "Programming lesson.avi"));
        System.out.println("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video....");

        experienceNetworkingLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!" + "\n");
        return video;
    }
}
