class RomanToInteger {
    public static int value(char i) {
        switch (i) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToInt(String str) {
        int size = str.length();
        int val = value(str.charAt(size - 1));
        for (int i = size - 2; i >= 0; i--) {
            if (value(str.charAt(i)) < value(str.charAt(i + 1))) {
                val -= value(str.charAt(i));
            } else {
                val += value(str.charAt(i));
            }
        }
        return val;
    }

    public static void main(String[] args) {
        String str = "LVIII";
        int result = romanToInt(str);
        System.out.println("Roman to Integer is: " + result);
    }
}