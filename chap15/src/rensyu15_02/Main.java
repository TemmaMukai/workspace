package rensyu15_02;

public class Main {
	public static void main(String[] args) {
		concatPath("c:\javadev", "\")
	}

		public String concatPath(String folder, String file) {
			if (!folder.endsWith("\\")) {
				folder += "\\";
			}
			return folder + file;
		}
	}


