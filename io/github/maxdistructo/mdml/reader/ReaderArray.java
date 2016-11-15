package io.github.maxdistructo.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import net.minecraft.item.Item;

public class ReaderArray {
	public static void ReaderArray(String file, int lineNum, String[] var){
		try {
		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
		    int counter = 0;
		    ArrayList<String> list = new ArrayList<String>();
		    for (String line; (line = br.readLine()) != null;) {
		        counter++;

		        if (counter > lineNum) {
		            line = line.trim();
		            list.addAll(Arrays.asList(line.split("\\s*,\\s*")));
		        }
		    }

		    var = new String[list.size()];
		    var = list.toArray(var);

		    for (int i = 0; i < var.length; i++) {
		        System.out.println(var[i]);
		    }
		} catch(Exception e) {
		    System.out.println(e);
		}
}
	public static void StringArray(String file, int lineNum, String[] var){
		try {
		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
		    int counter = 0;
		    ArrayList<String> list = new ArrayList<String>();
		    for (String line; (line = br.readLine()) != null;) {
		        counter++;

		        if (counter > lineNum) {
		            line = line.trim();
		            list.addAll(Arrays.asList(line.split("\\s*,\\s*")));
		        }
		    }

		    var = new String[list.size()];
		    var = list.toArray(var);

		    for (int i = 0; i < var.length; i++) {
		        System.out.println(var[i]);
		    }
		} catch(Exception e) {
		    System.out.println(e);
		}
}
	public static void FloatArray(String file, int lineNum, Float[] var){
		try {
		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
		    int counter = 0;
		    ArrayList<String> list = new ArrayList<String>();
		    for (String line; (line = br.readLine()) != null;) {
		        counter++;

		        if (counter > lineNum) {
		            line = line.trim();
		            list.addAll(Arrays.asList(line.split("\\s*,\\s*")));
		        }
		    }

		    var = new Float[list.size()];
		    var = list.toArray(var);

		    for (int i = 0; i < var.length; i++) {
		        System.out.println(var[i]);
		    }
		} catch(Exception e) {
		    System.out.println(e);
		}
}
	public static void ItemArray(String file, int lineNum, Item[] var){
		try {
		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
		    int counter = 0;
		    ArrayList<String> list = new ArrayList<String>();
		    for (String line; (line = br.readLine()) != null;) {
		        counter++;

		        if (counter > lineNum) {
		            line = line.trim();
		            list.addAll(Arrays.asList(line.split("\\s*,\\s*")));
		        }
		    }

		    var = new Item[list.size()];
		    var = list.toArray(var);

		    for (int i = 0; i < var.length; i++) {
		        System.out.println(var[i]);
		    }
		} catch(Exception e) {
		    System.out.println(e);
		}
}
	public static void IntArray(String file, int lineNum, Integer[] var){
		try {
		    @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
		    int counter = 0;
		    ArrayList<String> list = new ArrayList<String>();
		    for (String line; (line = br.readLine()) != null;) {
		        counter++;

		        if (counter > lineNum) {
		            line = line.trim();
		            list.addAll(Arrays.asList(line.split("\\s*,\\s*")));
		        }
		    }

		    var = new Integer[list.size()];
		    var = list.toArray(var);

		    for (int i = 0; i < var.length; i++) {
		        System.out.println(var[i]);
		    }
		} catch(Exception e) {
		    System.out.println(e);
		}
}

}
