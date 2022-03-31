package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class ChannelName implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "channelname")) {
            event.getChannel().sendMessage("``>channelname`` command is not yet implemented.");
        }
    }
}
