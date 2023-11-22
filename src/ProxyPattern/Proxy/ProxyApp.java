package ProxyPattern.Proxy;

import ProxyPattern.CacheProxy.YoutubeCacheProxy;
import ProxyPattern.Downloader.YoutubeDownloader;
import ProxyPattern.MediaLibrary.ThirdPartyYoutubeClass;

public class ProxyApp {
    public static void main(String[] args) {
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    private static long test(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        downloader.renderPopularVideos();
        downloader.renderVideoPage("catssss");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvidoes");
        downloader.renderVideoPage("catsssss");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed " + estimatedTime + "ms\n");
        return estimatedTime;

    }

}
