package io.github.maxdistructo.mdml.download;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Download{
	public static void getFromGithub(String dev, String modId, String version, String type, String file){
  try {
		URL website = new URL("https://" + dev + "github.io/" + modId + "/" + type + "/" + version + "/" + modId + "-" + version + file);
		  ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		  @SuppressWarnings("resource")
		FileOutputStream fos = new FileOutputStream("/config/" + dev + "/" + modId + "/" + type + "/"  modId + "-" + version + file);
	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public static void getTextureFromWeb(String url, String name, String type, String dev, String modId){
try {
	URL website = null;
try {
	website = new URL(url);
} catch (MalformedURLException e) {
	e.printStackTrace();
	}
	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	@SuppressWarnings("resource")
	FileOutputStream fos = new FileOutputStream("/assets/" + dev + "/" + modId+"/" + name + type);
	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public static void getFromWeb(String url, String name, String type, String dev, String modId){
	URL website = null;
	try {
		website = new URL(url);
	} catch (MalformedURLException e1) {
		e1.printStackTrace();
	}
  ReadableByteChannel rbc;
  FileOutputStream fos;
try {
	rbc = Channels.newChannel(website.openStream());
	  fos = new FileOutputStream("/files/" + dev + "/" + modId+"/" + name + type);
	  fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}
