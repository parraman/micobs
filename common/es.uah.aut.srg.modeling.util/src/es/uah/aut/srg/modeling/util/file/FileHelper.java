/*******************************************************************************
 * Copyright (c) 2013-2015 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.modeling.util.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class FileHelper {
	
	/**
	 * Compare two input streams.
	 * 
	 * If an error occurs when reading the streams, the method
	 * will throw an {@link IOException}.
	 * 
	 * @param input1 first input stream.
	 * @param input2 second input stream.
	 * @return <code>true</code> if the streams are equal and
	 * <code>false</code> otherwise.
	 */
	public static boolean compare( InputStream input1,
            InputStream input2 ) throws IOException {
	
		boolean error = false;
		try {
			byte[] buffer1 = new byte[1024];
			byte[] buffer2 = new byte[1024];
			try {
				int numRead1 = 0;
				int numRead2 = 0;
				while (true) {
					numRead1 = input1.read(buffer1);
					numRead2 = input2.read(buffer2);
					if (numRead1 > -1) {
						if (numRead2 != numRead1)
						{
							return false;
						}
						if (!Arrays.equals(buffer1, buffer2))
						{
							return false;
						}
					}
					else
					{
						return numRead2 < 0;
					}
				}
			} finally {
				input1.close();
			}
		} catch (IOException e) {
			error = true;
			throw e;
		} catch (RuntimeException e) {
			error = true;
			throw e;
		} finally {
			try {
				input2.close();
			} catch (IOException e) {
				if (!error) throw e;
			}
		}
	}
	
	/**
	 * Loads an input stream to a file located in the system's
	 * temporary folder.
	 * 
	 * If an error occurs when loading the stream or when storing
	 * the file, the method will throw either a {@link CoreException}
	 * or an {@link IOException}.
	 * 
	 * @param istream the input stream.
	 * @prefix the prefix string to be used in generating the file's name;
	 * must be at least three characters long.
	 * @suffix the suffix string to be used in generating the file's name; 
	 * may be null, in which case the suffix ".tmp" will be used
	 * @return the Java file.
	 */
	public static File loadFileOnTmp(InputStream istream, 
			String prefix, String suffix) throws CoreException, IOException
	{
		byte[] bytes = new byte[4092];
		File tmp = null;

		tmp = File.createTempFile(prefix, suffix);
		tmp.deleteOnExit();
		FileOutputStream fos = new FileOutputStream(tmp);
		int ch;
		while (true) {
			ch = istream.read(bytes);
			if (ch == -1) {
				break;
			}
			fos.write(bytes, 0, ch);
		}
		fos.close();
		return tmp;
	}
	
	/**
	 * Makes a copy of a binary file.
	 * 
	 * If an error occurs when reading the streams, the method
	 * will throw an {@link IOException}.
	 * 
	 * @param sourceFilename a pathname string with the reference to the
	 * source file.
	 * @param destFilename a pathname string with the reference to the
	 * destination file.
	 * @throws IOException
	 */
	public static void copyBinaryFile(String sourceFilename, String destFilename) throws IOException {
		byte[] bytes = new byte[4092];
		if (sourceFilename != null && destFilename != null) {
			File file = new java.io.File(sourceFilename);
			if (file.isFile()) {
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(destFilename);
				int ch;
				while (true) {
					ch = fis.read(bytes);
					if (ch == -1) {
						break;
					}
					fos.write(bytes, 0, ch);
				}
				fis.close();
				fos.close();
			}
		}
	}
	
	/**
	 * Makes a copy of a binary file.
	 * 
	 * If an error occurs when reading the source file or
	 * storing the contents in the destination file, the method
	 * will throw an {@link IOException}.
	 * 
	 * @param source the path that references the source file.
	 * @param destFilename a pathname string with the reference to the
	 * destination file.
	 * @throws IOException
	 */
	public static void copyBinaryFile(IPath source, String destFilename) throws IOException {
		byte[] bytes = new byte[4092];
		if (source != null && destFilename != null) {
			File file = source.toFile();
			if (file.isFile()) {
				FileInputStream fis = new FileInputStream(file);
				FileOutputStream fos = new FileOutputStream(destFilename);
				int ch;
				while (true) {
					ch = fis.read(bytes);
					if (ch == -1) {
						break;
					}
					fos.write(bytes, 0, ch);
				}
				fis.close();
				fos.close();
			}
		}

		
	}
	
	/**
	 * Loads a binary file into an array of bytes.
	 * 
	 * If an error occurs when reading the source file, the method
	 * will throw an {@link IOException}.
	 * 
	 * @param file the file to be read.
	 * @return the array of bytes with the contents of the file.
	 */
	public static byte[] loadBinaryFile(File file) throws IOException
	{
		if (!file.exists())
		{
			return null;
		}
		
		int length = (int) file.length();
		
		byte[] buffer = new byte[length];

		FileInputStream fis = new FileInputStream(file);
	    int offset = 0;
	      for(;;) {
	        int remain = length - offset;
	        if(remain <= 0) {
	          break;
	        }
	        int numRead = fis.read(buffer, offset, remain);
	      offset += numRead;
	      }
	    fis.close();
		return buffer;
		
	}

	/**
	 * Creates a new folder in a container folder.
	 * @param rootFolder the container folder where the new folder will
	 * be created.
	 * @param folder the name of the new folder.
	 */
	public static void createFolder(IContainer rootFolder, String folder) {
		
		if ((folder == null) || (folder.length() == 0))
		{
			return;
		}
		
		IPath path = new Path(folder);

		try {
			for (int i=1;i<=path.segmentCount();i++) {
				IFolder subfolder = rootFolder.getFolder(path.uptoSegment(i));
				if (!subfolder.exists()) {
					subfolder.create(true, true, null);
				}
			}
		} catch (Exception e) {
		}	
	}

	/**
	 * Creates a new folder in the file system
	 * @param folder the pathname of the new folder.
	 */
	public static void createFolder(String folder) {
		
		File newDirectory = new File(folder);
		if (!newDirectory.exists())
		{
			newDirectory.mkdirs();
		}
	}
	
	/**
	 * Deletes a file from the file system.
	 * @param filename the pathname of the file to erase.
	 * @return <code>true</code> if and only if the file is
	 * successfully deleted; <code>false</code> otherwise.
	 */
	public static boolean deleteFile(String filename) {
		
		File file2Delete = new File(filename);
		
		return file2Delete.delete();
	}

	/**
	 * Deletes a folder from the file system. The method recursively
	 * deletes the contents of the folder and then the folder itself.
	 * 
	 * @param filename the pathname of the folder to erase.
	 * @return <code>true</code> if and only if the folder is
	 * successfully deleted; <code>false</code> otherwise.
	 */
	public static boolean deleteFolder(String folder) {

		File folder2Delete = new File(folder);

		if( folder2Delete.exists() ) 
		{
			File[] files = folder2Delete.listFiles();
		    for(int i=0; i<files.length; i++) 
		    {
		    	if(files[i].isDirectory()) 
		    	{
		    		deleteFolder(files[i].getPath());
		        }
		        else 
		        {
		        	files[i].delete();
		        }
		    }
		}
	    return( folder2Delete.delete() );
	}

	/**
	 * Saves an array of bytes to a file in the file system.
	 * 
	 * If an error occurs when storing the data, the method
	 * will throw an {@link IOException}.
	 * 
	 * @param file the Java file object where the bytes will be 
	 * stored.
	 * @param buffer the array of bytes.
	 */
	public static void saveToFile(File file, byte[] buffer) throws IOException {
	      FileOutputStream out = new FileOutputStream(file);
	      try {
	        out.write(buffer);
	      } finally {
	        out.close();
	      }
		
	}
}
