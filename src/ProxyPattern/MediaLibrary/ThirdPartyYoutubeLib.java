package ProxyPattern.MediaLibrary;

import java.util.HashMap;

public class ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
