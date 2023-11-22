package Facade.FacadePattern;

import Facade.Facade.VideoConversionFacade;

import java.io.File;

public class FacadeApp {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
