package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class channelmove implements MessageCreateListener {
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        configurations.Configuration configuration = new configurations.Configuration();
        if(event.getMessage().getContent().equalsIgnoreCase("!channelmove")){
            event.getChannel().sendMessage(configuration.getPrefix() + "channelmove <channel> <new channel> \n Command is not alreadt implemented");
        }
    }
}
