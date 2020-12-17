package org.example;

/**
 * description
 *
 * @author jinliang 2020/12/17 15:55
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {
        //默认支持mp3格式
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)){
            //适配器支持 vlc mp
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }

    }
}
