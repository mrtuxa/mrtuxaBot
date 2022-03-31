package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class Nickname implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "nickname")) {
            event.getChannel().sendMessage("Your nickname is: " + event.getMessage().getAuthor().getDisplayName());
        }
    }
}
