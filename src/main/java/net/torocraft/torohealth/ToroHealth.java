package net.torocraft.torohealth;

import java.util.Random;
import net.fabricmc.api.ModInitializer;
import net.torocraft.torohealth.config.Config;
import net.torocraft.torohealth.config.loader.ConfigLoader;
import net.torocraft.torohealth.display.Hud;
import net.torocraft.torohealth.util.RayTrace;


/*
 * - look into TOML support
 * 
 * - improved particles (add heal, color support, and hang in air longer
 * 
 * - a inworld settings to show full bar stats
 * 
 * - remove inworld bar from main player
 * 
 * - remove inworld bar from entity display in hud
 * 
 * - hearts mode
 * 
 */
public class ToroHealth implements ModInitializer {

  public static final String MODID = "torohealth";


  public static Config CONFIG = new Config();
  public static Hud HUD = new Hud();
  public static RayTrace RAYTRACE = new RayTrace();
  public static boolean IS_HOLDING_WEAPON = false;
  public static Random RAND = new Random();

  private static ConfigLoader<Config> CONFIG_LOADER = new ConfigLoader<>(new Config(),
      ToroHealth.MODID + ".json", config -> ToroHealth.CONFIG = config);

  @Override
  public void onInitialize() {
    CONFIG_LOADER.load();
  }
}
