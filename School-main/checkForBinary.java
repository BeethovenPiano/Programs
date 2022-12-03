class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  boolean is_binary=true;
	  for(int i=0;i<str.length();i++){
	      if(str.charAt(i)!='0' && str.charAt(i)!='1'){
	          is_binary=false;
	      }
	  }
	  return is_binary;
	}
}
