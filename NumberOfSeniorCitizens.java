class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            int age = ((details[i].charAt(11) - 48) * 10) + (details[i].charAt(12) - 48);  
            if (age > 60) count++;
        }
        return count;
    }
}
