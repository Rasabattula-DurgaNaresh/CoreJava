package com.designpattern.behavioural.command;
/**
 * 
 * @author pardeshi_n
 *Our file system utility implementation is ready and we can move to write a simple client program 
 *but before that I will provide a utility method to create the appropriate FileSystemReceiver object. 
 *Since we can use System class to get the operating system information, 
 *we will use this or else we can use Factory pattern to return appropriate type based 
 *on the input from client program.
 */
public class FileSystemReceiverUtil {
	public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
   }
}
