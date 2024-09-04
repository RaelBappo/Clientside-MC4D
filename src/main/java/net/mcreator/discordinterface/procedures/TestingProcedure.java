package net.mcreator.discordinterface.procedures;

import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
import club.minnced.discord.webhook.send.WebhookMessage;
import club.minnced.discord.webhook.WebhookClient;

public class TestingProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		WebhookClient client = WebhookClient.withUrl("https://discord.com/api/webhooks/1243737230342750208/sDFuh80GiXghfZPDI5JTdlVg354A70DIZ7s7G_MrwJPyUz94QGu19CqCXZaWVsiAnjqy");
		client.send("hi");
	}
}
