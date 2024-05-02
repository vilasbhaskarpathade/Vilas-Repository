import java.io.File;


class FileFolderExample
{
    int ileCounter;
    int folderCounter;

    public static void main(String args[])
    {
	System.out.println("Hi....");
	FileFolderExample ffe = new FileFolderExample();
	ffe.setNumber0ffilesAnsfolders("/home/vilas/Desktop");
    }
    public void setNumber0ffilesAnsfolders(String path)
    {
    File file = new File(path);   
	System.out.println(file.getName());
	System.out.println(file.getParent());
	System.out.println(file.listFiles().length);
    
    }

}