package configurations;

public class Configuration {
    private String token = "OTU3MDM4NzMzOTM1Mzc4NTAz.Yj49xw.4HYoYz0HcA_RqWAe1JMQW25Vlgk" ; //token
    private String prefix = ">" ; // Prefix for commands
    private String guild = "947468849505263616"; // Guild ID
    private String welcomeChannel = "947468849505263619"; // Welcome channel ID
    private String youtube_api_key = ""; // YouTube API key
    private String footerText = "VictoriaState"; // Footer text
    private String footerIcon = "https://cdn.discordapp.com/attachments/956593618221695028/957042576035311736/VictoriaState.png"; // Footer icon
    private String EmbedColor = "3c0fdb"; // Embed color
    private String avatarUrl = "https://cdn.discordapp.com/attachments/956593618221695028/957042576035311736/VictoriaState.png"; // Avatar URL
    private String botName = "VictoriaState"; // Bot name
    private String GuildName = "VictoriaState"; // Guild name
    private String activityName = ">help to getting started"; // Activity name
    private String activityUrl = "https://www.youtube.com/watch?v=Z_JU4NE90gI"; // Activity URL
    public Configuration() {

    }

    public Configuration(String token) {
        this.token = token;
    }

    public String getToken() {
        return token ;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    public String getPrefix() {
        return prefix;
    }

     public void setGuild(String guild) {
        this.guild = guild;
    }
    public String getGuild() {
        return guild;
    }

    public void setWelcomeChannel(String welcomeChannel) {
        this.welcomeChannel = welcomeChannel;
    }

    public String getWelcomeChannel() {
        return welcomeChannel;
    }

    public void setYoutube_api_key(String youtube_api_key) {
        this.youtube_api_key = youtube_api_key;
    }

    public String getYoutube_api_key() {
        return youtube_api_key;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterIcon(String footerIcon) {
        this.footerIcon = footerIcon;
    }

    public String getFooterIcon() {
        return footerIcon;
    }

    public void setEmbedColor(String color) {
        this.EmbedColor = color;
    }

    public String getEmbedColor() {
        return EmbedColor;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setGuildName() {
        this.GuildName = GuildName;
    }

    public String getGuildName() {
        return GuildName;
    }

    public String setActivityName() {
        return activityName;
    }

    public String getActivityName() {
        return activityName;
    }

    public String setActivityUrl() {
        return activityUrl;
    }

    public String getactivityUrl() {
        return activityUrl;
    }
}
