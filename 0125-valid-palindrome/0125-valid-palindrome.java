class Solution {
    public boolean isPalindrome(String s) {
        //Remove the commas and other non-alphanumeric characters
        //Remove the spaces
        s = s.toLowerCase();

        //Iterate all the way through s, and only keep the letters
        //create a new string out of those letters
        String newString = "";
        for (int i=0; i<s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){ //non alphabetal characters
                newString += s.charAt(i);
            }
        }

        //check if the first index and last index are the same
        //Keep going in the for loop and stop if to does not read the same forward and backword
        for (int i=0; i<newString.length(); i++){
            if (newString.charAt(i) != newString.charAt(newString.length()-1-i)){
                return false;
            }

            if (i>newString.length()-1-i){
                break;
            }
        }
        return true;
    }
}