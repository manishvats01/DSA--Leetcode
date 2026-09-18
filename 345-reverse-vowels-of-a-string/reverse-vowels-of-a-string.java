class Solution {
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int n =s.length();
        int i=0;
        int j= n-1;
    while (i<j){
        if (! isVowel (arr[i])){
            i++;
        }
        else if (! isVowel( arr[j])){
            j--;
        }
        else{
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        }
        return new String (arr);
    }
    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
