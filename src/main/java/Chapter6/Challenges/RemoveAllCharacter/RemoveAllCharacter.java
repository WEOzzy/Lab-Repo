package Chapter6.Challenges.RemoveAllCharacter;

public class RemoveAllCharacter {
    /**
     * Return a String that has all the character of a String removed.
     * @param str
     * @param ch
     * @return str, without any characters of type ch.
     */
    public String removeAll(String str, String ch){
        StringBuilder sb = new StringBuilder();
        String[] splitArr = str.split(ch);
        for (int i = 0; i < splitArr.length; i++) {
            sb.append(splitArr[i]);
        }
        return sb.toString();
    }
}