import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Hashtable;

public class generateNewBookFile {
	public static void writeFile() throws IOException {
		File file1 = new File("./authors.txt");
		Writer bw = new BufferedWriter(new FileWriter(file1));

		// fw.write("mathumitha");
		// fw.close();
	}

	public static void main(String[] args) throws IOException {
		String fileName = "/Users/Nivi/Desktop/books.csv";
		Hashtable<String, Integer> names = new Hashtable<String, Integer>();
		Hashtable<String, Integer> authorisbnnames = new Hashtable<String, Integer>();
		// This will reference one line at a time
		String line = null;
		// writeFile();
		// fw.append('m');
		try {

			// bw.write("inside");
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			File file1 = new File("./authors.txt");
			Writer bw = new BufferedWriter(new FileWriter(file1));
			Integer authorid = 0;
			int i = 0, newid=0;
			while ((line = bufferedReader.readLine()) != null) {
				// System.out.println(line);
				if (i == 0 || line == " ") {
					i++;
					continue;
				}
				String[] tokens = line.split("\t");
				for(int j = 0; j<tokens.length; j++)
				{
					//if(tokens[0].equals("2266029460")){
					if(j==3){
						String[] authortokens = tokens[3].split(",");
						//process the authors
						
						System.out.println("authortokens.length="+authortokens.length);
						for(int k = 0; k< authortokens.length; k++)
						{
							if(authorisbnnames.containsKey(tokens[0]+","+authortokens[k])){continue;}
							System.out.println("authortokens[k]"+authortokens[k]);
							if(names.containsKey(authortokens[k])) {//if name is already there get the id
								 newid = names.get(authortokens[k]);
								 
							}
							else//if names does not contain the author generate a new id and add to the hashMap
							{
								authorid++;
								names.put(authortokens[k], authorid);
								newid = authorid;
							}
							authorisbnnames.put(tokens[0]+","+authortokens[k],1);
							System.out.println("newid="+newid+"isbn="+tokens[0]);
							bw.write(tokens[0]);
							bw.write(",");
							bw.write(String.valueOf(newid));
							bw.write(",");
							String[] authorname = authortokens[k].split(" ");
							// System.out.println("length="+authorname.length);
							//System.out.println(authorname[0]);
							bw.write(authorname[0]);
							bw.write(",");
							int h = 1;
							// System.out.println("middle name:");
							String middlename = "";
							while (h < authorname.length - 1) {
								middlename = middlename + authorname[h] + " ";
								// System.out.print(authorname[h]+" ");
								h++;
							}
							bw.write(middlename.trim());
							bw.write(",");

							bw.write(authorname[authorname.length - 1]);
							bw.write(",");
							bw.write(authortokens[k]);
							// System.out.println();
							// System.out.println(authorname[authorname.length-1]);

							bw.write("\n");
						}
					}
				}
				
			}

			// Always close files.
			bufferedReader.close();
			bw.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}

	}

}