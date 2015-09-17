import java.io.FileInputStream;

public class File {

    private String fileType;
    private Byte[] content;
    private double size;

    public File(String path) {
        java.io.File myfile = new java.io.File(path);
        size = myfile.length();
        content = new Byte[(int)size];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(myfile);
            for (int i=0; i<size; ++i) {
                content[i] = (byte)fis.read();
            }
            fis.close();
        } catch (Exception e) {
            System.err.println("Sorry, the file could not be retrieved :(");
        }
        fileType = "";
        int i = path.lastIndexOf('.');
        int p = Math.max(path.lastIndexOf('/'), path.lastIndexOf('\\'));
        if(i>p) {
            fileType = path.substring(i+1);
        }
    }

    public String getFileType() {
        return fileType;
    }

    public Byte[] getContent() {
        return content;
    }

    public double getSize() {
        return size;
    }

    public static void main(String[] args) {
        File exp = new File("src/text.txt");
        Byte [] cont = exp.getContent();
        System.out.println(exp.getFileType());
        System.out.println(exp.getSize());
    }
}