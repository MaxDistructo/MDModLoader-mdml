package io.github.maxdistructo.update;
import io.github.maxdistructo.Main;
import io.github.maxdistructo.download.Download;
import io.github.maxdistructo.reader.reader;
public class updateCheck{
  public static void startCheck(String dev, String type, String modId, String update, String file){
    int cntr = 0;
    String ver;
    while(!Main.modIDs[cntr].equals(null)){
     Download.getFromGithub(Main.devs[cntr], Main.modIDs[cntr], "update", Main.types[cntr], Main.files[cntr]);
     reader.reader("/config/" + dev + "/" + modId + "/" + type + "/" + modId + "-" + update + file, 0, ver);
     if(!ver.equals(Main.versions[cntr])){
       Minecraft.getMinecraft().thePlayer.sendChatMessage("Mod " + Main.modIDs[cntr] + " has a new version!!");
       Minecraft.getMinecraft().thePlayer.sendChatMessage("Change the version in the config for this mod to " + ver + " to get the new update!");
     }
     else{
       Minecraft.getMinecraft().thePlayer.sendChatMessage("The Mod " + Main.modIDs[cntr] + " is up to date");
     }
    }
    
  }
  public static void checkSpecific(String modId, String dev, String type, String file, boolean bool){
    int cntr = 0;
    String ver;
     Download.getFromGithub(dev, modId, "update", type, file);
     reader.reader("/config/" + dev + "/" + modId + "/" + type + "/"  modId + "-update" + file, 0, ver);
     if(ver.equals(Main.versions[cntr])){
      bool = true;
     }
     else{
      bool = false;
     }
  }
}