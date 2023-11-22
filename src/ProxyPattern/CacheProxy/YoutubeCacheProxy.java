package ProxyPattern.CacheProxy;

import ProxyPattern.MediaLibrary.ThirdPartyYoutubeClass;
import ProxyPattern.MediaLibrary.ThirdPartyYoutubeLib;
import ProxyPattern.MediaLibrary.Video;

import java.util.HashMap;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache");
        }
        return cachePopular;
    }

    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video " + videoId + " from cache");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }

}
