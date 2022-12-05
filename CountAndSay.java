class Solution{
    public String countAndSay(int n) {
if (n == 1) {
return "1";
} else {
String lastTerm = countAndSay(n - 1);
StringBuilder result = new StringBuilder();
int i = 0;
while (i < lastTerm.length()) {
int count = 1;
while (i < lastTerm.length() - 1 && lastTerm.charAt(i) == lastTerm.charAt(i + 1)) {
count += 1;
i += 1;
}
result.append(count).append(lastTerm.charAt(i));
i += 1;
}
return result.toString();
}
}
}
