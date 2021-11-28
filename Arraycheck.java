 class Arraycheck{
	public static void main(String[] args){
		String s="lachi";
		String t="siva";
		int x=t.length();
		int n=s.length();
		char[] ch=s.toCharArray();
		char[] ch2=t.toCharArray();
		for(int i=0;i<n;i++){
		     for(int j=0;j<x;j++){
			if((ch[i]==ch2[j])&&(i!=n-1)){
			     for(int k=i;k<n-1;k++){
				ch[k]=ch[k+1];
				if(k==n-2){
					ch[k+1]=0;
					n=n-1;
				}
		 	     }
			}
			else if((ch[i]==ch2[j])&&(i==n-1)){	
				ch[n-1]=0;
				n=n-1;
			} 
			if((ch[i]==ch2[j])&&(j!=x-1)){
			     for(int k=j;k<x-1;k++){
				ch2[k]=ch2[k+1];
				if(k==x-2){
					ch2[k+1]=0;
					x=x-1;
				}
			     }
			}
			else if((ch[i]==ch2[j])&&(j==x-1))
		 		ch2[x-1]=0;
				x=x-1;
		      }
		}
		s=String.valueOf(ch);
		t=String.valueOf(ch2);
		System.out.println(s+" "+t);
	}
}