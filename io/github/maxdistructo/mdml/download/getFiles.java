package io.github.maxdistructo.mdml.download;

import io.github.maxdistructo.Main;
import io.github.maxdistructo.reader.*;
import io.github.maxdistructo.update.*;
import java.io.*;

public class getFiles{
  public static void init(){
    int stor = 0;
    boolean check;
    if(new File("/config/maxdistructo/mdml/dev/0.1/").exists(){
      Download.getFromGithub("maxdistructo", "mdml", "0.1", "dev" , ".cfg");
    }
    else{
      new File("~/config/maxdistructo/mdml/dev/0.1/").mkdirs();
        Download.getFromGithub("maxdistructo","mdml","0.1","dev", ".cfg");
    }
 
    ReaderArray.ReaderArray("/config/maxdistructo/mdml/dev/0.1/mdml-0.1.cfg", 1, Main.modIDs);
    ReaderArray.ReaderArray("/config/maxdistructo/mdml/dev/0.1/mdml-0.1.cfg", 2, Main.devs);
    ReaderArray.ReaderArray("/config/maxdistructo/mdml/dev/0.1/mdml-0.1.cfg", 3, Main.versions);
    ReaderArray.ReaderArray("/config/maxdistructo/mdml/dev/0.1/mdml-0.1.cfg", 4, Main.types);
    ReaderArray.ReaderArray("/config/maxdistructo/mdml/dev/0.1/mdml-0.1.cfg", 5, Main.files);
    updateCheck.checkSpecific("mdml", "maxdistructo", "dev", ".cfg", check);
    
    if(check){
      System.out.println("HEY! New version of MDML is avaiable at https://maxdistructo.github.com/mdml/dev/versions.html");
    }
    else(){
      System.out.println("MDML is Up To Date.");
    }
    
while(!Main.modIDs[stor].equals(null)){
  if(new File("~/config/" + Main.devs[stor] + "/" + Main.modIDs[stor] + "/" + Main.types[stor] + "/" + Main.versions[stor]).exists()){
    Download.getFromGithub(Main.devs[stor],Main.modIDs[stor], Main.versions[stor],Main.types[stor],Main.files[stor]);
    
  }
  else{
    new File("~/config/" + Main.devs[stor] + "/" + Main.modIDs[stor] + "/" + Main.types[stor] + "/" + Main.versions[stor]).mkdirs();
    Download.getFromGithub(Main.devs[stor],Main.modIDs[stor], Main.versions[stor],Main.types[stor],Main.files[stor]);
  }
    stor++;
}

  }
}
