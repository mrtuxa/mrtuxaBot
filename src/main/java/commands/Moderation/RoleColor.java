package commands.Moderation;

import configurations.Configuration;
import org.javacord.api.listener.message.MessageCreateListener;

public class RoleColor implements MessageCreateListener {
    configurations.Configuration configuration = new Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "rolecolor")) {
            event.getChannel().sendMessage("***Role Color*** \n" + "*Output* \n" + "```" + event.getMessage().getAuthor().getRoleColor() + "```" + "*Input* by " + event.getMessageAuthor().getName() + "\n Message\n ``>rolecolor``"  );

        }
    }
}
