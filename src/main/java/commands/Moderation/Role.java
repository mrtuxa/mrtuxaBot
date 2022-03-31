package commands.Moderation;

import configurations.Configuration;
import org.javacord.api.listener.message.MessageCreateListener;

public class Role implements MessageCreateListener {
    configurations.Configuration configuration = new Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase("role")) {
            event.getChannel().sendMessage(configuration.getPrefix() + "role <add/remove> <role>" + "\n" + "Not yet implemented");
        }
    }
}
