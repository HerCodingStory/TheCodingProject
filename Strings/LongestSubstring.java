import java.util.*;  
// Given a string, find the length of the longest 
// substring without repeating characters. Example:
// Input = abccabb, Output = 3

///// UMPIRE /////
/// Understand:
// Is the substring contiguous? Yes look for a substring and not a subsequent
// substring [abc]bbd VS subsequent [abc]bb[d]
// Does case sensitive matter?  No
// Can the substring overlap? Yes

/// Match:
// "abccabb" returns 3 [abc and cab]
// "cccccc" returns 1 [c]
// "" returns 0
// "abcbda" returns 4 [cbda]

/// Plan:
// Solution 1 = 
// Solution 2 =


/// Implement:
// Solution 1:
class LongestSubstring {

  public static int longestSubstringSol1(String str) {
    /// Test Cases =
    // "abccabb" returns 3 [abc and cab]
    // "cccccc" returns 1 [c]
    // "" returns 0
    // "abcbda" returns 4 [cbda]

    int longest = 0;
    ArrayList<Character> arr;

    if (str.length() <= 1)
      return str.length();

    for (int i = 0; i < str.length(); i++) {
      arr = new ArrayList<Character>();
      for (int j = i; j < str.length(); j++) {
        if (!arr.contains(str.charAt(j))) {
          arr.add(str.charAt(j));
          longest = Math.max(arr.size(), longest);
        } 
        else {
          break;
        }
        //System.out.println(arr);
      } 
    }

    return longest;
  }

/// Review - Solution 1:
// *Check for mistakes
// *Walkthough code

/// Evaluate - Solution 1:
// *Check if input scales up
// Time Complexity = O(n^2)
// Space Complexity = O(n)

  public static int longestSubstringSol2(String str) {
    /// Test Cases =
    // "abccabb" returns 3 [abc and cab]
    // "cccccc" returns 1 [c]
    // "" returns 0
    // "abcbda" returns 4 [cbda]
    int longest = 0;
    

    
    return longest;
  }

/// Review - Solution 2:
// *Check for mistakes
// *Walkthough code

/// Evaluate - Solution 2:
// *Check if input scales up
// Time Complexity = 
// Space Complexity = 
}