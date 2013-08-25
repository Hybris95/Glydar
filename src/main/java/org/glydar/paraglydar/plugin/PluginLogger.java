package org.glydar.api.plugin;

import org.glydar.glydar.Glydar;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class PluginLogger extends Logger {

	private Plugin plugin;

	public PluginLogger(Plugin plugin) {
		super(plugin.getClass().getCanonicalName(), null);
		this.plugin = plugin;
		setParent(Glydar.getServer().getLogger());
		setLevel(Level.ALL);
	}

	public void log(LogRecord log) {
		log.setMessage("[" + plugin.getName() + "] " + log.getMessage());
		super.log(log);
	}
}
