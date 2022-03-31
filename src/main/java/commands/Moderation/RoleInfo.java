package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class RoleInfo implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "roleinfo")) {
            event.getChannel().sendMessage("This command is currently under construction.");
        }
    }
}
