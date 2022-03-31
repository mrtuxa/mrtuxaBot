package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class ChannelPosition implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase("channelposition")) {
            event.getChannel().sendMessage("``>channelposition`` command is not yet implemented.");
        }
    }
}
