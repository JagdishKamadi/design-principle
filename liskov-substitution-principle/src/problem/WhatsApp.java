package problem;

/**
 * due to publishPost() method whatsapp child is not substitute of parents SocialMedia
 * because whatsapp doesn’t support upload photos and videos for friend it’s just a chatting application so it doesn’t follow LSP
 * Similarly instagram doesn’t support groupVideoCall() feature, so we can say instagram child is not substitute of parents SocialMedia
 * How to overcome this issue so that our code can follow LSP
 */

public class WhatsApp extends SocialMedia {
    public void chatWithFriend() {
        //logic
    }

    public void publishPost(Object post) {
        //Not Applicable
    }

    public void sendPhotosAndVideos() {
        //logic
    }

    public void groupVideoCall(String... users) {
        //logic
    }
}