import commands.*;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import configurations.Configuration;
import org.javacord.api.util.logging.FallbackLoggerConfiguration;

public class Main {

    public static void main(String[] args) {
        configurations.Configuration configuration = new configurations.Configuration();
        DiscordApi api = new DiscordApiBuilder()
                .setToken(configuration.getToken())
                .addListener(new Help())
                .addListener(new Ban())
                .addListener(new Ping())
                .addListener(new Say())
                .addListener(new ServerInfo())
                .login()
                .join();

        api.updateActivity(">help to getting started", "https://www.youtube.com/watch?v=Z_JU4NE90gI");

    }
}