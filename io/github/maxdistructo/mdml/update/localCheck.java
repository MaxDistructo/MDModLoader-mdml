package io.github.maxdistructo.update;
import java.io.File;

public class localCheck{
  public static void startCheck(String dev, String modId, String version, String type, String file, boolean var){
    while(!modId.equals(null)){
      File f = new File("/config/" + dev + "/" + modId + "/" + type + "/"  modId + "-" + version + file);
      updateCheck.checkSpecific(modId, dev, type, file, var);
    }
  }
}