/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilatron6000;

import java.io.*;

public class FileFilter implements FilenameFilter
{  
  public boolean accept(File dir, String name)
  {
	if(name.endsWith(".java"))
	{
	  return true;
	}
	else
	{
	  return false;
	}
  }
}