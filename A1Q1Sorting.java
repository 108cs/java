class Main{
    public static void main(String[] args) {
      String str ="Chaitanya";
      
      char chars[]=str.toCharArray();
      char temp=0;
      for(int i =0;i<chars.length;i++){
          for(int j =0;j<chars.length;j++){
              if(chars[j]>chars[i])
          temp=chars[i];
          chars[i]=chars[j];
          chars[j]=temp;
          }
      }
      System.out.println("After Sorting: ");
      for(int k =0;k<chars.length;k++){
          System.out.print(chars[k]);
    }
}
}
